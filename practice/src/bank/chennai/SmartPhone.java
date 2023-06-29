package bank.chennai;

 abstract class SmartPhone {

	abstract int call(int seconds);
	 abstract void sendMessage();
		 
	 
	 abstract void receiveCall(); 
	 
	 void browse()
	 {
		 System.out.println("smartphone browsing");
	 }
	 public SmartPhone()
	 {
		System.out.println("smartphone under development"); 
	 }
}
