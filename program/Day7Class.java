package program;


public class Day7Class {
	
	static void add(int a,int b)
	{ System.out.println( a+b);}
	
	
	static void sub(double a,int b)
	{ System.out.println( a-b);}
	


	static void add(char a,char b)
	
	{ System.out.println('M');}
	

	static void add(boolean a,char b)
	
	{ System.out.println("the m is true");}
	
	void add()
	
	{System.out.println(" non static");}
	
void add(int a, int b, int c)
	
	{System.out.println( a+b+c);}
	

	public static void main(String[] args) {
		
		
		/*Day7Class L1=new Day7Class();
		L1.add();
		L1.sub();
		L1.mul();*/
		
		add(10,20);
		sub(9.90,1234);
		add('M','F');
		
		add(true,'F');
		Day7Class b1=new Day7Class();
		b1.add();
		
		b1.add(100,90,80);
		/*int age =19;
		char gender ='M';
		
		if (age>=18 && gender=='M')
		{System.out.println("Full ticket");
		}
		
		if (age>=18 || gender=='F')
		{System.out.println("Free ticket");
		}
			
		
		
		if (!(age>=18 || gender=='F'))
		{System.out.println("Free ticket1");
		}*/
		
		// Non static method
		//create an object
		// classname  referencevariable=newclassname();
		//rv.non static method();
		
		
}
}
