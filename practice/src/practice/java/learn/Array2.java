package practice.java.learn;//using while loop 

import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] varadhan=new int[5];
Scanner sc=new Scanner(System.in); 


int i=0;
while(i<5) {
	
	System.out.println("Enter value");
	varadhan[i]=sc.nextInt();
	i++;
	
}
i=0;
while(i<5) {
	
	System.out.println(varadhan[i]);
	i++;
}


	}

}
