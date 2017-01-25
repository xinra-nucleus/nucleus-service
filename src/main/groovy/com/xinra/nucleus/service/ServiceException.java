package com.xinra.nucleus.service;

/**
 * Checked exception that is thrown by services in case of any error. All other exceptions
 * a service wants to throw should be wrapped in a ServiceException.
 * 
 * @author Erik Hofer
 */
public class ServiceException extends Exception {
  private static final long serialVersionUID = 1L;
  
  /**
   * See {@link Exception#Exception()}.
   */
  public ServiceException() {
    super();
  }

  /**
   * See {@link Exception#Exception(String)}.
   */
  public ServiceException(String message) {
    super(message);
  }

  /**
   * See {@link Exception#Exception(String, Throwable)}.
   */
  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * See {@link Exception#Exception(Throwable)}.
   */
  public ServiceException(Throwable cause) {
      super(cause);
  }
}
