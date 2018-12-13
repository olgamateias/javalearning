package com.java.learning.v6.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
	private List<IOrderItem> items = new ArrayList<IOrderItem>();

	@Override
	public void setItems(List<IOrderItem> items) {

		this.items = items;

	}

	@Override
	public List<IOrderItem> getItems() {
		// TODO Auto-generated method stub
		return this.items;
	}

	@Override
	public void addItem(IOrderItem item) {
		// TODO Auto-generated method stub

	}

}
