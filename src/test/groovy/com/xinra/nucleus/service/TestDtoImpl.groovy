package com.xinra.nucleus.service

import com.xinra.nucleus.service.DtoImpl
import com.xinra.nucleus.service.TestDto
import groovy.transform.CompileStatic

/**
 * Annotation processing for groovy tests is currently broken.
 * See https://github.com/tbroyer/gradle-apt-plugin/issues/49
 */
@CompileStatic
class TestDtoImpl2 extends DtoImpl implements TestDto {
  
  def int foo;
  def boolean bar;

}
