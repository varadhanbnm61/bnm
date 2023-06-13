package practice.java.learn;

public class Find_power {

	public static void main(String[] args) {
		
		Find_power varadhan=new Find_power();
		int result=varadhan.Find_Power(3,3);
		System.out.println(result);
	}

	private int Find_Power(int base,int power) {
		
	int result=1;
		

		while(power>0)
		{
			
			result=result*base;
			power=power-1;
			
			
		}
		System.out.println(result);
		return result;
		
	}

}
