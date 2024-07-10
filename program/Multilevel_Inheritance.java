package program;

interface otar
{
	
void fair();
void notfair();
}


interface auth extends otar
{
	void fairotar();
	void notfairotar();

}
public class Multilevel_Inheritance implements auth {

	public static void main(String[] args)
	
	
	{
		Multilevel_Inheritance c1=new Multilevel_Inheritance();
		
		c1.fair();
		c1.fairotar();
		c1.notfair();
		c1.notfairotar();

	}

	@Override
	public void fair() 
	{
		
		System.out.println("fair");
	}

	@Override
	public void notfair()
	{
		

		System.out.println("notfair");
	}

	@Override
	public void fairotar()
	{

		System.out.println("fairotar");
		
	}

	@Override
	public void notfairotar() 
	{

		System.out.println("notfairotar");
		
	}

}
