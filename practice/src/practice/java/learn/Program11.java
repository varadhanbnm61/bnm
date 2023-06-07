package practice.java.learn;

public class Program11 {

	public static void main(String[] args) {
		
int reverse=0;

int no=12321;
int no2=no;
while(no>0)
{
	
	int num=no%10;
	System.out.println(no);
	reverse=(reverse*10)+num;
	no=no/10; 
	
}
System.out.println(reverse);


if(reverse==no2 ) {
	System.out.println("given number is palindrome");
}
else
{
	System.out.println("given number is not palindrome");
}
  
	}

}


int num=153;
int arm=0;
while(num>0)
{
	int remi=num%10;
	arm=arm+(remi*remi*remi);
}
