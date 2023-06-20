package practice.java.learn;
@FunctionalInterface
public interface Abcd {

	
	
	public static void main(String[]args) {
		
	
	System.out.println("hi");
		
	}
	
	abstract void display();
	
	default void add(int no1,int no2) {
		
		
		System.out.println(no1+no2);
		

	}
	
	
	
}


