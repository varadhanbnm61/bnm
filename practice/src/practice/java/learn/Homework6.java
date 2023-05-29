package practice.java.learn;

public class Homework6 {

	public static void main(String[] args) {
		int no1=1;
		int no2=2;
		int no3=3;		
		int p=1;
		while(p<=5)
		{
			int result=no1*no2*no3;
			System.out.println(no1+"*" +no2+ "*" + no3 + "=" +result);
			no1++;
			no2++;
			no3++;
			p++;	
		}
	}
}

