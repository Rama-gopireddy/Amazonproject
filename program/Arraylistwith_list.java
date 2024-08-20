package program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Arraylistwith_list {

	public static void main(String[] args) {
		
		
		System.out.println("Understanding from list");
		
		List L1=new ArrayList();
		
		L1.add(12);
		L1.add("flower");
		L1.add("I");
		L1.add("Need");
		L1.add(null);
		L1.add(null);
		System.out.println(L1);
		
		//forward traversing
		Iterator i1 =L1.iterator();
		
		while(i1.hasNext())
		{
			
			System.out.println(i1.next());
		}
ListIterator i3=	L1.listIterator();
		
		while(i3.hasNext())
			
		{
			
			System.out.println(i3.next());
			
		}
		
		
		
		
	//	ListIterator i3=	L1.listIterator();
		
		while(i3.hasPrevious())
			
		{
			
			System.out.println(i3.previous());
			
		}
			
		
		/*System.out.println("Understanding from set");
		
	
		
		    Set s1   =  new    HashSet();
		    
		    
		    s1.add(12);
			s1.add("flower");
			s1.add("I");
			s1.add("Need");
			s1.add(null);
			s1.add(null);
			
			System.out.println(s1);
			
			
			Iterator i2 =s1.iterator();
			
			while(i2.hasNext())
			{
				
				System.out.println(i2.next());
			}*/
		

	}

}
