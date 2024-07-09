package org.Casting;

//child class

public class Upcasting_Two  extends Upcasting_One{
   
	@Override
	public void land() {
		System.out.println("sold to son");
		super.land();
	}
	
	
	private void gold() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		 
//		Child_className  ref = new Parent class Name();
//		 it will show an error in the runtime  ---
		
		Upcasting_Two a = (Upcasting_Two) new Upcasting_One();
		a.gold();
		a.land();
		
		
	}
	
	
	


}
