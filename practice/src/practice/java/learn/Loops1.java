package practice.java.learn;

public class Loops1 {

	public static void main(String[] args) {
		
Loops1 ld=new Loops1();
//ld.pattern1();
//ld.patternc();
//ld.patterni();
//ld.pattern9();
ld.patternc1();

	}

	private void patternc1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=8;row++) {
			if(row==1||row==8) {
			for(int col=1;col<=8;col++) {
				if(col==1||col==8) {
					System.out.print(" ");
				}
				else
				
				System.out.print("* ");
			}
			}
			else {
				System.out.print("*");
				for(int space=1;space<=12;space++) {
					System.out.print(" ");
			
				}
			System.out.print("*");
			}
			
			
		System.out.println();
		}
		
	}
	

	private void pattern9() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				
				System.out.print("*");
			}
		System.out.println("");
		}
		
	}

	private void patterni() {
	    // TODO Auto-generated method stub
	    for(int star=1; star<=7; star++)
	    {
	      System.out.print("* ");
	    }
	   System.out.println("");
	    for(int star=1; star<=6; star++)
	    {
	    	for (int space=1;space<=6;space++) {
	    		System.out.print(" ");
	    	}
	      System.out.println("*");
	    }
	    for(int star=1; star<=7; star++)
	    {
	      System.out.print("* ");
	    }
	  }
		
		
	

	private void patternc() {
		// TODO Auto-generated method stub
		
		    // TODO Auto-generated method stub
		    for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		   System.out.println("");
		    for(int star=1; star<=6; star++)
		    {
		      System.out.println("* ");
		    }
		    for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		  }
	

	private void pattern1() {
		for(int row=1;row<=3;row++)
		{
		for(int col=1;col<=5;col++) {
			System.out.print(" * ");
		}
		System.out.println();
	}

}
}