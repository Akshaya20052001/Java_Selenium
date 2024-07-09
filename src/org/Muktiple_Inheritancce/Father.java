package org.Muktiple_Inheritancce;

public interface Father {
	
	void land();
	
	void car();
	
	public static void main(String[] args) {
		Father b = new Child();
		b.car();
		b.land();
	}

}
