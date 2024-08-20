package program;

import java.util.ArrayList;

import java.util.Collections;

public class Arraylist_program_class30 {
	
	static void sorting_method()
	{

		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(10);
		
		a1.add(50);
		
		Collections.sort(a1);
		System.out.println(a1);

		
		
		
	}

	public static void main(String[] args) {
		
		
		
		ArrayList a1=new ArrayList();
		
		//addObject-means anythinh i can store
	/*	
		a1.add("Rama");a1.add("Rama");
		a1.add("devi");
		a1.add(40);
		a1.add(true);
		a1.add('C');
		a1.add(null);
		a1.add(null);
		a1.add("Rama");a1.add("Rama");
		a1.add("devi");
		a1.add(40);
		a1.add(true);
		a1.add('C');
		a1.add(null);
		a1.add(null);
		
		
		System.out.println(a1);*/
		
		
		//Arraylist sorting

		a1.add("Devi");
		a1.add("Rama");
		
		a1.add("Priya");
		
		Collections.sort(a1);
		System.out.println(a1);
		sorting_method();
		
		
		// clear method
		/*a1.clear();
		System.out.println(a1);*/
		
		
		a1.get(1);
		System.out.println(a1.get(1));
		
		a1.set(1, "saanvi");
		
		System.out.println(a1);
		
		
	}

}
