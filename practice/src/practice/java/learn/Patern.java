package practice.java.learn;

public class Patern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Patern a=new Patern();
		a.box();
		
	}

	private void box() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) {
			if(row==1||row==9) {
				System.out.print("*");
				
			}
			else
				System.out.print( " ");
			for(int col=1;col<=9;col++) {
				
				System.out.print("*");
				
				
			}
			System.out.println();
			
		}
	}

}
