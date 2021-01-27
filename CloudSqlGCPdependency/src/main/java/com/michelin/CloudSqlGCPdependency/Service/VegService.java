package com.michelin.CloudSqlGCPdependency.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michelin.CloudSqlGCPdependency.Entity.Vegetables;
import com.michelin.CloudSqlGCPdependency.VegRepository.VegRepository;

@Service
public class VegService {

	@Autowired
	VegRepository vegrepo;
	
	public List<Vegetables> getAllVeggies() {
		
		return vegrepo.findAll();
			
	}
	
	public Optional<Vegetables> getVegById(int id){
		return vegrepo.findById(id);
		
	}
	
	public void insertVegItems(Vegetables veg) {
		
		vegrepo.save(veg);
	}
	
	public void updateVegItems(Vegetables veg, int id) {
		
		if(vegrepo.existsById(id)) {
			vegrepo.save(veg);
		}
		
	}
		
    public void deleteVegById(int id) {
    	
			if(vegrepo.existsById(id)) {
				vegrepo.deleteById(id);
			}
		}
		
	
}
