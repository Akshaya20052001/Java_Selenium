package org.Polymorphism;

public class Casting {
	
//	Typecasting

	
	public static void main(String[] args) {
//	widening	
//		LOwer ---> to higher
		
		byte b =12;
		int i =b;
		System.out.println(i);
		
		
// Narrowing 
		
//		Higher ---> to Lower
		
		long l =12345l;
		byte a = (byte) l;
		System.out.println(a);
		
		
	}
	
	
	
}
