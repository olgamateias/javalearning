package com.java.learning.v5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestersValidatorFunctions {

	@Test
	void testValidateEmail() {
		assertEquals(ValidatorFunctions.validateEmail("something@domain.com"), true);
		assertEquals(ValidatorFunctions.validateEmail("my.user_name@subdomain123.domain.co.uk"), true);
		assertEquals(ValidatorFunctions.validateEmail("my.user_name123@subdomain.domain.ro"), true);
		assertEquals(ValidatorFunctions.validateEmail("my+user_name@subdomain.domain.ro"), false);
//		assertEquals(ValidatorFunctions.validateEmail("myuser_name@........ro"), false);
		assertEquals(ValidatorFunctions.validateEmail("some thing@domain.com"), false);
		assertEquals(ValidatorFunctions.validateEmail("something@domain.co.com"), true);
		assertEquals(ValidatorFunctions.validateEmail("something@domain.comm"), false);
		assertEquals(ValidatorFunctions.validateEmail("something@subdomain+domain.com"), false);
		assertEquals(ValidatorFunctions.validateEmail("@"), false);
		assertEquals(ValidatorFunctions.validateEmail(""), false);
		assertEquals(ValidatorFunctions.validateEmail("something@thisisasuperlongdomainthatexceeds32charactersanditisnotvalid.ro"), false);
		assertEquals(ValidatorFunctions.validateEmail("thisisasuperlongdomainthatexceeds32charactersanditisnotvalid@something.ro"), false);
		assertEquals(ValidatorFunctions.validateEmail("12345678901234567890123456789012@thishasexactly32characterszzzzzz.ro"), false);
		assertEquals(ValidatorFunctions.validateEmail("12345678901234567890123456789012@thishasexactly32characterszzzzzz.thishasexactly32characterszzzzzz.ro"), false);
	}
/*	
	@Test
	void testValidatePhoneNumber() {
		assertEquals(ValidatorFunctions.validateEmail("+49 160 920 15 127"), true);
		assertEquals(ValidatorFunctions.validateEmail("0049 160 920 15 127"), true);
		assertEquals(ValidatorFunctions.validateEmail("016092015127"), true);
		assertEquals(ValidatorFunctions.validateEmail("0160 920 15 127"), true);
		assertEquals(ValidatorFunctions.validateEmail("0160 920 15+127"), false);
		assertEquals(ValidatorFunctions.validateEmail("0160 920 15.127"), false);
		assertEquals(ValidatorFunctions.validateEmail("0160 920 15 127 123 24"), false);
		assertEquals(ValidatorFunctions.validateEmail("0160 920 15"), false);
	}
	
	@Test
	void testValidatePasswordStrength() {
		assertEquals(ValidatorFunctions.validateEmail("Ih@veAnOr1g1nalPassword9"), true);
		assertEquals(ValidatorFunctions.validateEmail("!paS$w0rd!"), true);
		assertEquals(ValidatorFunctions.validateEmail("!pa S$w0rd!"), false);
		assertEquals(ValidatorFunctions.validateEmail("password"), false);
		assertEquals(ValidatorFunctions.validateEmail("password123"), false);
		assertEquals(ValidatorFunctions.validateEmail("Password"), false);
		assertEquals(ValidatorFunctions.validateEmail("!Password"), false);
	}
*/
}
