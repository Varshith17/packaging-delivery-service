package com.digitalhonor.packagingdeliveryservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhonor.packagingdeliveryservice.service.PackagingDeliveryService;

@RestController
@RequestMapping("/packagingAndDelivery")
public class PackagingDeliveryController {
	@Autowired
	PackagingDeliveryService packagingAndDeliveryService;

	private static final Logger LOGGER = LoggerFactory.getLogger(PackagingDeliveryController.class);
	@GetMapping("/getCharge/{componentType}/{count}")
	public double getPackagingAndDeliveryCharge(@PathVariable String componentType, @PathVariable int count) {
		LOGGER.info("STARTED package and delivery");
		double res =packagingAndDeliveryService.getCharge(componentType, count);
		LOGGER.info("STARTED package and delivery");
		return res;
	}
}
