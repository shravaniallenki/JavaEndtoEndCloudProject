package com.michelin.CloudSqlGCPdependency.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Vegetables")
public class Vegetables {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private float price;
	private float quantity;
	
	@ManyToMany
	
	private List<Stores> stores;
	
	public void setStores(List<Stores> stores) {
		this.stores = stores;
	}

	public List<Stores> getStores() {
		return stores;
	}

	public Vegetables() {
		
	}
	
	public Vegetables(int id, String name, float price, float quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
}
