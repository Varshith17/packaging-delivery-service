package com.digitalhonor.packagingdeliveryservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.digitalhonor.packagingdeliveryservice.controller.PackagingDeliveryController;
import com.digitalhonor.packagingdeliveryservice.exception.ComponentTypeNotFound;

@Service
public class PackagingDeliveryService {

	 private static final double PROTECTIVE_SHEATH = 50;
	    private static final double PACKAGING_AND_DELIVERY_ACCESSORY = 150;
	    private static final double PACKAGING_AND_DELIVERY_INTEGRAL = 300;
	    private static final Logger LOGGER = LoggerFactory.getLogger(PackagingDeliveryService.class);
	    public double getCharge(String componentType, int count) {
	    	
	    	LOGGER.info("STARTED Package and delivery service");
	        if (count <= 0) {
	            throw new IllegalArgumentException("count must be greater than zero");
	        }
	        if (componentType.equalsIgnoreCase("accessory")) {
	        	LOGGER.info("END Package and delivery service");
	            return (PACKAGING_AND_DELIVERY_ACCESSORY + PROTECTIVE_SHEATH) * count;
	        } else if (componentType.equalsIgnoreCase("integral")){
	        	LOGGER.info("END Package and delivery service");
	            return (PACKAGING_AND_DELIVERY_INTEGRAL + PROTECTIVE_SHEATH) * count;
	        }
	        else
	            throw new ComponentTypeNotFound("There is no delivery charge with this component type");
	        
	    }
}
