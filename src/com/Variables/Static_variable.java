package com.Variables;

public class Static_variable {
	
	static int g =123;
	 
	
	
	private static void m1() {
		g =435;
		System.out.println(g);

	}
		
	public static void main(String[] args) {
		
		Static_variable.m1();
		System.out.println(Static_variable.g);
		
	}
	
	
	

}
