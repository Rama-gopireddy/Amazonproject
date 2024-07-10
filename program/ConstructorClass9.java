package program;

public class ConstructorClass9 {

	
	ConstructorClass9()
	{
	System.out.println( "Login");}
	
	
	ConstructorClass9(int a)
	{
	System.out.println( "Login to the amazon");}
	
	ConstructorClass9(String name)
	
	{
		
	System.out.println( "amazon");}
	
	
	public static void main(String[] args) {
		
		
		ConstructorClass9 L1=new ConstructorClass9();
		
		//another way to create an object
		
		new ConstructorClass9();
		
		new ConstructorClass9(100);
		
		new ConstructorClass9("name");
	}

}
