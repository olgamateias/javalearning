package com.java.learning.v6.onlineshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class OrderTest extends OnlineShopTestSupport{

	private IOrder order;
	
	@Before
	public void setup() {
		this.order = createGoodOrder();
	}
	
	@Test
	public void testGetItems() {
		assertNotNull(this.order.getItems(), "Items should not be null");
		assertNotEquals(0, this.order.getItems().size());
	}

	@Test
	public void testAddItem() {
		IOrder orderLocal = createBadOrder();
		
		orderLocal.addItem(createOrderItem("hanger", 12, 1));
		assertEquals(0l, orderLocal.getItems().stream().filter(item -> "hanger".equals(item.getProduct().getName())).count());
	}

}
