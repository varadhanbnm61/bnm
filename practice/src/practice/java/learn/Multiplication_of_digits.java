package practice.java.learn;

public class Multiplication_of_digits {

	public static void main(String[] args) {
		
		int no=123;
		int multi=1;
		while(no>0) {
			
			int rem=no%10;
			multi=multi*rem;
			no=no/10;
			
		}
System.out.println(multi);
	}

}

	