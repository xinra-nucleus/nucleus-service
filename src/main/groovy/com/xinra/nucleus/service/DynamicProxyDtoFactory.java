package com.xinra.nucleus.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Creates dynamic proxies instead of using actual implementations of DTO interfaces.
 * The proxy manages all properties in a map according to the getter and setter names.
 * 
 * @author Erik Hofer
 */
public class DynamicProxyDtoFactory implements DtoFactory {

  @SuppressWarnings("unchecked")
  @Override
  public <T extends Dto> T createDto(Class<T> type) {
    return (T) Proxy.newProxyInstance(
        type.getClassLoader(),
        new Class<?>[] { type },
        new DynamicProxy(type.getSimpleName())
      );
  }
  
  private static class DynamicProxy implements InvocationHandler {
      
    private Map<String, Object> properties = new HashMap<>();
    private String typeName;
      
    public DynamicProxy(String typeName) {
      this.typeName = typeName;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      if (method.getName().startsWith("set")) {
        properties.put(method.getName().substring(3), args[0]);
        return null;
      } else if (method.getName().startsWith("get")) {
        return properties.get(method.getName().substring(3));
      } else if (method.getName().startsWith("is")) {
        return properties.get(method.getName().substring(2));
      } else if (method.getName().equals("equals")) {
        return proxy == args[0];
      } else if (method.getName().equals("hashCode")) {
        return System.identityHashCode(proxy);
      } else if (method.getName().equals("toString")) {
        return toString();
      } else {
        throw new IllegalStateException(String.valueOf(method));
      }
    }

    @Override
    public String toString() {
      return "DynamicProxy of " + typeName + " [" 
          + properties.entrySet().stream()
            .map(entry -> entry.getKey() + "=" + entry.getValue())
            .collect(Collectors.joining(", "))
          + "]";
    }   
  }
}
