package com.xinra.nucleus.service;

import com.xinra.nucleus.service.DtoFactory;
import com.xinra.nucleus.service.DynamicProxyDtoFactory;
import com.xinra.nucleus.service.ImplDtoFactory;
import com.xinra.nucleus.service.TestDto;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests basic functionality (setting and getting properties) of
 * DTOs created by different factories.
 * 
 * @author Erik Hofer
 */
@RunWith(Parameterized.class)
public class TestBasicDtoFunctionality {

  /**
   * Creates the DTO factories.
   */
  @Parameters(name = "{index}: {0}")
  public static Iterable<? extends DtoFactory> data() {
    return Arrays.asList(
          new DynamicProxyDtoFactory(),
          new ImplDtoFactory()
        );
  }
  
  @Parameter
  public DtoFactory dtoFactory;
  
  @Test
  public void test() {
    
    TestDto dto = dtoFactory.createDto(TestDto.class);
    
    dto.setFoo(5);
    assert dto.getFoo() == 5;
    
    dto.setBar(true);
    assert dto.getBar();
    assert dto.isBar();
    
  }
  
}
