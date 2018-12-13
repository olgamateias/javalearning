package com.java.learning.v6.onlineshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OnlineShopTest extends OnlineShopTestSupport {

	private IOnlineShop onlineShop;

	@Before
	public void setupOrder() {
		this.onlineShop = createOnlineShop();
	}

	@Test
	public void testValidateOrder() {
		assertEquals(this.onlineShop.validateOrder(createGoodOrder()), true);
		assertEquals(this.onlineShop.validateOrder(createBadOrder()), false);
	}
	/*
	 * @Test public void testGetOrderItemPrice() { IOrderItem item = createOrderItem("chair", 30,
	 * 3); assertEquals(this.onlineShop.getOrderItemPrice(item), 90); }
	 * 
	 * @Test public void testGetTotalPrice() {
	 * assertEquals(this.onlineShop.getTotalPrice(createGoodOrder()), 380); }
	 * 
	 * @Test public void testGetTheCheapestOrderItem() { IOrderItem theCheapestOrderItem =
	 * this.onlineShop.getTheCheapestOrderItem(createGoodOrder());
	 * assertEquals(theCheapestOrderItem.getProduct().getName(), "table");
	 * assertEquals(theCheapestOrderItem.getProduct().getPrice(), 60);
	 * assertEquals(theCheapestOrderItem.getQuantity(), 1); }
	 * 
	 * @Test public void testGetTheMostExpensiveOrderItem() { IOrderItem theMostExpensiveOrderItem =
	 * this.onlineShop.getTheMostExpensiveOrderItem(createGoodOrder());
	 * assertEquals(theMostExpensiveOrderItem.getProduct().getName(), "chair");
	 * assertEquals(theMostExpensiveOrderItem.getProduct().getPrice(), 30);
	 * assertEquals(theMostExpensiveOrderItem.getQuantity(), 4);
	 * 
	 * }
	 * 
	 * @Test public void testGetTheMostExpensiveProduct() { IProduct theMostExpensiveProduct =
	 * this.onlineShop.getTheMostExpensiveProduct(createGoodOrder());
	 * assertEquals(theMostExpensiveProduct.getName(), "closet");
	 * assertEquals(theMostExpensiveProduct.getPrice(), 110); }
	 */
}
