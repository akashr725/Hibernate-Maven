package com.JavaHibernate.HibernateMaven;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="emp123")
public class Emp {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private int id;
	private String name,address;

}
