package practice.java.learn;

public class Fib {

	public static void main(String[] args) {

		        int n = 10;
		        int first = 0;
		        int second = 1;
		        System.out.println("Fibonacci series up to " + n + " terms:");
		        int count = 0;
		        while (count < n) {
		            System.out.print(first + " ");
		            int next = first + second;
		            first = second;
		            second = next;
		            count++;
		        }
		    }
		
	}

