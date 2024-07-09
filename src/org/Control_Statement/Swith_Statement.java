package org.Control_Statement;

public class Swith_Statement {
	
	public static void main(String[] args) {
		
// key - variable name 
//value - varible value 
//		after every case we must give break
		
		
//		the switch case only checks == whether it is same or not
		
		int a =20;
//		Switch(Key)
		switch (a) {
//		case Value
		case 2:
			System.out.println("one");
			break;	
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;

		default:
			System.out.println("2");
			break;
		}
	}

	
	
	
}
