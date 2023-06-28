package Namakal1;

public class Theatre {//assignment 0

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		Theatre raja=new Theatre();
		int balance=raja.bookTicket(200);
		System.out.println("After booking ticket " + balance);
	
	}
	 int bookTicket(int haveamount) {
		int ticket_price=120;
		int balance=haveamount-ticket_price;
		return balance;
	}
}
