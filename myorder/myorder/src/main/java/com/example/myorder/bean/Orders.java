package com.example.myorder.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	private String orderId;
	@Column
	private String emailId;
	@Column
	private String address;
	@Column
	private String orderStatus;
	@Column
	private String orderInfo;
	@Column
	private Integer quantity;
	@Column
	private double orderTotal;
	
	public Orders(String orderId, String emailId, String address, String orderStatus, String orderInfo,
			Integer quantity, double orderTotal) {
		super();
		this.orderId = orderId;
		this.emailId = emailId;
		this.address = address;
		this.orderStatus = orderStatus;
		this.orderInfo = orderInfo;
		this.quantity = quantity;
		this.orderTotal = orderTotal;
	}
	public Orders() {}
	
	
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", emailId=" + emailId + ", address=" + address + ", orderStatus="
				+ orderStatus + ", orderInfo=" + orderInfo + ", quantity=" + quantity + ", orderTotal=" + orderTotal
				+ "]";
	}
	
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
}
