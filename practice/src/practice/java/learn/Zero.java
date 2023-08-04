package practice.java.learn;

public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Zero ld1=new Zero();
ld1.zero1();
	}

	private void zero1() {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=9;row++) {
			
			if(row==1||row==9) {
				
			
			for(int col=1;col<=9;col++) {
				
				System.out.print("* ");
			}}
			else {
				System.out.print("* ");
				for(int space=1;space<=15;space++) {
					
					System.out.print(" ");
				}
				System.out.print("* ");
				
				
			}
		
			System.out.println();
		}
		
		
	}

}
