package com.java.learning.v6.onlineshop;

public class OrderItem {
	
	private Product product;
	private int quantity;
		
	public OrderItem(Product product, int quantity) {

		this.product = product;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
