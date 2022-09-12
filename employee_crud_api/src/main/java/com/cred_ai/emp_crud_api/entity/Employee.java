package com.cred_ai.emp_crud_api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//@Getter
//@Setter
@Component // refers that this is a pojo class and this is a component.
@Entity
@Table(name = "EMPLOYEE") // sets the table name and links it.
public class Employee {

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private long empid;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "age")
	private int age;
	
	@Column (name = "salary")
	private double salary;
	
	@Column (name = "address")
	private String address;
}
