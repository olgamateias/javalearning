package com.java.learning.v6.onlineshop;

public interface IOrderItem {

	// private Product product
	// private int quantity
	
	public void setProduct(IProduct product);

	public IProduct getProduct();
	
	public void setQuantity(int quantity);
	
	public int getQuantity();
}
