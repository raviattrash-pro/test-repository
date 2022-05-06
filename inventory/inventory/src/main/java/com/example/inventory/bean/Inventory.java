package com.example.inventory.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {
	@Id
	private Integer productId;
	@Column
	private Integer productInventory;
	@Column
	private double productPrice;
	@Column
	private String productDetails;
	
	public Inventory(Integer productId, Integer productInventory, double productPrice, String productDetails) {
		super();
		this.productId = productId;
		this.productInventory = productInventory;
		this.productPrice = productPrice;
		this.productDetails = productDetails;
	}
	public Inventory() {}
	@Override
	public String toString() {
		return "Inventory [productId=" + productId + ", productInventory=" + productInventory + ", productPrice="
				+ productPrice + ", productDetails=" + productDetails + "]";
	}
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getProductInventory() {
		return productInventory;
	}
	public void setProductInventory(Integer productInventory) {
		this.productInventory = productInventory;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	

}
