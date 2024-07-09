package org.Polymorphism;

public class Method_Overrding_One extends Method_Overriding {
	
	
	
	
	@Override
	public void apple() {
		System.out.println("my fav");
//		super.apple();
	}
	
	@Override
	public void orange() {
		System.out.println("fresh");
//		super.orange();
	}

	@Override
	public void grapes() {
		System.out.println("juice");
//		super.grapes();
	}
	
	public static void main(String[] args) {
		Method_Overrding_One a = new Method_Overrding_One();
				a.apple();
		        a.orange();
		        a.grapes();
	}
}
