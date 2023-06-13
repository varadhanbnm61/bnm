package practice.java.learn;

public class Find_each_digit {
	
	
	
	
	public static void main(String[]args) {
		Find_each_digit varadhan=new Find_each_digit();
		int total=varadhan.find_each_digit(153,3);
		
	}
	
	
	  private int find_each_digit(int no,int count)
	  { 
	    int total = 0; 
	    while(no>0)
	    {
	      int rem = no%10; 
	      int each_digit_result = (int)Math.pow(rem,count);
	       
	      total = total + each_digit_result;
	      no = no/10; 
	    }
	    System.out.println(total);
	    return total; 
	  }
	  

}
