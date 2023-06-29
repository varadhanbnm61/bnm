package bank.madurai;

public class Kid  extends Mother{

	
	String name="veera";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kid kid=new Kid();
kid.study();
//kid.work();



	}
public void work()
{
	System.out.println("work kid class");
	System.out.println(name);
	System.out.println(super.name);
	
}
public void study() {
	work();
	
	
	System.out.println("study mehod in kid class"
			+ "");
	
}
	}

