package bank.chennai;

public class Branch  extends Branch_plan{

	public static void main(String[]args) {
		Branch varadhan=new Branch();
		varadhan.check_accounts(1000);
		varadhan.pay_tax(2000);
		varadhan.do_interview();
		
		
		
	}
	
	
	
	
		

	
	@Override
	public void receive_Customers() {
		// TODO Auto-generated method stub
		System.out.println("receiving customers");
	}

}
