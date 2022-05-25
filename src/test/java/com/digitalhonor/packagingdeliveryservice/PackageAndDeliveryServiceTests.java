package com.digitalhonor.packagingdeliveryservice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.digitalhonor.packagingdeliveryservice.service.PackagingDeliveryService;

@SpringBootTest
@RunWith(SpringRunner.class)
@ComponentScan(basePackages = { "com.digitalhonors.packagingdeliveryservice.service" })
@AutoConfigureMockMvc
public class PackageAndDeliveryServiceTests {
	
	@Autowired
	private PackagingDeliveryService pkgService;
	
	@Test
	public void contextLoads() {
		assertNotNull(pkgService);
	}
	
	@Test
	public void ProcessPackageAndDeliverySuccess(){
		
		double expected = 3500.0;
		double actual = pkgService.getCharge("integral", 10);
		assertEquals(expected,actual,0);
	}
	
	@Test
	public void ProcessPackageAndDeliveryFailure(){
		
		double expected = 300.0;
		double actual = pkgService.getCharge("integral", 10);
		assertNotEquals(expected,actual,0);
	}
}

