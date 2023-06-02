package practice.java.learn;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int no = 1; 
		while(no<=10)        //2<=9
		{
		    System.out.print(no+" "); //1
		    if(no==9)
		        {
		        no = 2; 
		        System.out.print(no+" ");   //2
		        }
		    no+=2; //4
		}
	}

}
