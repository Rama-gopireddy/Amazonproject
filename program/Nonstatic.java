package program;

public class Nonstatic {
	
	void add()
	
	{
		System.out.println("Amazon");
		
	}
	
	 void sub()
	
	{
		System.out.println("Ring");
		
	}
	 
	 void method()
		
	{
		System.out.println("Shipping");
		
	}



	public static void main(String[] args) {
		Nonstatic L1=new Nonstatic ();
		L1.add();
		L1.sub();
		L1.method();

		
		
		

	}

}
