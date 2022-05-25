package com.digitalhonor.packagingdeliveryservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.digitalhonor.packagingdeliveryservice.controller.PackagingDeliveryController;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class PackageAndDeliveryControllerTest {

	@Autowired
	private PackagingDeliveryController pkgDelivery;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() {
		assertNotNull(pkgDelivery);
	}
	
	@Test
	public void getPackageAndDeliveryChargeSuccess() throws Exception{
		ResultActions actions = mockMvc.perform(get("/packagingAndDelivery/getCharge/integral/10").contentType(MediaType.APPLICATION_JSON));
		actions.andExpect(status().isOk());
	}
	
	@Test
	public void getPackageAndDeliveryChargeFailure() throws Exception{
		ResultActions actions = mockMvc.perform(post("/packagingAndDelivery/getCharge/integral/10").contentType(MediaType.APPLICATION_JSON));
		actions.andExpect(status().is5xxServerError());
	}
}
