package practice.java.learn;//total array
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int len=sc.nextInt();
		
		
		
	int[]ar=new int[len];
	
	int total=0;
	for(int i=0;i<ar.length;i++) {
		System.out.println("value");
		ar[i]=sc.nextInt();
		total=total+ar[i];
	
	}
	System.out.println(total);
	for(int i=0;i<ar.length;i +=2){
		
		System.out.println(ar[i]);
		
	}
	}

}
