package practice.java.learn;

public class Loopingprgms {

	public static void main(String[] args) {
	
		
		Loopingprgms ld=new Loopingprgms();
		//ld.pattern1();
	//	ld.patternc();
	//	ld.patterni();
		//ld.patternt();
		ld.pattern9_c_box();
	}

	private void pattern9_c_box() {

		for(int row=1;row<=9;row++) {
			if(row==1||row==9) {
				
				
			
			for(int col=1;col<=9;col++) {
				if(col==1||col==9) {
					System.out.print("  ");
				}else
					
				
				System.out.print("* ");
			}}
			
			else {
				
				System.out.print("*");
				for(int space=1;space<=15;space++) {
					System.out.print(" ");

				}
				System.out.print("*");
				
			}
			System.out.println();
			
			
			
			
		}}
	
	private void patternt() {
		// TODO Auto-generated method stub
		
		for(int star=1;star<=7;star++) {
			System.out.print("* ");
		}
		System.out.println();
	for(int star=1;star<=7;star++) {
		for(int space=1;space<=6;space++) {
			
			System.out.print(" ");
		}
		System.out.println("* ");
	}
	}
	private void patterni() {
		
		for(int star=1;star<=7;star++) {
			System.out.print("* ");
		}
		System.out.println();
	for(int star=1;star<=7;star++) {
		for(int space=1;space<=6;space++) {
			
			System.out.print(" ");
		}
		System.out.println("* ");
		
		
	}
	for(int star=1;star<=7;star++) {
		System.out.print("* ");
		
	}}
	
	

	private void patternc() {
		// TODO Auto-generated method stub
		
		
		for(int star=1;star<=7;star++) {
			System.out.print("* ");
		}
		System.out.println();
	for(int star=1;star<=7;star++) {
		System.out.println("* ");
		
		
	}
	for(int star=1;star<=7;star++) {
		System.out.print("* ");
	}
	}
	private void pattern1() {
		for(int row=1;row<=7;row++)
		
		{
		for(int col=1;col<=5;col++) {
			System.out.print("* ");
		}
		System.out.println();
		
		
	}

}
}
