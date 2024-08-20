package program;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_newmethods {

	public static void main(String[] args) {
		
		Map<String,Integer> m= new  HashMap <String,Integer>();
		
		
		m.put("Teena", 40);
		m.put("Leena", 30);
		m.put("Reena", 40);
		System.out.println(m);
		
		
		
		//contains
		
		System.out.println(m.containsKey("Teena"));
		
		System.out.println(m.containsValue(50));
		
		
	/*	//remove
		
		m.remove("Teena");
		System.out.println(m);
		m.remove("Leena", 30);
		
		System.out.println(m);
		//replace
		
		m.replace("Reena", 40, 45);
		

		System.out.println(m);*/
		
		//Key set
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
	System.out.println(m.entrySet());
	
	
	//for to get key s
	
	
	for(String key:m.keySet())
	
	{
		
		System.out.println(key);
	}
	
	for(Integer value:m.values())
		
	{
		
		System.out.println(value);
		
	
		}
		
	
	for(Entry<String, Integer> KV:m.entrySet())
		
	{
		
		System.out.println(KV);
		
	
		
		
	}
		
	}

}
