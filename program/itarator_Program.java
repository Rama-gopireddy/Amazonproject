package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class itarator_Program {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		//addObject-means anythinh i can store
	
		a1.add("Rama");
		a1.add("Ramya");
		a1.add("devi");
		
		System.out.println(a1);
		
		
/*Iterator i1	=a1.iterator();



while(i1.hasNext())
	
	
{
	System.out.println(i1.next());

}*/
		
		ListIterator i2=a1.listIterator();
		
		
		while(i2.hasNext())
			
			
		{
			System.out.println("forward itaration "+i2.next());

		}
while(i2.hasPrevious())
{
	System.out.println("backward itaration "+i2.previous());

}
		
		
		
		
	}

}
