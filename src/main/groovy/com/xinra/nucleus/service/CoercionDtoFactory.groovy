package com.xinra.nucleus.service

/**
 * Uses an upstream {@link DtoFactory} to create the DTO and coerces it to the
 * desired type using Groovy's as-coercion. This way, the implementing class doesn't
 * need to actually (i.e. via {@code implements} keyword) implement the DTO interface.
 * 
 * @author Erik Hofer
 */
class CoercionDtoFactory implements DtoFactory {
  
  private DtoFactory upstream;
  
  public CoercionDtoFactory(DtoFactory upstream) {
    Objects.requireNonNull(upstream);
    this.upstream = upstream;
  }

  @Override
  public <T extends Dto> T createDto(Class<T> type) {
    return upstream.createDto(type).asType(type);
  }

}
