package practice.java.learn;

public class Whilepayi {

	public static void main(String[] args) {
	Whilepayi varadhan=new Whilepayi();
	//varadhan.Multiple_of_3_and_5();
	//
	//varadhan.Divisors_of_given_number();
	//varadhan.print_reverse(12346);
	varadhan.Find_palindrome();

	}
	private void Find_palindrome() {
	
	int no1=1221;
	int no2=no1;
	int no3=0;
	{
		for(;no1>0;no1=no1/10)
		{
			int rem=no1%10;
			no3=(no3*10)+rem;
		}
	System.out.println(no3);
	System.out.println(no2);
	}}
	private void Divisors_of_given_number() {
		int div=2;
		int no=100;
		int count=0;
		while(no>div) {
			if(no%div==0) {
				System.out.println(div+" ");
				count=count+1;
			}
			div=div+1;
		}
		System.out.println(count);
		
	}

	private void Multiple_of_3_and_5() {
		int no=1;
		while(no<=30) {
			if(no%3==0 && no%5==0) {
				System.out.println(no);
			}
			no=no+1;
		}
	
	}
		private void print_reverse(int plate) {
			// TODO Auto-generated method stub
			while(plate>0)
			{
			System.out.print(plate%10); 
			plate = plate / 10; 
			}
		
		
		
	}
	

}
