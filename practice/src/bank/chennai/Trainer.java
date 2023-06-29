package bank.chennai;

public class Trainer {
	
	
	String dept="java";
	String institute="Payilagham";
	private int salary=10000;
	//constructor with arguments
	 Trainer(String dept, String institute) {
	
		 this.dept=dept;
		 this.institute=institute;
		 
	}
	 
	 
	public int getsalary() {
		
		return this.salary;
	}
	void training() {
		System.out.println("trainer class training method");
	}

	public static void main(String[] args) {
		
		Trainer trainerkumar=new Trainer("CSE","Payilagham");
		trainerkumar.training();
	}
}
