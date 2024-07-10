package program;

public class String_isempty_Day22 {

	public static void main(String[] args) {
		String name="Rama devi";
		System.out.println( name.isEmpty());
		
		System.out.println( name.lastIndexOf('a'));
		
		//replace r with s
		
		System.out.println( name.replace('R','s'));
		
		
		//Replace entir space given string
		
		System.out.println(name.replaceAll(" ",""));
		
		//replace devi with gopireddy in given string with space and without space
		
		System.out.println(name.replaceAll(" devi","gopireddy"));
		
		System.out.println(name.replaceAll(" devi"," gopireddy"));
		
		
		String a="School123";
		//in the given string remove all the numaric value
		
		System.out.println(a.replaceAll("[0-9]","" ));
		//in the given string remove all the lowercase letters
		
		System.out.println(a.replaceAll("[a-z]","" ));
		
		//in the given string remove all the uppercase letters
		
		System.out.println(a.replaceAll("[A-Z]","" ));
		
		//String matches
		
		// Your string let say Rama devi , check with ends with i
		
		System.out.println(name.matches("(.*)i") );
		
		
		// Your string let say Rama devi , check with start with i
		
				System.out.println(name.matches("i(.*)") );
				
				
				
				// Your string let say Rama devi , check with middle with d
				
						System.out.println(name.matches("(.*)d(.*)") );
						// Your string let say 3 letters  , check 
						String b="tom";
						
						System.out.println(b.matches("...") );
						//lets say name
						System.out.println(name.matches("Rama devi") );
						System.out.println(name.matches(".........") );
						
						
	}

}
