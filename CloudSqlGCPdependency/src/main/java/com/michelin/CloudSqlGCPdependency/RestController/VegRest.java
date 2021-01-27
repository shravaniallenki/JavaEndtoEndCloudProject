package com.michelin.CloudSqlGCPdependency.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.michelin.CloudSqlGCPdependency.Entity.Vegetables;
import com.michelin.CloudSqlGCPdependency.Service.VegService;

@RestController
public class VegRest {
	
	@Autowired
	VegService vegservice;
	
	@GetMapping(path = "/getAllVeggies")
	public List<Vegetables> getAllVeg(){
		return vegservice.getAllVeggies();
	}
	
	@GetMapping(path = "/getVeggie/{id}")
	public Optional<Vegetables> getVegbyID(@PathVariable int id){
		return vegservice.getVegById(id);
	}
	
	@PostMapping (path = "/insertVegDetails")
	public void insertVeg(@RequestBody Vegetables veg) {
		
		vegservice.insertVegItems(veg);
	}
	
	@PutMapping(path ="/updateVegDetails/{id}")
	
	public void updateVeg(@RequestBody Vegetables veg, @PathVariable int id) {
		
		vegservice.updateVegItems(veg, id);
	}
	
	@DeleteMapping(path = "/deleteVegById/{id}")
	
	public void deleteVegById(@PathVariable int id) {
		vegservice.deleteVegById(id);
	}

}
