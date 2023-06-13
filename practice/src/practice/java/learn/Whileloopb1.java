package practice.java.learn;

public class Whileloopb1 {

	public static void main(String[] args) {
		Whileloopb1 varadhan=new Whileloopb1();
		int result=varadhan.ba1();
		System.out.println(result);
	}

	private int ba1() {
		int day=1;
		int savings=0;
		int money=5;
		while(day<=10)
		{
			savings=savings+money;
			day=day+1;
			
			
		}
		return savings;
	
	}

}