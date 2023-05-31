package practice.java.learn;
public class Looping2 {
	      public static void main(String[] args) {
	      Looping2 loopingObj = new Looping2(); 
	      int count = loopingObj.count_divisors(100);
	      loopingObj.find_prime_no(count);
	      loopingObj.findgreatestandsmallestdivisor(100); 
	      }
	      private void findgreatestandsmallestdivisor(int no)
	      {
	      int div = 2; 
	      int smallest = -1;
	      int greatest = 0;
	      while (div<no) 
	      {
	      if (no%div==0)
	      {
	               if(smallest==-1)
	              {
	              smallest=div;
	                }
	               greatest=div;
	      }          
	               div++;
	      }
	              if(greatest==0) 
	              {
	              System.out.println("No");
	               }
	              else
	              {
	              System.out.println("Smallest"+smallest);
	              System.out.println("Greatest"+greatest);
	                }
	                }
	      private void find_prime_no(int count) {
	      if(count==0)
	      {
	      System.out.println("Prime number");
	      }
	      else
	      {
	      System.out.println("Not Prime");
	      }
	    
	      }
	      private int count_divisors(int no) {
	      int div = 2; 
	      int count = 0; 
	      while(div<no)
	      {
	      if(no%div==0)
	      {
	        count = count + 1; 
	      }
	      div = div + 1; 
	      }
	      System.out.println("Count of divisors "+count);  
	      return count; 
	      }
	      }