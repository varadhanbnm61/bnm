package practice.java.learn;

public class CommonDivisor {

	
	    public static void main(String[] args) {
	        int no1 = 100;
	        int no2 = 120;

	        int smallerNumber = Math.min(no1, no2);
	        int divisor = 1;

	        while (divisor <= smallerNumber) {
	            if (no1 % divisor == 0 && no2 % divisor == 0) {
	                System.out.println(divisor);
	            }
	            divisor++;
	        }
	    }
	}

