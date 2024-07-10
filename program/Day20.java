package program;

abstract class class1
{
	
 abstract  void city();

 abstract void village();
 
 static void town()
 {
	 
	 System.out.println("town");
 }
 void state() 
 
 {
	  System.out.println("state");
	 
 }
}

public class Day20 extends class1{
	
	 static void country()
	 {
		 
		 System.out.println("country");
	 }
	 void abrod() 
	 
	 {
		 
		 
		 System.out.println("abrod");
		 
	 }

@Override
void city() {
	
	System.out.println( "Write city name");
}

@Override
void village() {
	
	System.out.println( "Write village name");
}

public static void main(String[] args) {
		
		Day20 c1=new Day20();
		c1.abrod();
		c1.city();
		c1.state();
		c1.village();
		town();
		country();
				
		}}

