package practice.java.learn;

public class Patternprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Patternprgm a=new Patternprgm();
//	a.pattern1();
	a.patternv();
	
	}

	private void patternv()
	{
		// TODO Auto-generated method stub
		for(int line=1;line<=10;line++)
		{
			if(line==5) {
				System.out.println();
			}
		System.out.print("* ");	
		}
	}
	private void pattern1() {
		
		for(int line=1;line<=9;line++) {
			for(int row=1;row<=9;row++) {
				
				System.out.print("*");
				
				
			}System.out.println();
			
			
		}
		
	}
	

}
