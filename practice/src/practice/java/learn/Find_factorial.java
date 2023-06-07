package practice.java.learn;

public class Find_factorial {
	public static void main(String[] args) {
		Find_factorial varadhan=new Find_factorial();
		int value=145;
	int result=	varadhan.Factorial5();
	int result1=varadhan.Factorial4();
	int result2=varadhan.Factorial1();
	int sum=result+result1+result2;
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(sum);
if(value==sum)
{
	System.out.println("it is a strong number");
}
else
{
	System.out.println("it is not  a strong number");
}
	}
		public int Factorial5() {
int no=5;
int factorial=1;
{
while(no>0)
{
	factorial=factorial*no;
	no=no-1;
}
	return factorial;
}
		}
public int Factorial4()
{
int no=4;
int factorial=1;
{
while(no>0)
{
	factorial=factorial*no;
	no=no-1;
}
	return factorial;
}
	}


public int Factorial1()
{
	


	int no=1;
	int factorial=1;
	{
	while(no>0)
	{
		factorial=factorial*no;
		no=no-1;	
}
return factorial;
}
}
}