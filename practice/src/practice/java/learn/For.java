package practice.java.learn;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 2; i++) {
			  System.out.print(i); // Executes 2 times
			  
			  // Inner loop
			  for (int j = 1; j <= 3; j++) {
			    System.out.print(j); // Executes 6 times (2 * 3)
			  }
			} 
	}

}
