package practice.java.learn;

public class Printreverse {

	public static void main(String[] args) {
		Printreverse printing=new Printreverse();
		printing.print_reverse(75239);
		printing.count_of_digits(75239);
		
	}
			
	private void count_of_digits(int no) {
		// TODO Auto-generated method stub
		int count = 0; 
		while(no>0)
		{
			//System.out.println(no%10);
			no = no/10; 
			count = count +1; 
		}
		System.out.println(count);
	}
			private void print_reverse(int cake) {
		
				while(cake>0)

			{
				System.out.println(cake%10);
				cake = cake/10; 
			}
				
				
				private void print_straight_order(int no) {
					// TODO Auto-generated method stub
					int div = 1000;
					while(div>=1)
					{
				System.out.println(no/div+ " ");  // ==> 1
					no = no%div; //no = 234
					div = div/10; 
					}
				}
				
				
	637503     606202   625002  627001   600042
			ராநாொை
		}
		

	}


