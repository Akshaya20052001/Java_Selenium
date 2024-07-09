package com.Partial_Abstraction;

public abstract class Type_One {
	
//Non- AbstractMethod	
      private void ramachandran() {
    	  System.out.println("welcome to Class");
	 	  
    	  
    	  
	}

//     Abstract Method 
	public abstract void akshaya();
	

	
	
	public static void main(String[] args) {
//		Parent_class ref = new Child_class
		
		Type_One r= new Type_Two();
		r.akshaya();
		r.ramachandran();
		
	}
	
}
