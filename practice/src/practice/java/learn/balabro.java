package practice.java.learn;

public class balabro {

	public static void main(String[] args) {

		  
		balabro armstrong =new balabro();
		int Total1 =armstrong.num (153);
		int i=153;

		if (Total1==i) {
		 
		 System.out.println( i + "is an Armstrong number");
		}
		  
		else {
		 System.out.println(i + " Is not an Armstrong number");
		}
		 

		 }

		 private int num(int i) {
		  int Total=0;
		  int Total1=0;
		  int count=0;
		  int count1=3;
		  while (i>0) {
		   count = i%10;
		   int count2 = (int) Math.pow(count, count1);
		   System.out.println(count2);
		   Total1=Total+count2;
		   i=i/10;
		   
		  }
		  System.out.println(Total1);
		  
		  return Total1;
		  
		  
		  
		  
		 
}
}
