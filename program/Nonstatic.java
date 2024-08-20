package program;

public class Nonstatic {
	
	void add(int a)
	
	{
		System.out.println("Amazon");
		
	}
	
	 void sub(double b)
	
	{
		System.out.println("Ring");
		
	}
	 
	 void method(int c)
		
	{
		System.out.println("Shipping");
		
	}



	public static void main(String[] args) {
		Nonstatic L1=new Nonstatic ();
		L1.add(100);
		L1.sub(190.00);
		L1.method(80);

		
		
		

	}

}
