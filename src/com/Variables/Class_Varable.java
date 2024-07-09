package com.Variables;

public class Class_Varable {
//	Declare
	byte b;
	
	private void first_Method() {
//		b=10;
		System.out.println(b);

	}
	
	private void second_Method() {
		b =15;
		b=10;
		System.out.println(b);

	}
	
	public static void main(String[] args) {
		Class_Varable b = new Class_Varable();
		b.first_Method();
		b.second_Method();
		
	}
	

}
