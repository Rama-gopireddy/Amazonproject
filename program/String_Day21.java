package program;

public class String_Day21 {

	public static void main(String[] args) {
		
		String name="My name is Rama";
		System.out.println(	name.length());
		System.out.println(name.toUpperCase());
	String batch_name="Ab43bymkt";
	System.out.println(	batch_name.toLowerCase());
	System.out.println(	batch_name.charAt(6));
	System.out.println(batch_name.indexOf('y'));
	String a="automation                              batch";
	System.out.println(a.trim());
	String b="       automation batch          ";
	System.out.println(b);
	System.out.println(b.trim());
	String batch_name1="Ab43bymkt";
	System.out.println(batch_name.equals(batch_name1));

	//manish and Manish and MANISH
	System.out.println(batch_name.equals("ab43bymkt"));
	String student_name="rama";
	String student_name_1="rama";
	
	System.out.println(student_name.equals(student_name_1));
	System.out.println(student_name.equalsIgnoreCase(student_name_1));
	
	System.out.println(name.contains("rama"));
	System.out.println(name.substring(2));
	System.out.println(name.substring(0, 6));
		
		
		

	}

}
