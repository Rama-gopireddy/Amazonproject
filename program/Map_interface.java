package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_interface {

	public static void main(String[] args) {
		
		
		Map<String,String> M1=new HashMap <String,String>();
		
		M1.put("Deepika", "Hyd");
		
		M1.put("Devi", "pakistan");
		
		M1.put("Sravani", "Indaia");
		
		System.out.println(M1);
		
		
		for(Entry<String, String> KV:M1.entrySet())
		
		{
			
			System.out.println(KV);
		}
		
		
		
		
	}

}
