package practice.java.learn;
public class Whileloop1 {
public static void main(String[] args)	
{
int div=2;
int no=100;
int largest=-1;
int smallest=-1;
while(no>div)
{
if(no%div==0)		
{
if(smallest==-1)
{		
smallest=div;
}			
largest=div;
}
div=div+1;
}	
System.out.println(largest);
System.out.println(smallest);	
}
}
