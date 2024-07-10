package program;

class Module{
	
	 void login()
	{
		
		System.out.println("login with phone");
	}
}




class override extends Module{
	
	 void login()
	{
		 super .login();
		System.out.println("login with mobile");
	}
}

public class Method_Overriding  extends override{
	
	
	void login()
	{
		super .login();
		System.out.println("login with Email");
		
		
	}
	
	
	

	public static void main(String[] args) {
		

		
		Method_Overriding c1=new Method_Overriding();
		
c1.login();
	}

}
