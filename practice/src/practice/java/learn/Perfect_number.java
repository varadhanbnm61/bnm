package practice.java.learn;

public class Perfect_number {

	public static void main(String[] args) 
	{

long n, sum=0;  
        
System.out.print("Enter the number: ");  
n=6; 
int i=1;  
  
while(i <= n/2)  
{  
if(n % i == 0)  
{  
 
if(sum==n)  
{  
System.out.println(n+" is a perfect number.");  
}  
else  
{
System.out.println(n+" is not a perfect number.");   
}  



	}

}
