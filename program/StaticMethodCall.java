package program;

public class StaticMethodCall {
	
	static void addtion()
	{
		
		System.out.println("addtion");
}
	
	static void sub()
	{
		
		System.out.println("subtraction");
}
	
	static void mul() 
	{
		
		System.out.println("multiply");
}

	public static void main(String[] args) {
		
		
		addtion();
		sub();
mul();
		System.out.println("mainmethod");
		
		addtion();
		sub();
mul();
	}

}
