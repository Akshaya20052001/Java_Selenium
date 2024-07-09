package org.Polymorphism;

//overloading

public class Poly {
	
	private void dhoni(int a) {
		a =72;
		System.out.println(a);	

	}
	
	private void dhoni(int a, byte b ) {
		System.out.println(a);
		System.out.println(b);

	}
	
	private void dhoni(byte b , int i) {
		System.out.println(b);
		System.out.println(i);	

	}
	
	private void dhoni(float k, double j) {
		System.out.println(k);
		System.out.println(j);
		
		

	}
	private void dhoni(String s) {
		System.out.println(s);
			

	}

	
	public static void main(String[] args) {
		Poly ref = new Poly();
		ref.dhoni(0);
		ref.dhoni(124, 765);
		ref.dhoni(134, 127);
		ref.dhoni(99.9f, 987654.9876);
		ref.dhoni("Hello");
	}
	
	
}
