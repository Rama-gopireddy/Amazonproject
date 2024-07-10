package program;

public class assignment4 {
	// write a program on calculating  area of circle and finding area of circuferance and finally calling them in main method
	 final static double pi=3.14159;
	 
	 final static void area()//pi*r*r
	{
	 int r=20;
			double area=pi*r*r;
			
			System.out.println(area);
			}
	 final static void circuferance()//2*pi*r
	 {
		 int radius=40;
		 
		 	double circuferance=2*pi*radius;	
		 
		 System.out.println(circuferance);
	 }
	public static void main(String[] args) {
		
		
	/*	int r=20;
		double area=pi*r*r;
		
		System.out.println(area);
		
		int radius=40;
		double circuferance=2*pi*radius;
		
		System.out.println(circuferance);*/
		
		area();
		circuferance();
	}

}
