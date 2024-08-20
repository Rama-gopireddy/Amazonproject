package program;
class Parentclass
{
	
	void add()
	
	{
		
		
		
	}
void sub()
	
	{
		
		
		
	}
	
	
	
}




public class upcasting extends Parentclass{
	
	
	
void mul()
	
	{
		
		
		
	}
	
void divi()

{
	
	
	
}
	

	public static void main(String[] args) {
		
	//upcasting-implicility	
	Parentclass p1	=new upcasting();
	
	p1.add();
	p1.sub();
	
	//explicility syntax for up casting
	
Parentclass p2	= (Parentclass)new upcasting();
	
	//down casting 


  upcasting u1= (upcasting)p1;
	u1.add();
	u1.sub();
	u1.divi();
	u1.mul();
		

	}

}
