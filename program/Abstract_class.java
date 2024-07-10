package program;

 abstract class login{
	
	 abstract void add();
	 

	 abstract void sub();
	 
}
public class Abstract_class extends login {
	

	static void mul()
	{
		System.out.println("Loin,logout");
	}
	
	@Override
	void add() {
	System.out.println("Login ");	
		
	}

@Override
	void sub() {
		
		System.out.println("logout");
	}
public static void main(String[] args) {
		
		Abstract_class c1=new Abstract_class();
				
				c1.add();
		c1.sub();                                                                       
		mul();
	}




}
