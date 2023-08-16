package namakal1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Calculator {

	public static void main(String[] args) {
		
	
		Calculator obj=new Calculator();
	//	obj.c();
	//	obj.d();
	//obj.v();
	//	obj.n();
		obj.in();
		
		

		
	}

	private void in() {
		// TODO Auto-generated method stub
		String mobile = "9884012810";
		Pattern patternObj = Pattern.compile("(98)[0-9]{9}");
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }
	}

	private void n() {
		// TODO Auto-generated method stub
		String password = "01/11/1997";
	    String[] patternObj;
		try {
			patternObj = Pattern.split("/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      int matcherObj = patternObj.length;
	      while(matcherObj.find())
	      {
	        System.out.print(matcherObj.group());
	      }
	}

	private void v() {
		// TODO Auto-generated method stub
		String password = "Chennai is the capital of TamilNadu";
		  Pattern patternObj = Pattern.compile("Chennai");
		    Matcher matcherObj = patternObj.matcher(password);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }	
	}

	private void d() {
		
		String input = "My mobile number is 9884010000";
	    Pattern patternObj = Pattern.compile("[A-Z]");
	    Matcher matcherObj = patternObj.matcher(input);
	    while(matcherObj.find())
	    {
	      System.out.println(matcherObj.group());
	      System.out.println(matcherObj.start());
	      System.out.println(matcherObj.end());

	    }
	}

	private void c() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your dob[dd/mm/yyyy]: ");
		String dateofbirth=sc.nextLine();
		try 
		{
	String arr[]=	dateofbirth.split("/");
	int d=Integer.parseInt(arr[0]);
	int m=Integer.parseInt(arr[1]);
	int y=Integer.parseInt(arr[2]);
	
	
	var dob=LocalDate.of(y, m, d);//var multiple declarations,re declaration./no scope specific.
	var currentdate=LocalDate.now();
	
	var p=Period.between(dob, currentdate);//The Period.between() method is a part of the java.time package in Java, which is used for handling date and time-related operations. It returns a Period object representing the difference between two dates in terms of years, months, and days.
		
	System.out.println("your ages is: "+p.getYears()+"years"+p.getMonths()+"months"+p.getDays()+"days");
		}
		
		catch(Exception ee){
			System.out.println("please give correct input");
			c();
		}		
	}
}