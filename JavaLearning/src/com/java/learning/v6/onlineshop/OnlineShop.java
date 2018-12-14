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

		if (order.getItems().isEmpty()) {
			// System.out.println("The order is empty");
			return false;
		}

		for (IOrderItem i : items) {
			try {
				i.getProduct().getName().equals(null);
			} catch (Exception e) {
				// System.out.println("The name of the product is null, therefore the order is
				// invalid");
				return false;
			}
			if (i.getProduct().getName().isEmpty() || i.getProduct().getPrice() == 0 || i.getQuantity() < 1) {
				// System.out.println("Some of the elements are 0 or null, therefore the order is
				// invalid. " + "Name " + i.getProduct().getName() + ". Price "
				// + i.getProduct().getPrice() + ". Quantity " + i.getQuantity());
				return false;
			}
		}

		// System.out.println("The order is valid");
		return true;
	}

	/**
	 * order item price = product price * quantity
	 */
	@Override
	public double getOrderItemPrice(IOrderItem item) {
		double orderItemPrice = item.getQuantity() * item.getProduct().getPrice();
		return orderItemPrice;
	}

	/**
	 * total price = the sum of all the order item prices
	 */
	@Override
	public double getTotalPrice(IOrder order) {
		List<IOrderItem> items = order.getItems();
		double totalAmount = 0;
		for (IOrderItem item : items) {
			totalAmount = totalAmount + getOrderItemPrice(item);
		}
		return totalAmount;
	}

	/**
	 * Return the order item that has the lowest value among all order items from the order
	 */
	@Override
	public IOrderItem getTheCheapestOrderItem(IOrder order) {
		List<IOrderItem> items = order.getItems();
		double price = Integer.MAX_VALUE;
		IOrderItem itemWithLowPrice = new OrderItem();

//		for (int i = 0; i < items.size(); i++) {
//			double value = items.get(i).getProduct().getPrice() * items.get(i).getQuantity();
//			if (value < price) {
//				price = value;
//				itemWithLowPrice = items.get(i);
//
//			}
//
//		}

		for (IOrderItem item : items) {
			double value = getOrderItemPrice(item);
			if (value < price) {
				price = value;
				itemWithLowPrice = item;
			}

		}
		return itemWithLowPrice;
	}

	/**
	 * Return the order item that has the highest price among all order items from the order
	 */
	@Override
	public IOrderItem getTheMostExpensiveOrderItem(IOrder order) {
		List<IOrderItem> items = order.getItems();
		double value = Integer.MIN_VALUE;
		IOrderItem itemWithHighPrice = new OrderItem();

		for (IOrderItem item : items) {
			double totalPrice = getOrderItemPrice(item);
			if (totalPrice > value) {
				value = totalPrice;
				itemWithHighPrice = item;
			}
		}
		return itemWithHighPrice;
	}

	/**
	 * Get the product that has the highest price. This is not the product contained in the order
	 * item with the highest price, but the product that has the biggest individual price.
	 */
	@Override
	public IProduct getTheMostExpensiveProduct(IOrder order) {
		List<IOrderItem> items = order.getItems();
		double price = Integer.MIN_VALUE;
		IProduct highestPrice = new Product();

		for (IOrderItem item : items) {
			double itemPrice = item.getProduct().getPrice();
			if (itemPrice > price) {
				price = itemPrice;
				highestPrice = item.getProduct();
			}
		}
		return highestPrice;
	}

}
