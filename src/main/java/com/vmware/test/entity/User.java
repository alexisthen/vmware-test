package com.vmware.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	String userName;
	@Id
	String userId;
	String idDoc;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getIdDoc() {
		return idDoc;
	}
	public void setIdDoc(String idDoc) {
		this.idDoc = idDoc;
	}
	public User() {
		
	}
	public User(String userName, String userId, String idDoc) {
		
		this.userName = userName;
		this.userId = userId;
		this.idDoc = idDoc;
	}
	
	
	

}
