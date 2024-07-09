package org.Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Array_First_Class {
	
	public static void main(String[] args) {
//		Upcasting 
//		Parent class ref = new Child class
	   	List<Integer> a = new ArrayList<Integer>();
	   	
	   	List<Integer> b = new ArrayList<Integer>();
	   	
//	   	1.Add object
	   a.add(24);
	   a.add(23);
//	   a.add("Hello");
//	   a.add("Computer");
	   a.add(356);
	   a.add(29);
//	   a.add(null);
//	   a.add(null);
	 System.out.println(a);
	
	   
	   
//	   b.add(24);
//	   b.add("Hi");
//	   b.add("Hello");
//	   b.add(123);
//	   b.add("Computer");
//	   
	   System.out.println(b);
	   
////	   2.Add Index object
//	   
//	   a.add(0, "98");
//	   System.out.println(a);
////	3. size   
//	   int size = a.size();
//	   System.out.println(size);
//	   
////	   4.index of element
////	   given the element found the index
//	   int indexOf = a.indexOf("Computer");
//	   System.out.println(indexOf);
//	   
////	   5.lastindexof
//	    int lastIndexOf = a.lastIndexOf(24);
//	    System.out.println(lastIndexOf);
//	    
//	    
////	    6. contains
//	    boolean contains = a.contains("Computereee");
//	    System.out.println(contains);
//	   
//	  
	  // 7.Get(Index)
    //Object object = a.get(4);
	    //System.out.println(object);
//	    
	   // 8. set(index,element)
	   
//	      a.set(2, 100);
	     
	     //System.out.println(a); 
//	    
////	    9. remove
//	    a.remove(2);
//	    System.out.println(a);
	    
//      10. removeall 
//	    b.removeAll(a);
//	    System.out.println(b);
	    
//	11. retain all
//	   a.retainAll(b);
//	   System.out.println(a); 
//	   
//	   12.clear
//       a.clear();
//       System.out.println(a);
	   
	   
//	   13. add all(list)
//	   a.addAll(b);
//	   System.out.println(a);
	   
	   
//	  14. is Empty
//	   boolean empty = a.isEmpty();
//	   System.out.println(empty);
	   
//	   15.equal
//	   boolean equals = a.equals(b);
//	   System.out.println(equals);
       
//	   16. To array
	   Object[] array = a.toArray();
	   for (Object object : array) {
		   System.out.println(object);
		
	}
	   
//	   17.to string 
//	   String string = a.toString();
//	   int length = string.length();
//	   System.out.println(length);
//	   System.out.println(string);
//	   
	   
	   
	   Collections.sort(a);
	   System.out.println(a);
	   
	   
       
	   	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
