package practice.java.learn;
import java.util.Scanner;
import java.util.Arrays;
public class Arrayvaradhan {

	public static void main(String[] args, char[] name) {
		
		Scanner sc=new Scanner(System.in);
		
		
		Arrayvaradhan Array=new Arrayvaradhan();
	//	Arrayvaradhan.a1();
	//	Arrayvaradhan.a2();//for each loop
	//	Arrayvaradhan.a3();//toString,asList,deeptoString
	//	Arrayvaradhan.a4();//
	//	Arrayvaradhan.a8(name);
		
		//char[] name=  {'v', 'a', 'r', 'a', 'd', 'h', 'a', 'n'};
		
		
	}

	private static void a8(char[]name) {
	
			char ch = 'a';
			int count = 0; 
	for(int i=0; i<name.length;i++)
	{
			{
			if(ch==name[0])
				count++; 
			}
		}
	System.out.println("Count of a is "+ count);
		}
	
	private static void a4() {
	
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		int count=r.nextInt();
		int total[]=new int[count];
		
		
		int i=0;
		while(i<count) {
			
			System.out.println("enter number");
			total[i]=r.nextInt();
			i++;
		}
		for(int i1=0;i1<count;i1++) {
			System.out.println(total[i1]);
		}
		
		
	}

	private static void a3() {
		String a[]= {"learn","coding","keypoints","education"};//single dimensional array
		
		System.out.println(" toString"+Arrays.toString(a));
		System.out.println("asList"+Arrays.asList(a));
		
		int[][]ar= {{10,20},{20,30}};
		System.out.println("deeptoString"+Arrays.deepToString(ar));
		
		
		
		
		
		
		
		
	}

	private static void a2() {
		// TODO Auto-generated method stub
		
		
		int[]a= {10,20,30};
		for(int b:a) {
			
			System.out.println(b+" ");
		}
		
	}

	private static void a1() {
		
		
		int a[]= {0,1,4,5,4,3};
		for(int i=0;i<6;i++) {
			System.out.println(a[i]);
		}
		
	}

}
