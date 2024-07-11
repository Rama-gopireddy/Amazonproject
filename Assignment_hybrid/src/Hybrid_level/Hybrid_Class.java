package Hybrid_level;
class hybrid extends rama1
{
	
static void login()

{System.out.println("Hybrid method");

}}

class google extends hybrid
{
	
static void msoffice()

{System.out.println("msoffice");

}}


class webpage extends google
{

static void farmhouse()
{
	System.out.println("Farmhouse");
}

static void building()
{
	System.out.println("building");
}
}
public class Hybrid_Class  extends webpage{
	
	static void car()
	{System.out.println("car");
	}
	public static void main(String[] args) {
		
		superclass();
		login();
		
msoffice();
		farmhouse();
		building();
		car();
		

	}
	
	}


