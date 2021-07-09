package com.vmware.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

	
	private String driverName;
	@Id
	private String driverId;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public Driver(String driverName, String driverId) {
		
		this.driverName = driverName;
		this.driverId = driverId;
	}
	public Driver() {
		
	}
	
	
	
	
	
	
}
