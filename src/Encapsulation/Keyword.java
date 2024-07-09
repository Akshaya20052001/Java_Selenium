package Encapsulation;

public class Keyword {
	
//	void
	private void one() {
		int i = 10;
		System.out.println(i);

	}
// return 

	private int two() {
		int a= 12;
		return a;
	}
	
	public static void main(String[] args) {
		Keyword r = new Keyword();
		int p = r.two();
		System.out.println(p);
		r.one();
		
		
	}
	
	
	
	

	

}
