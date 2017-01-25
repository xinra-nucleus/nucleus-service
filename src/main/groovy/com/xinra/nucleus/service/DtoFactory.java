package com.xinra.nucleus.service;

/**
 * Used to create DTOs in the front-end and service layer.
 * 
 * @author Erik Hofer
 */
public interface DtoFactory {
  
  /**
   * Creates a DTO instance of the desired type.
   */
  public <T extends Dto> T createDto(Class<T> type);

}
