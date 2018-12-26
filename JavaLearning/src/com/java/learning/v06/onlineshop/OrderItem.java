package com.java.learning.v06.onlineshop;

public class OrderItem implements IOrderItem {

	private IProduct product;
	private int quantity;

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
