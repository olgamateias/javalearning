package com.java.learning.v6.onlineshop;

public class OrderItem implements IOrderItem {
	
	private IProduct product;
	private int quantity;
	
	public IProduct getProduct() {
		return product;
	}
	
	public void setProduct(IProduct product) {
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {

	}
	

	

}
