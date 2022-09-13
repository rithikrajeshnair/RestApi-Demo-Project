package com.credai_product_crud_api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table( name = "Product")
public class Product {
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)
	private long productid;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "supplier")
	private String supplier;
	
	@Column (name = "cost")
	private double cost;

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	} 
}
