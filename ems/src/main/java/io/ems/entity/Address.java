package io.ems.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	private String id;
	
	private String adrsLineOne;
	
	private String adrsLineTwo;
	
	private String city;
	
	private long zip;
	
	private String state;
	
	private String country;
	
	public Address(){
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdrsLineOne() {
		return adrsLineOne;
	}

	public void setAdrsLineOne(String adrsLineOne) {
		this.adrsLineOne = adrsLineOne;
	}

	public String getAdrsLineTwo() {
		return adrsLineTwo;
	}

	public void setAdrsLineTwo(String adrsLineTwo) {
		this.adrsLineTwo = adrsLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
