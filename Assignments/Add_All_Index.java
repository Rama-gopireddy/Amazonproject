package Assignments;

import java.util.ArrayList;

public class Add_All_Index {

	public static void main(String[] args) {
		
ArrayList a1=new ArrayList();
		
		
		a1.add("seeta");
		a1.add("ram");
		a1.add("lakshman");
		
		System.out.println(a1);
		
	ArrayList a2=new ArrayList();
		
		
		a2.addAll(a1);
		a2.add("Arjuna");
		a2.add("vishnu");
		
		System.out.println(a2);
		//add all index and collection
		
		ArrayList a3=new ArrayList();
				
				
				a2.addAll(1, a2);
				
				System.out.println("a2 is->"+a2);
				
			//remove	
				
				
			a1.remove("lakshman")	;
			
			System.out.println("a1 is->"+a1);
			
			;
			System.out.println(a1.contains("ram"));
			//revoveall
			
			a2.removeAll(a1);
			
			System.out.println("a2 is->"+a2);
			
			//size of a2
			System.out.println(a2.size());
				
			System.out.println(a1.size());
			
			
			//is Empty
			
			
			
			System.out.println(a1.isEmpty());
			
			
			
			
	}

}
