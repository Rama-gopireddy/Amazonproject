package program;

public class Thiskeyword {
	
	int age;
	String name;
	
	double salary;

	void details(int age,String name,double salary) {
	
		this.age=age;
		this.name=name;
		this.salary=salary;
	
	}
		
		
	
public static void main(String[] args) {
	
	
	Thiskeyword  c1=new Thiskeyword ();
	
	c1.details(20,"rama",5999);
	

	System.out.println(c1.name);

	System.out.println(c1.age);
	

	System.out.println(c1.salary);
	
		

	}

}
