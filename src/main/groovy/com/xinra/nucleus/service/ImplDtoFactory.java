package com.xinra.nucleus.service;

/**
 * For the interface {@code package.SomeDto} the class {@code package.SomeDtoImpl} is instantiated.
 * 
 * @author Erik Hofer
 */
public class ImplDtoFactory implements DtoFactory {

  @SuppressWarnings("unchecked")
  @Override
  public <T extends Dto> T createDto(Class<T> type) {
    String className = type.getPackage().getName() + "." + type.getSimpleName() + "Impl";
    try {
      return (T) Class.forName(className).newInstance();
    } catch (Exception ex) {
      throw new RuntimeException("DTO could not be created: " + className);
    }
  }

}
