package com.mobiles.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Mobile {
	
	@Id
	private String id;
	private String mobileName;
	private String price;
	
	public Mobile() {
		super();
	}
	
	public Mobile(String id, String mobileName, String price) {
		super();
		this.id = id;
		this.mobileName = mobileName;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMedicineName() {
		return mobileName;
	}
	public void setMedicineName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
