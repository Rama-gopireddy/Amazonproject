package program;

interface add //Achieve 100% abstraction

{ 
	void google();// abstract method
	
	void logout();// abstract method
	
} 

public class Interface implements add {
	
	@Override
	public void google() 
	{
		System.out.println("google");
		
	}

	@Override
	public void logout() 
	{
		System.out.println("logout");
		
	}

	public static void main(String[] args) {
		
		Interface c1=new Interface();
		c1.google();
		c1.logout();
		

	}


}
