package com.java.learning.v6.onlineshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

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

		IOrder badOrder2 = createBadOrder();
		IOrderItem itemWithoutProduct = new OrderItem();
		itemWithoutProduct.setProduct(null);
		itemWithoutProduct.setQuantity(2);
		badOrder2.setItems(Arrays.asList(itemWithoutProduct));

		IOrder badOrder3 = createBadOrder();
		IOrderItem itemWithoutQty = new OrderItem();
		itemWithoutQty.setProduct(createProduct("stuff", 10));
		badOrder3.setItems(Arrays.asList(itemWithoutQty));

		IOrder badOrder4 = createBadOrder();
		IOrderItem itemWithProductWithoutName = new OrderItem();
		itemWithoutProduct.setProduct(createProduct(null, 10));
		itemWithoutProduct.setQuantity(2);
		badOrder4.setItems(Arrays.asList(itemWithProductWithoutName));

		assertEquals(this.onlineShop.validateOrder(createGoodOrder()), true);
		assertEquals(this.onlineShop.validateOrder(createBadOrder()), false);
		assertEquals(this.onlineShop.validateOrder(badOrder2), false);
		assertEquals(this.onlineShop.validateOrder(badOrder3), false);
		assertEquals(this.onlineShop.validateOrder(badOrder4), false);
	}

	@Test
	public void testGetOrderItemPrice() {
		IOrderItem item = createOrderItem("chair", 30, 3);
		assertEquals(this.onlineShop.getOrderItemPrice(item), 90);
	}

	@Test
	public void testGetTotalPrice() {
		assertEquals(this.onlineShop.getTotalPrice(createGoodOrder()), 380);
	}
	/*
	 * @Test public void testGetTheCheapestOrderItem() { IOrderItem theCheapestOrderItem =
	 * this.onlineShop.getTheCheapestOrderItem(createGoodOrder());
	 * assertEquals(theCheapestOrderItem.getProduct() .getName(), "table");
	 * assertEquals(theCheapestOrderItem.getProduct() .getPrice(), 60);
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
