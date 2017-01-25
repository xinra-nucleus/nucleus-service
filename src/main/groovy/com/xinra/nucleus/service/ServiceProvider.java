package com.xinra.nucleus.service;

/**
 * Used to access the service layer.
 * 
 * @author Erik Hofer
 */
public interface ServiceProvider {
  
  /**
   * Returns an instance of the desired service.
   */
  public <T extends Service> T getService(Class<T> type);

}
