package com.xinra.nucleus.service;

import com.xinra.nucleus.interfacegenerator.GenerateInterface;
import com.xinra.nucleus.interfacegenerator.InterfaceNamingStrategy;

/**
 * Superclass for service implementations that generate their interface.
 * 
 * @author Erik Hofer
 */
@GenerateInterface(namingStrategy = InterfaceNamingStrategy.EXCEPT_LAST_FOUR_CHARS)
public class ServiceImpl implements Service {

}
