package program;

public class non_static_global_variable {

int noofdays=365;

int days=31;//declare and inilize in single line
	
 static String name;
 
 static double d1;

	public static void main(String[] args) {
		
		
		non_static_global_variable s1= new non_static_global_variable();
		
		System.out.println(s1.noofdays);
		s1.noofdays=366;
		
		System.out.println(s1.noofdays);
		
		System.out.println(name);
		System.out.println(d1);
		
		
	}

}

