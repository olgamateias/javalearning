package com.java.learning.v6.onlineshop;

public interface IOnlineShop {


	/**
	 * Go through the order, validate that there is at least one order item with a product and quantity > 0
	 */
	public boolean validateOrder(IOrder order);
	
	/**
	 * order item price = product price * quantity
	 */
	public double getOrderItemPrice(IOrderItem item);
	
	/**
	 * total price = the sum of all the order item prices
	 */
	public double getTotalPrice(IOrder order);
	
	/**
	 * Return the order item that has the lowest price among all order items from the order
	 */
	public IOrderItem getTheCheapestOrderItem(IOrder order);
	
	/**
	 * Return the order item that has the highest price among all order items from the order
	 */
	public IOrderItem getTheMostExpensiveOrderItem(IOrder order);
	
	/**
	 * Get the product that has the highest price. This is not the product contained in the order item with the highest price, but the product that has the biggest individual price.
	 */
	public IProduct getTheMostExpensiveProduct(IOrder order);
}
