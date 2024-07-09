package org.Control_Statement;

public class Continue_Statement {
	
//	continue statement --- particular statement  will be skipped
	
//	other control state
	
//	continue keyword casue the loop to immedietely jumps to the next  iteration of the loop
	
	public static void main(String[] args) {
		
		for(int i = 0; i<=20; i++) {
			if (i==20) {
				continue;			
			}
			else if (i== 10) {
				continue;
				
			}
			else if (i== 15) {
				continue;
				
			}
			else if (i== 25) {
				continue;
				
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
