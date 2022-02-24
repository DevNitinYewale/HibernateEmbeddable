package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	
	@Id
	private int id;
	private String name;
	private String email;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public StudentEntity(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	private Certificate certi;

	public Certificate getCerti() {
		return certi;
	}
	
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	public StudentEntity(int id, String name, String email, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.certi = certi;
	}
	
	
	
	
}
