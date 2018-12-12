package com.java.learning.v6.onlineshop;

import java.util.List;

public interface IOrder {

//	List<IOrderItem> items
	
	public void setItems(List<IOrderItem> items);
	
	public void getItems();
	
	public void addItem(IOrderItem item);
}
