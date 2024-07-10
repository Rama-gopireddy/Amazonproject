package program;

class ritvik{

 void house()
{
	System.out.println("grand pa has house");
}

}

class bhavik extends ritvik
{
 void land()
{
		
	System.out.println("dad has land");}

}

public class child_nonstatic extends bhavik

{
 void apartment()
{
	
System.out.println("kid has apartment");
}

public static void main(String[] args) {
	child_nonstatic a1=new child_nonstatic ();
			a1.apartment();
	a1.land();

		
}

}
