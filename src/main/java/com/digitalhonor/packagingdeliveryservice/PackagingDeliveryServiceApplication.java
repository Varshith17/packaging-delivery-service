package com.digitalhonor.packagingdeliveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class PackagingDeliveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackagingDeliveryServiceApplication.class, args);
	}

}
