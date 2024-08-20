package program;

class parentpoli
{
	void login()
	{
		System.out.println("email login");
		
	}
	

}

public class Runtime_polymar extends parentpoli {
	
	
	void login()
	{
		System.out.println("mobile login");
		
	}

	public static void main(String[] args) {
		
		
		Runtime_polymar r1=new Runtime_polymar();
		
		r1.login();
		
		parentpoli p1=new parentpoli();
		
		p1.login();
		
		
		
		

	}

}
