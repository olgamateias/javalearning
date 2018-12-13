package com.java.learning.v6.onlineshop;

import java.util.List;

public class OnlineShop implements IOnlineShop {

	/**
	 * Go through the order, validate that there is at least one order item with a product and
	 * quantity > 0
	 */

	@Override
	public boolean validateOrder(IOrder order) {
		List<IOrderItem> items = order.getItems();

		if (order.getItems()
				.isEmpty()) {
			System.out.println("The order is empty");
			return false;
		}

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i)
					.getProduct()
					.getName()
					.isEmpty()
					&& items.get(i)
							.getProduct()
							.getPrice() == 0
					&& items.get(i)
							.getQuantity() >= 1) {
				return false;
			}
		}

		System.out.println("The order is valid");
		return true;
	}

	/**
	 * order item price = product price * quantity
	 */
	@Override
	public double getOrderItemPrice(IOrderItem item) {

		return 0;
	}

	/**
	 * total price = the sum of all the order item prices
	 */
	@Override
	public double getTotalPrice(IOrder order) {
		return 0;
	}

	/**
	 * Return the order item that has the lowest price among all order items from the order
	 */
	@Override
	public IOrderItem getTheCheapestOrderItem(IOrder order) {
		return null;
	}

	/**
	 * Return the order item that has the highest price among all order items from the order
	 */
	@Override
	public IOrderItem getTheMostExpensiveOrderItem(IOrder order) {
		return null;
	}

	/**
	 * Get the product that has the highest price. This is not the product contained in the order
	 * item with the highest price, but the product that has the biggest individual price.
	 */
	@Override
	public IProduct getTheMostExpensiveProduct(IOrder order) {
		return null;
	}

}
