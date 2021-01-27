package com.michelin.CloudSqlGCPdependency.VegTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.michelin.CloudSqlGCPdependency.Entity.Vegetables;
import com.michelin.CloudSqlGCPdependency.RestController.VegRest;
import com.michelin.CloudSqlGCPdependency.Service.VegService;
import com.michelin.CloudSqlGCPdependency.VegRepository.VegRepository;

//JUNIT Testing
@RunWith(SpringRunner.class)
@SpringBootTest
public class VegServiceTest {
	
	@Autowired
	VegRest vegRest;
	
	
	@Test
	public void getAllVeggiesTest() {
	
		assertEquals(3, vegRest.getAllVeg().size());
		
	}
	
	@Test
	public void getAllVeggiesTestWrongData() {
	
		assertEquals(1, vegRest.getVegbyID(1).get().getId());
		
		
	}

}
