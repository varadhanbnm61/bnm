package bank.chennai;

public class Sqltrainer extends Trainer {

	public Sqltrainer(String string, String string2) {
		super(string, string2);
		
	}
	public static void main(String[] args) {
		
		Sqltrainer ram=new Sqltrainer(null, null);
		int salary=ram.getsalary();
		System.out.println(salary);
		ram.training();
		
		
	}

}
