package program;

 abstract class grandparent{
	
	 abstract	void add();
	
	 abstract void sub();
	}
 abstract class parent extends  grandparent{
		
		static void state()
		{
			
			System.out.println("Write static");
			}
		 void country()
		
		 {	
			System.out.println("Write nonstatic");
		}
@Override
	void add() {
	System.out.println("write c");
		
	}

@Override
	void sub() {
		System.out.println("write d");
		}
}

public  class Abstract_multilevel_class extends parent{
	
	static void login()
	{
		
		System.out.println("Write A");
		}
	 void logout()
	
	 {	
		System.out.println("Write B");
	}

public static void main(String[] args) {
		
		
		Abstract_multilevel_class c1= new Abstract_multilevel_class();
		c1.add();
		c1.sub();
		c1.logout();
		login();
		state();
		c1.country();
	}

}
