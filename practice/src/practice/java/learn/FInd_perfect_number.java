package practice.java.learn;

public class FInd_perfect_number {

	public static void main(String[] args) {
		
		
		FInd_perfect_number varadhan=new FInd_perfect_number();
		int divi=varadhan.Find_divisors(6);
		//System.out.println(divi);
		int result=varadhan.Find_add();
		//System.out.println(result);
		int result1=varadhan.Find_multi();
		//System.out.println(result1);
		if(result==result1) {
			//System.out.println("given number is perfect number");
		}
		else {
			//System.out.println("given number is not  perfect number");
		}
		
			
		}
	
	
		
	private int Find_divisors(int no) {
		
	    int div = 1;
	    int add = 0;
	    while (div<=no/2) {
	        if (no%div==0) {
	            System.out.println(div);
	            add = add + div;
	            System.out.println(add);
	        }
	        div = div + 1;
	    }
	    return add;
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
