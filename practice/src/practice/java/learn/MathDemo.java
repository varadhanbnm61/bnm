package practice.java.learn;

public class MathDemo {

	public static void main(String[] args) {
		int no=-125;
		System.out.println(no);
		no=Math.abs(no);
		System.out.println(no);
		
		double d=1.2345678;
		d=Math.ceil(d);
		System.out.println(d);
		d = Math.floor(1.23456789);
		System.out.println(d);
		
		d = Math.pow(10, 2); //Method Calling
		System.out.println(Math.pow(10, 2));		
		System.out.println(Math.sqrt(64));

	}

}
