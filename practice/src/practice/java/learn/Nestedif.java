package practice.java.learn;

public class Nestedif {

	public static void main(String[] args) {
		
		Nestedif divisors=new Nestedif();
		int count=divisors.count(17);
		divisors.primenumber(count);
		divisors.greatest(100);
		// TODO Auto-generated method stub
		
		
	}
	 private void greatest(int no) 
	 {
	        int greatest = -1;
	        int smallest = 0;
	        int div = 2;
	        while (no > div) 
	        {
	        if (no % div == 0) 
	            {
	                if (smallest == 0)
	                {
	                    smallest = div;
	                }
	                greatest = div;
	            }
	           div=div+1;
	        }
	 }
	private void primenumber(int count) {
		// TODO Auto-generated method stub
	if(count==0) {
		System.out.println("prime");
	}
	else
		{
		System.out.println("no prime");
		}
		}
 

	private int count(int no)
	{
	int div=2;
	int count=0;{
		while(no>div) {
			if(no%div==0)
			{
				System.out.println(div);
				 count=count+1;
				}
	        	div=div+1;
               		
			}
	System.out.println(count);
	return count;
	}
	}
		// TODO Auto-generated method stub
		
	}
	
