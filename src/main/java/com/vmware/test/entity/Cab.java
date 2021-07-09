package com.vmware.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cab {

	@Id
	private String regNo;
	private String model;
	private String cabType;
	
	
	public Cab() {
		
	}
	
	
	public Cab(String regNo, String model, String cabType) {
		
		this.regNo = regNo;
		this.model = model;
		this.cabType = cabType;
	}


	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	
	
	
	
	
}
