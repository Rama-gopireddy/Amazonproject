package program;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Itarator {

	public static void main(String[] args) {
		
		
	
 Map<String,String> M1=new HashMap <String,String>();
		
		M1.put("Deepika", "Hyd");
		
		M1.put("Devi", "pakistan");
		
		M1.put("Sravani", "Indaia");
		
		//System.out.println(M1);
		
		
		Iterator<Entry<String,String>> KV =M1.entrySet().iterator();
		
		while(KV.hasNext())
			
			
		{
			
			System.out.println(KV.next());
		}

	}

}
