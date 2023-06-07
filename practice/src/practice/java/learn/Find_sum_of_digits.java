package practice.java.learn;

public class Find_sum_of_digits {

	public static void main(String[] args) {

		Find_sum_of_digits varadhan=new Find_sum_of_digits();
		int result=varadhan.Sum_of_digits(81);
		System.out.println(result);
		int no1=9;
		int no2=2;
		int square=varadhan.Square_of_digits(no1,no2);
		System.out.println(square);
	
		
	
	if(result==no1)
	{
		System.out.println("given number is neon number");
	}
	else {
		System.out.println("given number is not neon number");
		
	}
	
	
	
	}
	private int Square_of_digits(int no1, int no2) {
		int box=1;
		while(no2>0)
		{
		box=box*no1;
		no2=no2-1;
			
		}
		return box;
			
			
	}
		
	

	private int Sum_of_digits(int no) {
		
		int sum=0;
		while(no>0)
		{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
		
		}
		return sum;
		// TODO Auto-generated method stub
		
	}
}
