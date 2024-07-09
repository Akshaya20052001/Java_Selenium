package org.Muktiple_Inheritancce;

public interface Mother {
	
	void gold();
	
	void dress();
	 
	
	public static void main(String[] args) {
		Mother c = new Child();
		c.dress();
		c.gold();
	}

}
