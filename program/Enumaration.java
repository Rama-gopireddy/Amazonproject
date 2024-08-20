package program;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Enumaration {

	public static void main(String[] args) {
	Vector v=new Vector();
		
		
		
		
		
		v.add("ram");
		v.add("seeta");
		
		v.add(10);
		v.add(1.23);
		
		System.out.println(v);
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			
			
			System.out.println(e.nextElement());
		}
		
		
		
	}

}
