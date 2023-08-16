package namakal1;//throw keyword user defined exception

public class Bank {

	public static void main(String[] args) {
		
		
		Bank customer=new Bank();
		customer.deposit(-100);

	}

	private void deposit(int amt) {
		// TODO Auto-generated method stub
		
		if(amt>0) {
			System.out.println("go ahead");
		}
		else {
			
		//	AmountException ame=new AmountException();
			//throw ame;
			throw new AmountException();
		}
	}

}
