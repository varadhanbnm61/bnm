package Trichy;

public class ABCEmployee implements EmployeeRules {
    
	public static void main(String[] args) {
		
		ABCEmployee abc=new  ABCEmployee();
		abc.maintainHours();
		abc.dress();
		abc.relocate();
	
	
		System.out.println(ABCEmployee.leaves);
		System.out.println(ABCEmployee.salary);

	}




	@Override
	public void relocate() {
		// TODO Auto-generated method stub
		System.out.println("other city");
	}

	@Override
	public void report() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void maintainHours() {
		// TODO Auto-generated method stub
		
	}

}
