package bank.madurai;

public class Mother extends Grandma{

	
	
	String name="Stella";
	
	
	public void work()
	{
		
		System.out.println("mother's name"+name);
		System.out.println("Grandma's name"+super.name);
		super.work();
		
		
		
	}
}
