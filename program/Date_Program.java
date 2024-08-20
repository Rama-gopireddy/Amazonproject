package program;

import java.util.Date;

public class Date_Program {

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		
	
		Date d2=new Date(d1.getTime());
		System.out.println("current time--->"+d2);
	String human=	d2.toString();
	
	String day=human.substring(8, 10);
	
	
	System.out.println(day);
	
	String month=human.substring(4, 7);
	
	System.out.println(month);
	
String year=human.substring(24, 28);
	
	System.out.println(year);
	
	
	//human 
		
		Date d3=new Date(d1.getTime()+(1000*60*60*24*24));
		System.out.println("future time--->"+d3);
		
		Date d4=new Date(d1.getTime()-(1000*60*60*24*1));
		System.out.println("past time--->"+d4);
		

	}

}
