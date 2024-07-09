package org.Hybrid_Inheritance;


//single
public interface Father extends Grand_Father {
	
	
	void bike();
	
	
public static void main(String[] args) {
	Father b = new Child();
	b.bike();
	b.car();
	b.gold();
	b.land();
}
}
