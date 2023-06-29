package bank.chennai;

abstract class HeadOffice {
	public void check_accounts(int amount) {
		System.out.println("check accounts"+amount);
		
		
	}
	public int pay_tax(int amount) {
		
		System.out.println(amount); 
		return amount;
	}
	public abstract void receive_Customers();
}

