package com.java.learning.v06.onlineshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class ProductTest extends OnlineShopTestSupport {

	private IProduct product;
	
	@Before
	public void setup() {
		this.product = createProduct("product", 12);
	}
	
	@Test
	public void testProduct() {
		assertEquals("product", this.product.getName());
		assertEquals(12, this.product.getPrice());
	}

}
