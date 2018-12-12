package com.java.learning.v6.onlineshop;

import java.util.List;

public class Order implements IOrder {
	private List<IOrderItem> items;
	private IOrderItem item;


	public IOrderItem getItem() {
		return item;
	}

	public void setItem(OrderItem item) {
		this.item = item;
	}

	public void setItems(List<IOrderItem> items) {
		// TODO Auto-generated method stub
		this.items = items;
		
	}

	public void getItems() {
		// TODO Auto-generated method stub
		
	}

	public void addItem(IOrderItem item) {
		// TODO Auto-generated method stub
		
	}



}
