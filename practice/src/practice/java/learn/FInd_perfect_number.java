package practice.java.learn;

public class FInd_perfect_number {

	public static void main(String[] args) {
		
		
		FInd_perfect_number varadhan=new FInd_perfect_number();
		int result=varadhan.Find_add();
		System.out.println(result);
		int result1=varadhan.Find_multi();
		System.out.println(result1);
		if(result==result1) {
			System.out.println("given number is perfect number");
		}
		else {
			System.out.println("given number is not  perfect number");
		}
		
			
		}
		
	{
			int no=6;
			int div=1;
			while(div<no)
			{
				if(no%div==0) {
					System.out.println("6-divisors" + div);
				}
				div=div+1;
		}
	}
			
		
		private  int Find_add() {
		int no1=123;
		int sum=0;
		while(no1>0) {
			
			int rem=no1%10;
			sum=sum+rem;
			no1=no1/10;
			
		}
return sum;
		
		}		
		
		
		

	private int Find_multi() {
	int no2=123;
	int multi=1;
	{
	while(no2>0) {
		
		int rem=no2%10;
		multi=multi*rem;
		no2=no2/10;
		
	}
return multi;
}

	}
}
