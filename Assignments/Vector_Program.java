package Assignments;

import java.util.Vector;
import java.util.Collections;
import java.util.ListIterator;

public class Vector_Program {
	
/*
	static void sorting_method()
	{

		Vector V1=new Vector();
		V1.add(20);
		V1.add(10);
		
		V1.add(50);
		
		Collections.sort(V1);
		System.out.println(V1);

		
		
		
	}*/

	
		

public static void main(String[] args) {
			
			
			
			Vector V1=new Vector();
			
			//addObject-means anythinh i can store
			/*
			V1.add("Rama");
			V1.add("devi");
			V1.add(40);
			V1.add(true);
			V1.add('C');
			V1.add(null);
			V1.add(null);
			V1.add("Rama");
			V1.add("devi");
			V1.add(40);
			V1.add(true);
			V1.add('C');
			V1.add(null);
			V1.add(null);
			
			
			System.out.println(V1);*/
			
			
			//vector sorting

			V1.add("Devi");
			V1.add("Rama");
			
			V1.add("Priya");
			
			//Collections.sort(V1);
			System.out.println(V1);
		//	sorting_method();
			
			
	ListIterator l1		=V1.listIterator();
	
	while(l1.hasNext());
			
	{
		System.out.println(l1.next());
	}
	
	
	
	while(l1.hasPrevious());
			
	{
		System.out.println(l1.previous());
	}
	
	
	
	
	
	
	
	
	}
			
		
	

		
		

	}


