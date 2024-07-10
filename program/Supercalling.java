package program;
class countryconstructor{
	countryconstructor(String a)
	{
		System.out.println("countryconstructor");
		
	}
	
	countryconstructor()
	
	{
		System.out.println("countryconstructor1");}
	
}

class Staticconstructor extends countryconstructor {
	
	Staticconstructor(int a)
	
	{
		super();
		System.out.println("Staticconstructor");}
	}

public class Supercalling extends Staticconstructor{
	
	Supercalling()
	
	{super(120);//implicity or explicity
		System.out.println("Superclassconstructor");
		}
	public static void main(String[] args) {
		
		new Supercalling();
		

	}

}
