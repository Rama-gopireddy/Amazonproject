package program;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {

	public static void main(String[] args) {
	
		
		Map<String,Integer> m=new<String,Integer> HashMap();
		
		m.put("Rama", 28);
		
		m.put("padma", 35);
		
		m.put("Riya", 45);
		
		System.out.println(m);
		
		
Map<String,Integer> m1=new<String,Integer> HashMap();
		
		m1.put("Rama", 28);
		
		m1.put("padma", 35);
		
		m1.put("Riya", 45);
		
		//m1.putIfAbsent("Rama", 28);
		
		m1.putIfAbsent("Shilpi", 28);
		
		System.out.println(m1);
		
		System.out.println(m.equals(m1));
		
		
		
	
		
Map<String,Integer> m2=new<String,Integer> HashMap();
		
		m2.put("Rama", 28);
		
		m2.put("ramani", 35);
		
		m2.put("Roja", 45);
		
		//putall
		m2.putAll(m1);
		
		System.out.println(m2);
		
		
		//Clear
		m2.clear();
		
		System.out.println(m2);
		
		

	}

}
