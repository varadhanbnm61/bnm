package Namakal1;

public class Child  extends Parent
{
	
	public static void walk()
	{
		System.out.println("child is walk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent obj=new Child();//refernce is of parent class and object is of child class
Parent obj2=new Parent();//refernce is of parent class and object is of parent class
obj.walk();
obj2.walk();


	}

}
