package Assignments;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Linked_Hashset_program {

	private static final String LinkedHashSet = null;
	public static void main(String[] args) {
		LinkedHashSet LH1=new LinkedHashSet();
		
		LH1.add("Rama");

		LH1.add("Aanjani");
		
		LH1.add("Vanaja");
		LH1.add(100);

		LH1.add(80.98);
		
		LH1.add(true);
		
		LH1.add('C');
		//LH1.add("Vanaja");not accepting duplicate
		
		
		LH1.add(null);
		
		//Collections.sort(LH1); not sorting

		
		
		System.out.println(LH1);
		
		
		
		
		
	}

}
