package practice.java.learn;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no1. ");
	    
	    double no1 = sc.nextDouble();
	    System.out.println("Enter no2. ");
	    
	    int no2 = sc.nextInt(); 
	    System.out.println("Result is ");
	    
	    System.out.println(no1*no2);	   
	    System.out.println("Tell me your name ");
	    
	    boolean name = sc.hasNextLong((int) 10);
	    System.out.println("Welcome to IT World "+ name);

	}

}
