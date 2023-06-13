package practice.java.learn;

public class Common_divisor {

	public static void main(String[] args) {
	 
		
		Common_divisor varadhan=new Common_divisor();
		varadhan.Common_div(100,120);
		varadhan.Greatest_common_divisor(100,120);
	}

	private void Greatest_common_divisor(int no1,int no2) {
		int greatest=0;
		int smallest=-1;
		int div=2;
		while(div<no1 && div<no2) {
			if(no1%div==0 && no2%div==0) {
				
				greatest=div;
			}
			div=div+1;
		}
	
	if(greatest>0) {
		System.out.println("greatest common divisor" +greatest);

		
		
	}else {
		System.out.println("there is no common divi");
	}
	
	}	

	private void Common_div(int no1, int no2) {
		int div=2;
		while(div<no1 && div<no2) {
			if(no1%div==0 && no2%div==0) {
				System.out.println(div);
			}
			div=div+1;
		}
		
			
		}
		
	}

