package program;

import java.util.ArrayList;

public class Add_all_Program {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		
		a1.add("seeta");
		a1.add("ram");
		a1.add("lakshman");
		
		System.out.println(a1);
		
	ArrayList a2=new ArrayList();
		
		
		a2.addAll(a1);
		a2.add("arjuna");
		a2.add("vishnu");
		
		System.out.println(a2);
		
		//index position.
		/*a1.add(1, "radha");
		
		System.out.println("a1 is->"+a1);*/
		
		
		//add all index and collection
		
ArrayList a3=new ArrayList();
		
		
		a2.addAll(1, a2);
		a3.add("Sarada");
		a3.add("Roopa");
		a3.add("Devi");
		System.out.println("a2 is->"+a2);
		
	
		

	}

}
