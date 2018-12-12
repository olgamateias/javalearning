package com.java.learning.v6.onlineshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class OrderItemTest extends OnlineShopTestSupport{

	private IOrderItem orderItem;
	
	@Before
	public void setup() {
		this.orderItem = createOrderItem("product", 10, 2);
	}
	
	@Test
	public void testOrderItem() {
		assertEquals(this.orderItem.getProduct().getName(), "product");
		assertEquals(2, this.orderItem.getQuantity());
	}


}
