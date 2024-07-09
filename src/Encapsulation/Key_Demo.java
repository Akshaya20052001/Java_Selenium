package Encapsulation;

public class Key_Demo {
	
	private int two() {
		int a= 12;
		return a;
	}
	
	
	public static void main(String[] args) {
		
		Key_Demo  l  = new Key_Demo();
		int two = l.two();
		System.out.println(two);
		
	}
	

}
