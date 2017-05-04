package com.xinra.nucleus.service;

public class TestDtoImpl extends DtoImpl implements TestDto {
  
  private int foo;
  private boolean bar;
  
  
  public int getFoo() {
    return foo;
  }
  
  public void setFoo(int foo) {
    this.foo = foo;
  }
  
  public boolean getBar() {
    return bar;
  }
  
  public boolean isBar() {
    return bar;
  }
  
  public void setBar(boolean bar) {
    this.bar = bar;
  }
}
