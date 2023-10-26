package com.mobiles.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobiles {
	@Id
	private String id;
	private String mobileName;
	private String modelName;
	public Mobiles() {
		super();
		
	}
	public Student(String id, String mobilesName, String modelName) {
		super();
		this.id = id;
		this.mobileName = mobileName;
		this.modelName = modelName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	

}
