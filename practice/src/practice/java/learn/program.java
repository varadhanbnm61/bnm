package practice.java.learn;

public class program {


	public static void main(String[] args) {
		
		program program1=new program();
	//	program1.program1();
	//	program1.program2();
	//	program1.program3();
	//	program1.program4();
	//	program1.program5();
//program1.program6();
        //1 2 3 4 5 
		//6 7 8 9 10 
//program1.program7();
	    //1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5	
//program1.program8();
		//1 1 1 1 1 
		//2 2 2 2 2 
		//3 3 3 3 3 
		//4 4 4 4 4 
		//5 5 5 5 5 
//program1.program9();
		
		//program1.program10();
//program1.progaramc();
		
	//	program1.programdecn();
	//	program1.programdecn1();
	//	program1.programdecn2();
	//	program1.programdecn3();
		
	
		
		
	
		
		
		

	}

	private void programdecn3() {
		for(int value=5;value>=1;value--) 
	     {
	              for(int no=value;no>=1;no--)
	              {
	                  System.out.print(no+" ");
	              }
	              System.out.println();
	          }
	    
	    
	        for(int value=2;value<=5;value++)
	          {
	          for(int no=value;no>=1;no--)
	          {
	          System.out.print(no+" ");
	          }
	          System.out.println();

	        }
	          }
	
	private void programdecn2() {
		int value=2;
		while(value<=5) {
		for(int no=value;no>=1;no--) {
			System.out.print(no+" ");
		
		}
		
		System.out.println();
	value++;
		}
		
		}
		
	

	private void programdecn1() {
	
		int value=5;
		while(value>=1) {
		for(int no=value;no>=1;no--) {
			System.out.print(no+" ");
		
		}
		
		System.out.println();
	value--;
		
	}
		System.out.println();
	}
	
	

	
	private void programdecn() {
		for(int no=5;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no=4;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no=3;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no=2;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no=1;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		
		for(int no=2;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no=3;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no=4;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no=5;no>=1;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
	}

	private void progaramc() {
	for(int star=1;star<=7;star++) {
		System.out.print("* ");
	}
	System.out.println();
		for(int col=1;col<=6;col++) {
			System.out.println("* ");
		}
		for(int col=1;col<=7;col++) {
			System.out.print("* ");
		}
	}

	private void program10() {
		
for(int limit=9;limit>=1;limit-=2) {
		for(int no=1;no<=limit;no++) {
			System.out.print(no+" ");
		
			
		}
		System.out.println();
		
		
}
	}

	private void program9() {
		
		for(int val=1;val<=5;val++) {
			for(int no=1;no<=5;no++) {
				System.out.print(val+" ");
				
			}
			System.out.println();
		}
		
		
	}

	private void program8() {
		for(int line=1;line<=5;line++) {
			for(int no=1;no<=5;no++) {
				System.out.print(no+" ");
			}
		System.out.println();
		}
		
	}

	private void program7() {
		for(int no=1;no<=10;no++) {
	
			System.out.print(no+ " ");
	if(no==5)
		System.out.println();
	
		}
		
		
	}

	private void program6() {
		
		
		
		 for(int row=5;row>=1;row--) 
		 {
	            for(int col=row;col>=1;col--)
	            {
	                System.out.print(col+" ");
	            }
	            System.out.println();
	        }
		
		
		    for(int row=2;row<=5;row++)
		      {
		      for(int column=row;column>=1;column--)
		      {
		      System.out.print(column+" ");
		      }
		      System.out.println();

		    }
		      }
		 
	
	private void program5() {
		
		for(int line = 1; line<=5; line++)
	    {
	    
			for(int num = 1; num <= 6-line; num++)
	        
			{
	        
				System.out.print((char) (num+96)); 
	        }
	    
			System.out.println(); 
	    }	
	}
	private void program4() {
		
		for(int row=1;row<=9;row++) {
			{
				if(row<=1) {
					System.out.print("* ");
				}
			}
			for(int col=1;col<=7;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private void program3() {
		for(int line=1;line<=9;line++) {
			
			for(int star=1;star<=7;star++) {
				if(line<=4) {
					
				
				if(star==line||star==8-line) {
					
					System.out.print("* ");
				}else
				{
					System.out.print(" ");
				}
				
				}
				else {
					if(star==4) {
						System.out.print("* ");
					}
					else {
						System.out.print(" ");
					}
						
				}
				
			}
			System.out.println();
			
		}
	}
		
		

	private void program2() {
		for(int line=1;line<=9;line++)
		{
			for(int star=1;star<=7;star++) 
			{
				if(line<=4)
				{
					if(star==line || star==8-line)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				
			}
			System.out.println();
		}
		
	}
		
	
	private void program1() {
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=7;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
