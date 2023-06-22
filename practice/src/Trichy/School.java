package Trichy;//constructor
class School {
	
	
	
	String name;//null
	int rollNo;


	
	//1)constructor will be named after class name
	//2)no return datatypes
	
	//3)constructor gets called automatically when we create objects
	//4)constructor initializes object specific values
	//paramaterized constructor:
	//
	public School(String name, int rollNo) {
		// TODO Auto-generated constructor stub
		System.out.println("How are you");
		this.name = name; 
		this.rollNo = rollNo;
	}
	//construcor overloading
	
	public School(String fName, String lName, int rollNo) {
		// TODO Auto-generated constructor stub
			this.name = fName+lName; 
			this.rollNo = rollNo;
	}
	public static void main(String[] args) {
		
School student1=new School("barani", 100);
School student2=new School("varadhan", 200);
School student3=new School("baradhan", 300);
School student31=new School("baradhan","varadhan",300);
/*
 * System.out.println(student1.name); System.out.println(student2.name);
 * System.out.println(student2.rollNo);
 */


student1.writeexam();
student2.participate();
student31.participate1();


	}

	private void participate1() {
		System.out.println();
		
	}

	private void participate() {
		// TODO Auto-generated method stub
		
		System.out.println(rollNo);
	}

	private void writeexam() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
