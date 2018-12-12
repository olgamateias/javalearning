package com.java.learning.v6.onlineshop;

import java.util.List;

public class Order implements IOrder {
	private List<IOrderItem> items;


	@Override
	public void setItems(List<IOrderItem> items) {
		// TODO Auto-generated method stub
		this.items = items;
		
	}

	@Override
	public List<IOrderItem> getItems() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItem(IOrderItem item) {
		// TODO Auto-generated method stub
		
	}



}
