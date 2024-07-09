package org.Operators;

public class Logical {
//	operations ----> symbols
//	operands ---> values
//	both operation+ operands performs operation
	
	public static void main(String[] args) {
		
		 int  a = 5;
		 int  b = 6;
		 
//       And&& ---> both value should be true
		 System.out.println((a<b)&&(a>b));//false
		 
//       Or|| ----> any one of the value should be true
		 System.out.println((a>b)||(a>b));//true
		 
//		 not!
		 System.out.println((a==b)!=(a<b));//true
		 
		 
		 
		
 
	}

}
