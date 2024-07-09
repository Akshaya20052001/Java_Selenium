package org.Constructor;

public class Demo_One {
//	Non parameterized
	
	public Demo_One() {
		System.out.println("Constructor");
		int a =13;
		System.out.println(a);
			
	}
	
//	parameterized
	
	public Demo_One(int a){
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		Demo_One s = new Demo_One();
		Demo_One s1 = new Demo_One(12);
	}
	

}

//constructor is a special type of method.
//Constructor  used for intializing the class variable 
//constructor name should be same as class Name.
//constructor  will not return any value [not even a void]
//constructor will be invoked at the time of object creation 
//we can invoke only one constructor at a time using single object.

//Types of constructor

//1. defualt constructor
//2. Parameterized constructor
//3. Non-Parameterized constructor




//Methos V/S Constructor

//Method name can be anything 
//Method can return a vlaue 
//Need to call method explicity 

//Constructor name must be same as class name
//Constructor does not return a value. 
// Automatically invoked at the time of object creation 
