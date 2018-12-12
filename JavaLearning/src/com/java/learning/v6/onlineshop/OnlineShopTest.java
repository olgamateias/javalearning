package com.java.learning.v6.onlineshop;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class OnlineShopTest {

	private IOrder orderGood;
	private IOrder orderBad;
	private IOnlineShop onlineShop;
	
	@Before
	public void setupOrder() {
		this.orderGood = createGoodOrder();
		this.orderBad = createBadOrder();
		this.onlineShop = createOnlineShop();
	}
	
	@Test
	void testValidateOrder() {
		this.onlineShop.validateOrder(this.orderGood);
		this.onlineShop.validateOrder(this.orderBad);
	}

	@Test
	void testGetOrderItemPrice() {
		IOrderItem item = createOrderItem();
		IProduct product = createProduct();
		item.setProduct(product);
		item.setQuantity(2);
		this.onlineShop.getOrderItemPrice(item);
	}

	@Test
	void testGetTotalPrice() {
		this.onlineShop.getTotalPrice(createGoodOrder());
	}

	@Test
	void testGetTheCheapestOrderItem() {
		this.onlineShop.getTheCheapestOrderItem(createGoodOrder());
	}

	@Test
	void testGetTheMostExpensiveOrderItem() {
		this.onlineShop.getTheMostExpensiveOrderItem(createGoodOrder());
	}

	@Test
	void testGetTheMostExpensiveProduct() {
		this.onlineShop.getTheMostExpensiveProduct(createGoodOrder());
	}

	private IOrder createGoodOrder() {
		// TODO Claudiu
		return null;
	}
	
	private IOrder createBadOrder() {
		// TODO Claudiu
		return null;
	}
	
	private IOnlineShop createOnlineShop() {
		// TODO Claudiu
		return null;
	}
	
	private IOrderItem createOrderItem() {
		// TODO Claudiu
		return null;
	}
	
	private IProduct createProduct() {
		// TODO Claudiu
		return null;
	}
}
