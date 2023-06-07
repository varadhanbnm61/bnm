package practice.java.learn;

public class Fact {

	public static void main(String[] args) {
	
		Fact varadhan=new Fact();
		varadhan.Factorial5();
		
		
		

		}	

	private int Factorial5() 		
	{
		int result=0;
		int no=5;
		int factorial=1;
		{
		while(no>0)
		{
			
			
			factorial=factorial*no;
			no=no-1;
			
			result=result+factorial;
		}
			return factorial;
		}
		// TODO Auto-generated method stub
		
	}

}
