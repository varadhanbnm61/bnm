package practice.java.learn;

public class Find_divisors_add {

	public static void main(String[] args) {
	
		Find_divisors_add varadhan=new Find_divisors_add();
		int add=varadhan.Find_add(6);
		System.out.println(add);
		int multi=varadhan.Find_multi(6);
	
		if(add==multi) {
			System.out.println("given number is perfect number");
		}
		else
		{
			System.out.println("given number is not perfect number");
		}
	}
			
	private int Find_add(int no) {
		

	    int div = 1;
	    int add = 0;
	   int multi=1;
	    while (div<=no/2) {
	        if (no%div==0) {
	            //System.out.println(div);
	            add = add + div;
	           multi=multi*div;
	        }
	        div = div + 1;
	    }
	    System.out.println(add);
	    System.out.println(multi);
	    return add;
	   
	}
		
	private int Find_multi(int no) {
		   int div = 1;
		    int add = 0;
		   int multi=1;
		    while (div<=no/2) {
		        if (no%div==0) {
		            //System.out.println(div);
		          
		           multi=multi*div;
		        }
		        div = div + 1;
		    }
		    
		  
		    return multi;
	}
		
		
		
		
	}