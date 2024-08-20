package program;

class newclass

{
	 private int age =18;
	public void setAge(int age )
	{
		this.age=age;
		
	}
	
	public int getAge()
	{
		return age;
		
	}
	

}

class Encapsulation {

	public static void main(String[] args) {
		
		newclass p1=new newclass();
		
		System.out.println(p1.getAge());
		p1.setAge(60);
		System.out.println(p1.getAge());
		
		

	}

}
