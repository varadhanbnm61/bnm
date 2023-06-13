package practice.java.learn;

public class Looping6 {

	public static void main(String[] args) {
	
Looping6 varadhan=new Looping6();
		//varadhan.find_lcm(3,5);
		//varadhan.swap_amount(10,20);
		//varadhan.swap_amount3(123,234);
		//varadhan.savings();
		//varadhan.fibo();
		//varadhan.minister();
		//varadhan.print12345();
		//varadhan.print246810();
		//varadhan.print3691215();
		//varadhan.print1361015();
varadhan.print123451224364860();
	}
	private void print123451224364860() {
	int num=0;
	while(num<=60) 
	{
		if(num<=5)
		{		
		System.out.println(num);
			num=num+1;
		}
		else {			
		num=num+12;
			System.out.println(num);
		}
	}
	}
		private void print1361015() {
		int num=0;
		for(int no=1;no<=5;no++) {
			System.out.println(num);
			num=num+no;
		}	
	}

		private void print3691215() {
		for(int no=3;no<=15;no +=3) {
			System.out.println(no);
			
			
		}
		
	}

		private void print246810() {
		
	
			
		
		for(int no=2;no<=10;no +=2) {
			System.out.println(no);
			
			
		}
		}
	

		private void print12345() {
		
		
		for(int no=1;no<=10;no++) {
			System.out.println(no);
			
		}
		
	}

		private void minister() {
		
		int total=0;
		int amount=1;
		for(int day=1;day<=10;day++)
		{
			System.out.println(  + amount);
total=total+amount;
			amount=amount*2;
			
		}
		System.out.println(total);
	}
		

		private void savings() {

			for(int day=1;day<=10;day++) {
				int amount=5;
			int savings=0;
			savings=savings+amount;
			System.out.println(savings);
		}
	}

		private void fibo() {
int a=0;
int b=1;
while(a<=13)
{
int c=a+b;
System.out.println(a);
a=b;
b=c;
}



			
	}

		private void swap_amount3(int a, int b) {
			
			
			
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println(a);
			System.out.println(b);
			
			
		
		
	}

		private void swap_amount(int old,int new_) {
	System.out.println(old);
	System.out.println(new_);
	
	int box=old;
	old=new_;
	new_=box;
	System.out.println(old);
	System.out.println(new_);
	
	
		
	}

		private void find_lcm(int no1, int no2) {
		    // TODO Auto-generated method stub
		    int big=no1>no2?no1:no2;
		    System.out.println(big);
		    while(true) {
		    if(big%no1==0 && big%no2==0) {
		    	System.out.println(big);
		    	break;
		    
		  }
		    big=big+1;
		    
	}

}
}
