package taminadu.chennai;
 import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ar=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length;i++){
		
			System.out.print("Enter value");
		
			ar[i]=sc.nextInt();
		
		}
		
		int i=0;
		
		while(i<5) {
			
			System.out.println(ar[i]);

			i++;
		}
	
	}

}
