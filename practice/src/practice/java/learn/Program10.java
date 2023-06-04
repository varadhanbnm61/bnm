package practice.java.learn;
// Reverse Printing a number 23456789

public class Program10 {

	public static void main(String[] args) {
		int num=23456789;
		int count=0;
		while(num>0){
			System.out.println(num%10);
			count=count+1;
			num=num/10;
			
		}
		System.out.println(count +"count");
		

	}

}
