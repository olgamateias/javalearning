package com.java.learning.v6.onlineshop;

public class OrderItem implements IOrderItem {

	private IProduct product = new Product();
	private int quantity = 0;;

	@Override
	public IProduct getProduct() {
		return this.product;
	}

	@Override
	public void setProduct(IProduct product) {
		this.product = product;
	}

	@Override
	public int getQuantity() {
		return this.quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
