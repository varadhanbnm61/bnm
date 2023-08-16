package namakal1;//page22

import java.util.Scanner;

public class Swtch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a=10,b=20,ch;
		System.out.println("Enter user choice");
		
		Scanner r=new Scanner(System.in);
		ch=r.nextInt();
		switch(ch) {
		
		case 1:System.out.print("sum"+(a+b));
		break;
		case 2:System.out.println("div"+(a/b));
		break;
		case 3:System.out.println("mul"+(a*b));
		break;
		case 4:System.out.println("rem"+(a%b));
		break;
		default:System.out.println("enter correct");
		
		
		
		
		
		
		}
	}

}
