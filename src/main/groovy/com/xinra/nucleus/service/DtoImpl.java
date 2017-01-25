package com.xinra.nucleus.service;

import com.xinra.nucleus.interfacegenerator.GenerateInterface;
import com.xinra.nucleus.interfacegenerator.InterfaceNamingStrategy;

/**
 * Superclass of all DTOs (data transfer objects).
 * 
 * <p>DTOs are used to transfer data between the service and front-end layer instead of using
 * entities in the front-end.</p>
 * 
 * <p>DTOs must comply with the bean naming conventions and provide a parameterless constructor.</p>
 * 
 * <p>Additionally, all properties must have a corresponding string constant with the same name
 * (starting with a capital letter) containing the property's name.</p>
 * 
 * @author Erik Hofer
 */
@GenerateInterface(
    namingStrategy = InterfaceNamingStrategy.EXCEPT_LAST_FOUR_CHARS,
    propertyConstants = true
  )
public class DtoImpl implements Dto {

}
