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

import com.michelin.CloudSqlGCPdependency.Entity.Vegetables;
import com.michelin.CloudSqlGCPdependency.Service.VegService;
import com.michelin.CloudSqlGCPdependency.VegRepository.VegRepository;

@RunWith(MockitoJUnitRunner.class)
public class VegServiceMockitoTest {
	
	@InjectMocks
	VegService vegService;
	
	
	@Mock
	VegRepository vegRepository;
	
	@Test
	public void getVeggiesMockitoTest() {
		
		List<Vegetables> listVegetables=new ArrayList<>();
		listVegetables.add(new Vegetables(100, "Egg", 10, 100));
		listVegetables.add(new Vegetables(200, "Egg", 10, 100));
		listVegetables.add(new Vegetables(300, "Egg", 10, 100));
		
		
		when(vegRepository.findAll()).thenReturn(listVegetables);
		assertEquals(3, vegService.getAllVeggies().size());
		
		
		
	}
	
	@Test
	public void getVeggiesNameTest() {
		
		List<Vegetables> listVegetables=new ArrayList<>();
		listVegetables.add(new Vegetables(100, "Egg", 10, 100));
		listVegetables.add(new Vegetables(200, "Egg", 10, 100));
		listVegetables.add(new Vegetables(300, "Egg", 10, 100));
		
		
		when(vegRepository.findAll()).thenReturn(listVegetables);
		assertEquals("Egg", vegService.getAllVeggies().get(1).getName());
	}

}
