package bank.chennai;

public class Sqltrainer extends Trainer {

	 Sqltrainer(String string, String string2) {
		super(string, string2);
		
	}
	public static void main(String[] args) {
		
		Sqltrainer ram=new Sqltrainer("CSE","Payilagham");
		int salary=ram.getsalary();
		System.out.println(salary);
		ram.training();//call parent class instance method training()
		
		//Access parent class instance variable
		System.out.println(ram.dept);
		System.out.println(ram.institute);
	}

}
