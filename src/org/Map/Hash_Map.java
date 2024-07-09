package org.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		Map<Object, Object> m = new HashMap<Object, Object>();
//		 1. put
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(1, "Override One");
		
		System.out.println(m);
		
//		2. size
		int size = m.size();
		System.out.println(size);		
//		3.contains Key
		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);	
//		4. contains Value	
		boolean containsValue = m.containsValue("Override One");
		System.out.println(containsValue);	
//		5. clear	
//		m.clear();
//		System.out.println(m);	
//		6. is empty
		boolean empty = m.isEmpty();
		System.out.println(empty);	
//		7.get
		Object object = m.get(5);
		System.out.println(object);	
//		8. ketSet
//		duplicate key doesn't allow it 	
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
//		9. value 
//		dupilcate will allow	
		Collection<Object> values = m.values();
		System.out.println(values);	
//		10. entry set
		Set<Entry<Object, Object>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		
		
		
		
		
		
		
	}
	
	

}
