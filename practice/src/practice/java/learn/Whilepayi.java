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
		int no=171;
		int no1=no;
		for(;no>0;no=no/10) {
			System.out.print(no%10);
			
			no=no*10;
		}
		
		System.out.println(no);
			if(no1==no) {
				System.out.println("given no is palindrome");
			}
			else {
				System.out.println("given no is not palindrome");
				
				
			}
		
		
	}

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
