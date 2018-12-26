package com.java.learning.v06.onlineshop;

import java.util.List;

public interface IOrder {

//	List<IOrderItem> items
	
	public void setItems(List<IOrderItem> items);
	
	public List<IOrderItem> getItems();
	
	public void addItem(IOrderItem item);
}
