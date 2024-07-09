package com.Fully_Abstraction;

public interface Home_Appliances {
	
	void toaster();
	void oven();
	void fridge();
	
	
	public static void main(String[] args) {
		
		Home_Appliances sathish = new Daughter();
		sathish.fridge();
		sathish.oven();
		sathish.toaster();
		
	}
	
	

}
