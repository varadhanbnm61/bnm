package practice.java.learn;

public class Find_divisor1 {

	public static void main(String[] args) {
		
		Find_divisor1 varadhan=new Find_divisor1();
		int result =varadhan.Find_divi(6);
		int add =varadhan.Find_add(result);
		
	
	
	}
	

		private int Find_add(int result) {
		int div=0;
		int sum=0;
		
			while(result%div==0) {
				int rem=result%10;
				sum=result+(rem%10);
				System.out.println(sum);
			
		}
			
		return sum;
	}


		private int Find_divi(int no) {
			// TODO Auto-generated method stub
			
		
		
		int div=1;
		
		while(div<no)
		{
			if(no%div==0) {
				System.out.println(div);
			}
			div=div+1;
			
			
		}
		return div;
	}

	
	}

