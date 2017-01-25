package com.xinra.nucleus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Delegates service retrieval to the Spring container.
 * 
 * @author Erik Hofer
 */
@Component
public class SpringServiceProvider implements ServiceProvider {
  
  ApplicationContext applicationContext;

  public SpringServiceProvider(@Autowired ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  @Override
  public <T extends Service> T getService(Class<T> type) {
    return applicationContext.getBean(type);
  }

}
