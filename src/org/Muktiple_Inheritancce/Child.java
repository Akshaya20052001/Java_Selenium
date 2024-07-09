package org.Muktiple_Inheritancce;

public class Child implements Father, Mother{

	@Override
	public void gold() {
		System.out.println("100");
		
		
	}

	@Override
	public void dress() {
		System.out.println("50");
		
		
	}

	@Override
	public void land() {
		System.out.println("1 flat");
		
		
	}

	@Override
	public void car() {
		System.out.println("3");
	
		
	}
	public static void main(String[] args) {
		Child a = new Child();
		a.car();
		a.land();
		a.dress();
		a.gold();
	}
	

}
