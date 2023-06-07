package practice.java.learn;

public class Balaneon {

	public static void main(String[] args) {
		

	  
		  Balaneon Test = new Balaneon();  int n=9;
		    int count2 =Test.lum(9);
		    int count =Test.adds(81);
		    
		  if (n==count) {   System.out.println(count + " " + "It is a Neon Number");
		     }
		     else {
		   System.out.println(count + "" + "It is not a Neon Number");  }
	
		 }
		 private int adds(int value ) {
		  
		  int a=0;  int count=0;
		  while(value>1){   a=value%10;
		   count=count+a;   value=value/10;
		     }
		    return count;
		    
		 }
		 private int lum(int num) {  
		  int count2 = (int) Math.pow(num, 2);  return count2;
		   }
		

	}
	}


