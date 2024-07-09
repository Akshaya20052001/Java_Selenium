package com.Fully_Abstraction;

public class Daughter implements Home_Appliances {

	@Override
	public void toaster() {
	  System.out.println("Toaster");
		
	}

	@Override
	public void oven() {
		System.out.println("Oven");
		
	}

	@Override
	public void fridge() {
		System.out.println("Fridge");
		
	}
	
	
	public static void main(String[] args) {
		Daughter a = new Daughter();
		a.fridge();
		a.oven();
		a.toaster();
		
	}
	
	


}
