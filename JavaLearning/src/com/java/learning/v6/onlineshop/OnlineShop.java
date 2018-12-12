package com.java.learning.v6.onlineshop;

public class OnlineShop implements IOnlineShop{

	/**
	 * Go through the order, validate that there is at least one order item with a product and quantity > 0
	 */
	public boolean validateOrder(IOrder order) {
		
		return false;
	}
	
	/**
	 * order item price = product price * quantity
	 */
	public double getOrderItemPrice(IOrderItem item) {
		
		return 0;
	}
	
	/**
	 * total price = the sum of all the order item prices
	 */
	public double getTotalPrice(IOrder order) {
		return 0;
	}
	
	/**
	 * Return the order item that has the lowest price among all order items from the order
	 */
	public IOrderItem getTheCheapestOrderItem(IOrder order) {
		return null;
	}
	
	/**
	 * Return the order item that has the highest price among all order items from the order
	 */
	public IOrderItem getTheMostExpensiveOrderItem(IOrder order) {
		return null;
	}
	
	/**
	 * Get the product that has the highest price. This is not the product contained in the order item with the highest price, but the product that has the biggest individual price.
	 */
	public IProduct getTheMostExpensiveProduct(IOrder order) {
		return null;
	}
	

}
