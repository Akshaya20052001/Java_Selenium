package org.String;

public class String_Methods {
	
	public static void main(String[] args) {
		 
		String s = "Welcome";
	    String s1 ="welcome";
	    
//	   1. length - Return the length of the string 
	    System.out.println(s.length());
				
//       2. Equals
	    System.out.println(s.equals(s1));
	    
//	    3. equalsIgnorecase
	    System.out.println(s.equalsIgnoreCase(s1));
	    
//	    4.to uppercase
	    System.out.println(s.toUpperCase());
	    
//	    5. lowercase
	    System.out.println(s.toLowerCase());
	    
//	    6. charAt
	    System.out.println(s.charAt(3));
	    
//	    7. indexoff
	    System.out.println(s.indexOf('o'));
	    
//	    8.last index of
	   
	    String s2 ="   welcome to Java class";
	    
	    System.out.println(s2.lastIndexOf('e'));
	    
//	    9. contains
	   System.out.println(s1.contains("w"));
	   
//	   10. Startwith
	   System.out.println(s1.startsWith("w"));
	   
//	   11.Endswith
	   System.out.println(s2.endsWith("s"));
	   
//	   12.trim- trim right and left side spaces remove
	   System.out.println(s2.length());
	   System.out.println(s2.trim().length());
	   
	   
//	   13. replace
	   System.out.println(s2.replace('e', 'a'));
	   
//	   14. concat Joining the string 
	   
	   String a = "Java";
	   String b = "Selenium";
	   System.out.println(b.concat(a));
	   
//	   15. sub -string 
	   String r ="welcome";
//	   starting index - 0 1 2 3 4 5 6 
//	                    w e l c o m e
//	   Ending index   - 1 2 3 4 5 6 7  
	   System.out.println(r.substring(3, 5));
	   
	   
	   
//	   16. is empty
	   System.out.println(b.isEmpty());
	   
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
