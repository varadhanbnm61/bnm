 package practice.java.learn;

public class Arn { 
	public static void main(String[] args)
	{	
int num=153;
int num1=num;
int arm=0;
while(num>0)
{
  int remi=num%10;
  arm=arm+(remi*remi*remi);
  num=num/10;
}
System.out.println(arm);

System.out.println(num1);
if(arm==num1) {
  System.out.println("given number is armstrong number");
}
else {
  System.out.println("given number is not armstrong number");
}
}

}
