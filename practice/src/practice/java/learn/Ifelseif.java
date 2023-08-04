package practice.java.learn;

public class Ifelseif {

	public static void main(String[] args) {
	
		Ifelseif learning=new Ifelseif();
		//learning.l1(190,90);
		//learning.if1(20);
		//learning.ifelse2(21);
		
		//learning.leap(2010);
		learning.ifelseif();
		

	}

	
	private void ifelseif() {
		int age=40;
		if(age>40) {
			System.out.println("age is less dhan 40");
			
		}	
			
		else if(age==40)
		{
		System.out.println("age is eqaul to 40");	
		}
		else {
			System.out.println("age is greater dhna 40");
		}
		
		
		
	}


	private void leap(int i) {
		if((i%4==0)&&(i%100!=0)||(i%400==0)) {
		System.out.println("given year is leap year");	
		}
		else {
			System.out.println("not leap year");
		}
		
	}


	private void ifelse2(int number) {
		
		if(number%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}


	private void if1(int age) {
		
		if(age>18) {
			System.out.println("age is greater than 16");
		}
	}


	private void l1(int vk,int msd) {
	
	
		if(vk>msd) {
			System.out.println("vk ");
		}
		else if(msd>vk){
			System.out.println("msd");
		}
		else
		{
			System.out.println("msd,vk");
		}
		
	}

}
