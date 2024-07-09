package Encapsulation;

public class Demo_Two extends Demo_One {
	
	public static void main(String[] args) {
		Demo_Two a = new Demo_Two();
		
//		we need to create OBJ creation another class with that store a variable in a a data type.
		int age =a.getAge();
		System.out.println(age);
		String name =a.getName();
		System.out.println(name);
		
		
	}
	
	
	

	

}
