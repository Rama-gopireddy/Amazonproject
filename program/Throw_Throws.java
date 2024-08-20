package program;


public class Throw_Throws {

	public static void main(String[] args)throws NullpointerException, InterruptedException {
		
		System.out.println("hello");
		Thread.sleep(5000);
		
		
		System.out.println("Bye");
		
		throw new NullpointerException();

	}

}
