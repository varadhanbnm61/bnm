package practice.java.learn;

public class Whileloop3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Whileloop3 tenali=new Whileloop3(); 
			tenali.security(1024);
			tenali.count();
		
	}

	private void count() {
		int count=1;
		while(count<=9)
		{
		
			System.out.println(count);
			count=count+2;
		}
		

		
	}

	private void security(int beats) {
		int security=0;
		
				while(beats>1)
				{
					System.out.println("each security"+beats/2);
					
					beats=beats/2;
					security=security+1;
					
					
				}
		// TODO Auto-generated method stub
				System.out.println(security);
	}

}
