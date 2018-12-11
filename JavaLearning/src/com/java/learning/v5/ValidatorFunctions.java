package com.java.learning.v5;

public class ValidatorFunctions {

	
	/**
	 *	A valid email should have no more than 32 characters for the username and 32 characters for the domain + subdomain.
	 *	It should contain no spaces or special characters other than: . - _ and of course @
	 *	The domain cannot have more than two parts. The domain extension cannot have more than 3 characters. Exception is co.uk
	 *
	 *	E.g.: valid emails: something@domain.com, my.user_name@subdomain.domain.co.uk
	 *	invalid emails: some thing@domain.com, something@thisisasuperlongdomainthatexceeds32charactersanditisnotvalid.ro, something@somewhat.abcd, what?@question.i.do.not.know
	 */
	public static boolean validateEmail(String email) {
		String username = "";
		String domain = "";
		String subdomain = "";
		String extension = "";
		boolean validUsername = true;
		boolean validDomain = true;
		
		if(email.isEmpty()) {
			System.out.println("No email entered");
			return false;
		}
		
//		for(int i = 0; i<email.length(); i++) {
//			if(email.charAt(i) == '@') {
//				username = email.substring(0, i);
//				domain = email.substring(i+1, email.length());
//				break;
//			}
//		}
		String[] emailList = email.split("@");
		if(emailList.length==2) {
			username = emailList[0];
			domain = emailList[1];
		} else {
			System.out.println("Invalid email");
			return false;
		}
		validUsername = checkEmailChar(username);
		//case co.uk
		if(domain.endsWith(".co.uk")) {
			int extensionIndex = domain.indexOf(".co.uk");
			subdomain = domain.substring(0, extensionIndex);
			validDomain = checkEmailChar(subdomain);
		} else {
			//the normal cases like .com, .ro, .de
			extension = domain.substring(domain.lastIndexOf(".")+1, domain.length());
			subdomain = domain.substring(0, domain.lastIndexOf("."));
			
			if(extension.length()<=3 && checkEmailChar(subdomain) && subdomain.length()<=32-extension.length()) {
				for(int i = 0; i < extension.length(); i++) {
					if(extension.charAt(i) >= 97 && extension.charAt(i)<=122) {
						System.out.println("valid extension " + extension);
						validDomain = true;
					}	
				}
			} else {
				validDomain = false;
			}
			
		}

		System.out.println("email " + email);
		System.out.println("user name " + username);
		System.out.println("domain " + domain);
		
		System.out.println("subdomain " + subdomain);
		System.out.println("extension " + extension);

		return validUsername && validDomain;
	}
	
	public static boolean checkEmailChar(String email) {
		email = email.toLowerCase();
		if(email.length() <= 32) {
			for(int i=0; i<email.length(); i++) {
				if(!((email.charAt(i) >= 48 && email.charAt(i) <= 57) || 
						(email.charAt(i)>= 97 && email.charAt(i)<=122) || 
						email.charAt(i) == 45 || email.charAt(i) == 46 ||
						email.charAt(i) == 95)) {
					return false;
					
				}
			}
		} else {
			return false;
		}
		return true;
	}
	
	/**
	 * A phone number cannot contain letters, only numbers. It can start with + or with 0 and can contain spaces.
	 * The number should not have more than 15 numbers (without spaces) or less than 12.
	 * E.g.: Valid: +49 160 920 15 127, 0049 160 920 15 127, 0160 920 15 127
	 *  Invalid: 49+123 3456 1234
	 */
	public static boolean validatePhoneNumber(String phoneNumber) {
		return false;
	}
	
	/**
	 *	A password is strong enough it it has at least 8 characters and contains at 
	 *	least one Capital Letter, one number and one special character (anything that is not a letter or number, excluding spaces).
	 *	A password cannot contain spaces.
	 *	E.g.: Strong: Ih@veAnOr1g1nalPassword9, , !paS$w0rd!
	 *	Not Strong: password, password123, Password, !Password
	 */
	public static boolean validatePasswordIsStrong(String password) {
		return false;
	}

}
