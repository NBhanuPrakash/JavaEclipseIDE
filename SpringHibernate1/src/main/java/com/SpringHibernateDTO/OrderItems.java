package com.SpringHibernateDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@javax.persistence.Table(name = "orderitems")
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	
	private String orderItemName;
	
	private String itemPrice;

	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItems(long orderId, String orderItemName, String itemPrice) {
		super();
		this.orderId = orderId;
		this.orderItemName = orderItemName;
		this.itemPrice = itemPrice;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderItemName() {
		return orderItemName;
	}

	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "OrderItems [orderId=" + orderId + ", orderItemName=" + orderItemName + ", itemPrice=" + itemPrice + "]";
	}
	
	
	
	

}
