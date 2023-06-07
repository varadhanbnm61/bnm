package practice.java.learn;

public class Squareroot {
	public static void main(String[]args)
	{
		Squareroot md = new Squareroot(); 
		md.learn_Math_functions();
		md.find_floor();
		md.find_ceil();
		md.find_max(10,20);
		md.find_min(10,20);
		md.find_abs(125);
		md.find_round(0.03);
	//int p=	md.find_power(5,5);
		//
	//System.out.println("Power is "+ p);
		double result=md.find_signum(10);
		System.out.println(result);
		
	}
	private void find_round(double d) {
		// TODO Auto-generated method stub
		double d1 = d - (int)d; 
		//System.out.println(d1);
		if(d1<0.5)
		{
			System.out.println((int)d+"please");
		}
		else
		{
			System.out.println((int)d+1+"please");
		}
	}
	private double find_signum(int no) {
		
		if(no>0)
			return 1.0;
		else if(no<0)
			return -1.0;
		else
			return 0.0;
		
	}
		
	
	private int find_power(int a, int b) {
		// TODO Auto-generated method stub
		int p = 1;
while(b>0)
		{
		p = p * a; 
		b = b - 1; 
		}

		
		return p;
	}
	
	private void find_abs(int no) {
		// TODO Auto-generated method stub
		if(no>0)
		{
			System.out.println(no);
		}
		else
		{
			System.out.println(no*-1);
		}
	}
	private void find_min(int no1, int no2) {
		// TODO Auto-generated method stub
		if(no1<no2)
			System.out.println(no1);
		else
			System.out.println(no2);
		
	}

	private void find_max(int no1, int no2) {
		// TODO Auto-generated method stub
		if(no1>no2)
			System.out.println(no1);
		else
			System.out.println(no2);
		
	}

	private void find_ceil() {
		double no=64;
		int no2=(int)no;
		if(no2 == no) //no2 = 64, no = 64.0
		{
			System.out.println(no2);
			;
		}
		else
		{
			System.out.println((double)no2+1);
			//System.out.println("Hello");
		}
		
	}
		// TODO Auto-generated method stub
		
	

	private void find_floor() {
		double no=64.5;
		int no2=(int)no;
		System.out.println(no2);
		// TODO Auto-generated method stub
		
	}

	private void learn_Math_functions() {
		int no=64;
		int div=2;
		while(div<=no)
		{
			if(no/div==div)
			{
				System.out.println(div);
				break;
			}
			div=div+1;
			
			
			
			
		}
		
	}
}

