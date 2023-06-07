package practice.java.learn;

public class Aromstrong {

	public static void main(String[] args) {
	 int no=153;
	 int arm=0;
	 int no2=no;
	 while(no>0)
	 {
		 int rem=no%10;
		 arm=arm+(rem*rem*rem);
		 no=no%10;
		
		 
		 
	 }
	if(no2==arm)
	{
		System.out.println(arm);
	}
	 

	}

}
