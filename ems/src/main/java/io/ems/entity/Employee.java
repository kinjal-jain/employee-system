package io.ems.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import io.ems.entity.Address;

@Entity
public class Employee {
	
	@Id
	private String id;
	
	private String fName;
	
	private String lName;
	
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	private String department;
	
	private String gender;
	
	private Date joiningDate;
	
	private long salary;

	private boolean accountActive;
	
	public Employee(){
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getJoiningDate() {
		return joiningDate;
	}
	
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public boolean isAccountActive() {
		return accountActive;
	}
	
	public void setAccountActive(boolean accountActive) {
		this.accountActive = accountActive;
	}
		
}
