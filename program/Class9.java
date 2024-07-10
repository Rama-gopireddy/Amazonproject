package program;

public class Class9 {
	
	static void add()
	
	{  System.out.println('1');}
	
	static void add(int a)
	{System.out.println("Hello");}
	
static void add(int a,int b)
	
	{  System.out.println('2');}

static void add(int a,int b,int c)

{  System.out.println('3');}

static void add(double a,int b)

{  System.out.println('4');}

static void add(boolean a,char b)

{  System.out.println('5');}

static void add(int a,String b)

{  System.out.println('6');}

	public static void main(String[] args) {
		
		add();
		add(100);
		add(10,70);
		add(10,50,60);
		add(10.00,50);
		
		add(true,'F');
		add(60,"Rama");
		

	}

}
