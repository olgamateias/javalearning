package com.java.learning.v06.onlineshop;

import java.util.Arrays;

public class OnlineShopTestSupport {


	protected IOrder createGoodOrder() {
		IOrder order = new Order();
		IOrderItem closet = createOrderItem("closet", 110, 1);
		IOrderItem table1 = createOrderItem("table", 60, 1);
		IOrderItem table2 = createOrderItem("table", 90, 1);
		IOrderItem chairs = createOrderItem("chair", 30, 4);
		order.setItems(Arrays.asList(chairs, table1, table2, closet));
		return order;
	}

	protected IOrder createBadOrder() {
		return new Order();
	}

	protected IOnlineShop createOnlineShop() {
		return new OnlineShop();
	}

	protected IOrderItem createOrderItem(String name, double price, int qty) {
		IOrderItem orderItem = new OrderItem();
		IProduct prod = createProduct(name, price);
		orderItem.setProduct(prod);
		orderItem.setQuantity(qty);
		return orderItem;
	}

	protected IProduct createProduct(String name, double price) {
		IProduct product = new Product();
		product.setName(name);
		product.setPrice(price);
		return product;
	}

}