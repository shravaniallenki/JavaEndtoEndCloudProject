package com.michelin.CloudSqlGCPdependency.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Stores")
public class Stores {

	
	@Id
	private int storeId;

	private String storeName;
	private int phone;
	
	@ManyToMany(mappedBy = "stores")
	
	private List<Vegetables> veg;
	
	

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	
	public int getStoreId() {
		return storeId;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	
	public int getPhone() {
		return phone;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public Stores() {
		
	}
	
	public Stores(String storeName, int phone, int storeId) {
		super();
		this.storeName = storeName;
		this.phone = phone;
		this.storeId = storeId;
		
	}
	
}
