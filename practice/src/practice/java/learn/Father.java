package practice.java.learn;

public class Father {

	public static void main(String[] args) {

		Father savee=new Father();
		savee.tamil();
		// TODO Auto-generated method stub
	}
	
	private void tamil() {
		int day = 1; 
		double amount = 1; 
		double total=0;
		while(day<=10)
		{
	System.out.println("In Day "+ day + ": "+ amount);
	amount = amount * 2;
	total=total+amount;
	day = day + 1; 
	
		}
		// TODO Auto-generated method stub
		System.out.println(amount);
	}

}
