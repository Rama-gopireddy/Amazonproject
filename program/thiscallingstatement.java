package program;

public class thiscallingstatement {
	
	
	thiscallingstatement()
	{
		System.out.println("non para");
		
	}
	
	thiscallingstatement(int age)
	{
		this();
		System.out.println(age);
		
		
	}
	
	thiscallingstatement(String name)
	{
		this(100);
		System.out.println(name);
		
		
	}
	

	public static void main(String[] args) {
		
 new thiscallingstatement("Rama");}

}
