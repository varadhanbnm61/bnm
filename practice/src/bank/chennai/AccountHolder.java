package bank.chennai;//getter setter

public class AccountHolder {
	
	public static void main(String[]args) {
		
		
		Bank bb=new Bank();
	int min=bb.getminimumbalance();
	System.out.println(min);
	
	bb.setminimumbalance(3000);
	min=bb.getminimumbalance();
	System.out.println(min);}

}
