package org.Scanner;

import java.util.Scanner;

//Scanner is a class

//IN scanner with the help of we can give input in the console and get an output in the console

// system ---> class
// out -- System Method
//println -- input 
//( )--- output Strime
 
// Runtime we can give an input 


//Java.utilpackage

public class Demo_One {

	
//	byte- nextbyte
//	int - nextInt 
//	short - nextshort
	
	
	public static void main(String[] args) {
//		Syntax		
		Scanner q =new Scanner(System.in);
//	    System.out.println("What is your Age");    
//	    
//	    int nextInt = q.nextInt();
//	    System.out.println("MY Age is ="+nextInt);
	    
//	    System.out.println("What's your fav Sport");
//	    String next = q.next();
//	    System.out.println(next);
		
//		After the space also the text will print 
	   
	    System.out.println("What is your name");
	    String nextLine = q.nextLine();
	    System.out.println(nextLine);
	    
		
	}
	
	
}
