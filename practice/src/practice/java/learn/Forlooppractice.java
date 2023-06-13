package practice.java.learn;

public class Forlooppractice {

	public static void main(String[] args) {
	
		Forlooppractice varadhan=new Forlooppractice();
		//varadhan.forloop();
		//varadhan.forloop11111();
		//varadhan.forloop12345();
		//varadhan.forloop13579();
		//varadhan.forloop369121();
		//varadhan.multiples_of_3_and_5();
		//varadhan.multiples_of_3_or_5();
		//varadhan.print_divisors();
		varadhan.print_reverse();
	}

	private void print_reverse() {
		for(int no=12345678;no>0;no=no/10) {
			System.out.print(no%10);
		}
		
		
	}

	private void print_divisors() {
		int no=13;
int count=0;
		
		for(int div=2;div<no;div++) {
			if(no%div==0) {
			
				System.out.println(div);
				count=count+1;
			}
			
		}
		System.out.println(count+"Count of divisors");
		if(count==0) {
			System.out.println("given no is prime number");
		}
		else {
			System.out.println("given number is not prime no");
		}
	}



	private void multiples_of_3_or_5() {
		for(int no=1;no<=60;no++) {
			if(no%3==0  || no%5==0) {
				System.out.print(no+" ");
			}
		}
		
	}

	private void multiples_of_3_and_5() {
		for(int no=1;no<=100;no++) {
			if(no%3==0  && no%5==0) {
				System.out.print(no+" ");
			}
		}
		
		
		
	}

	private void forloop369121() {
		for(int i=3;i<=15;i=i+3) {
			System.out.print(i);
		}
		
	}

	private void forloop13579() {
		for(int i=1;i<=9;i=i+2) {
			System.out.print(i);
		}
		
	}

	private void forloop12345() {
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
		
	}

	private void forloop11111() {
		for(int i=1;i<=5;i++) {
			System.out.print(1);
		}
		
	}

	private void forloop() {
		
		for(int row =1;row<=10;row++) {
			
		
		for(int i=0;i<=10;i=i+2){
		System.out.print(i+ " ");	
		}
		System.out.println();
		}
	}
}