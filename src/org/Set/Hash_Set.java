package org.Set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
	
	
	public static void main(String[] args) {
		
		Set<Object> a = new HashSet<Object>();
		Set <Object> b = new HashSet<Object>();
		
//		1. add Object
		a.add(24);
		a.add("Virat");
		a.add("Class");
		a.add(1235);
		System.out.println(a);
		
		b.add(24);
		b.add("Anushka");
		b.add("Method");
		b.add(1235);
		System.out.println(a);
		
		
////       2. size
//		int size = a.size();
//		System.out.println(size);
//		
////		3.contains
//		boolean contains = a.contains(24);
//		System.out.println(contains);
//		
////		4.remove
//		a.remove(24);
//		System.out.println(a);
//		
////		5. removeall
//		
//		a.removeAll(b);
//		System.out.println(a);
//		
		
//		6.retail all
		a.retainAll(b);
		System.out.println(a);
		
//		7.empty
//		boolean empty = a.isEmpty();
//		System.out.println(empty);
		
//		8. clear
//		a.clear();
//		System.out.println(a);
		
//		9. addall
//		a.addAll(b);
//		System.out.println(a);
		
		
//		10. equals
//		boolean equals = a.equals(b);
//		System.out.println(equals);
		
//		11. to array
		
		
//		Object[] array = a.toArray();
//		for (Object object : array) {
//			System.out.println(object);
//			
//		}
		
//		12. to string 
		String string = a.toString();
		int length = string.length();
		System.out.println(length);
		System.out.println(string);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
