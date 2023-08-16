package namakal1;


import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo sv=new ExceptionDemo();
		sv.divide();
	//	sv.stringdu();
		
	}
private void stringdu() {
		
	String s1=" ";
	System.out.println(s1.length());
	System.out.println(s1.isBlank());
	System.out.println(s1.isEmpty());
		
	}
private void divide() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	try {
	int no1=sc.nextInt();
	int no2=sc.nextInt();

	
	int result=no1/no2;
	System.out.println(result);	
	}
	catch(ArithmeticException ae) {
		System.out.println("no2 is zero .please check no2 value");
		divide();
	}
	catch(InputMismatchException ai) {
		System.out.println("please give input only numbers");
		divide();
	}
	}
}

