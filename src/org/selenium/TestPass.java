package org.selenium;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class TestPass {

	public static void main(String[] args) {
	
		String str = "test123";
		
		String encodedString=Base64.encode(str.getBytes());
		System.out.println("encoded string:"+new String(encodedString));	
		
		byte[] decodedString=Base64.decode(encodedString);
		System.out.println("decoded string:"+new String(decodedString));
		
		
		
		
		
	}

}
