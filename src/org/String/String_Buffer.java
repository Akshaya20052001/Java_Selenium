
package org.String;

public class String_Buffer {
	
	
	public static void main(String[] args) {
//		Mutable
//		syntax
//		 for finding the memory value Hashcode
//      If I create a duplicate value ------>It will create a new Storage.
		
//		String refName = new String(“Data”);
//		 StringBuffer a = new StringBuffer("Chennai");
//		 System.out.println(a);
//		 
//		 StringBuffer b = new StringBuffer("chennai");
//			 
//		 int hashCode = a.hashCode();
//		 System.out.println(hashCode);
//		 
//		 int hashCode2 = b.hashCode();
//		 System.out.println(hashCode2);
		 
//  Append means -- print the both values 
//	 It will share the memory
		 
//		 StringBuffer c = b.append(a);
//		 System.out.println(c);
//		 
//		 int hashCode3 = c.hashCode();
//		 System.out.println(hashCode3);
		 
		 
//	In- Mutable
//  If I create a duplicate value-----> it will share the memory 
		 
//		String refName = “data”;
		
	String s ="Hello";
	int hashCode4 = s.hashCode();
	System.out.println(hashCode4);
	
	String r = "Hello";
	int hashCode = r.hashCode();
	System.out.println(hashCode);
	
//	concat 
	
//	If we concat  new memory of value will be stored
	
	String d = r.concat(s);
	System.out.println(d);
	
	int hashCode2 = d.hashCode();
	System.out.println(hashCode2);
   	 
		
	}

}


//sting Buffer - Synchronized - 
//* One by one Process
//* Thread will be safe 
//* slow Process

//String Builder - ASynchronized

//* Fast Process
//* Thread Unsafe.













