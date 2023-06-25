package bank.chennai;//getter setter

public class Bank {
	
private int minimumbalance=2500;

public int getminimumbalance() {
	
	
	
	return this.minimumbalance;
}

public void setminimumbalance(int value) {
	
	if(value>2500)
	this.minimumbalance=value;
}


}
