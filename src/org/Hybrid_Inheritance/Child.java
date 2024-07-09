package org.Hybrid_Inheritance;

public class Child implements Father, Mother{

	@Override
	public void gold() {
		System.out.println("Gold");
		
	}

	@Override
	public void car() {
	System.out.println("Car");
		
	}

	@Override
	public void land() {
	System.out.println("Land");
		
	}

	@Override
	public void dress() {
		System.out.println("Dress");
		
	}

	@Override
	public void bike() {
		System.out.println("Bike");
		
	}
	
	
	public static void main(String[] args) {
		Child a = new Child();
		a.bike();
		a.car();
		a.gold();
		a.land();
		a.dress();
	}

}
