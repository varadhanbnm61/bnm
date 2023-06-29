package bank.chennai;

public abstract class FactoryDemo extends SmartPhone {

	
	
	 abstract void verifyFingerPrint();
	 abstract void providePattern();
	boolean originalpiece=false;
	static int price=0;
	 
	 void browse()
	 {
		 System.out.println("factory demo browsing");
	 }
	@Override
	int call(int seconds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		
	}

}
