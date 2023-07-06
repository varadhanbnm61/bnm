package practice.java.learn;

public class Loopingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loopingdemo ld=new Loopingdemo();
//ld.pattern();
ld.pattern_V();



	}
	private void pattern_V() {
		// TODO Auto-generated method stub
		for(int line = 1; line<=9;line++)
		{
		    for(int star = 1; star<=7; star++)
		    {
		    	if(line<=4)
		    	{
		    		if(star==line || star==8-line)
		    		{
		    			System.out.print("*");
		    		}
		    		else
		    		{
		    			  System.out.print("  "); 
		    		}
		    	}
		    	else {
		    		if(star==4)System.out.println("*");
		    		else
		    			System.out.println("");
		    	
		    	}
		    	}
		    }
		    System.out.println();
		} 
	
	private void pattern() {
	
		// TODO Auto-generated method stub
		for(int row=1;row<=4;row++) {
		
		
		for(int column=1;column<=4 ;column++) {
			System.out.print("*");
		}
		System.out.println();
	}
	} 
}
