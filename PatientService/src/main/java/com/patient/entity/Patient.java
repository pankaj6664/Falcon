package com.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	
	@Id
	private String patientId;
	private String name;
	private String contact;
	private String email;
	private String address;
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Patient(String patientId, String name, String contact, String email, String address, String password) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", contact=" + contact + ", email=" + email
				+ ", address=" + address + ", password=" + password + "]";
	}
	
	
	

}
