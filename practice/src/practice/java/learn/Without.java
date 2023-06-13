package practice.java.learn;

public class Without {

	public static void main(String[] args) {
		
		    int a = 0, b = 1; 
		    int count = 0; 
		    while(count<10)
		    {
		      System.out.print(a+" ");
		      a = b-a; 
		      b = a+b; 
		      count=count+1; 
		    }
		  }
        


	}


