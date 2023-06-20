package practice.java.learn;

import Trichy.Central_Govt;
import Trichy.FranceGovt;

public class Bharani implements FranceGovt,Central_Govt{

	public static void main(String[] args) {

		 
		  { 
		   Bharani arm = new Bharani(); 
		    int no = 153; 
		    int result = arm.armstrong_number(no); 
		    System.out.println("The number is " +result); 
		    if(result == no) 
		    { 
		      System.out.println("It is an Armstrong"); 
		    } 
		    else 
		    { 
		      System.out.println("It is not a Armstrong"); 
		    } 
	 
		  }
	}
		  private int armstrong_number(int no)  
		  { 
		    int arm=0; 
		    //double d = Math.pow(no,arm); 
		    while(no>no/2) 
		    { 
		      int num = no%10; 
		      System.out.println(num); 
		      arm = arm+(int)Math.pow(num,3); 
		      //System.out.println(arm); 
		      no=no/10; 
		    } 
		    return arm; 
		    //System.out.println("The given number is "+arm); 
		  
	}
		@Override
		public void keep_visa() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void go_by_flight() {
			// TODO Auto-generated method stub
			
		}

}