package com.xinra.nucleus.service.test

import com.xinra.nucleus.service.DtoImpl
import groovy.transform.CompileStatic

@CompileStatic
class TestDtoImpl extends DtoImpl implements TestDto {
  
  def int foo;
  def boolean bar;

}
