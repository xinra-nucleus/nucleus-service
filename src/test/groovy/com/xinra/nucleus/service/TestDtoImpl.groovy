package com.xinra.nucleus.service

import com.xinra.nucleus.service.DtoImpl
import com.xinra.nucleus.service.TestDto
import groovy.transform.CompileStatic

@CompileStatic
class TestDtoImpl extends DtoImpl implements TestDto {
  
  def int foo;
  def boolean bar;

}
