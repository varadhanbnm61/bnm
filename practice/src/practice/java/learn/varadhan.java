package practice.java.learn;

public class varadhan {

	public static void main(String[] args) {
		varadhan ipl= new varadhan();
		int mi=100,gt=190;
		ipl.play_qualifier(mi,gt);
		ipl.play_qualifier2(mi,gt);
		

}
	private void play_qualifier2(int mi, int gt) {
		if(mi>gt)
		  {  
		    int csk = 210; 
		     mi = 205; 
		    if(csk>mi)
		    {
		      System.out.println("dhoni gets trophy");
		    }
		    else
		    {
		      System.out.println("Rohit gets trophy");
		    }
		    
		  }
		else
		{
		  int csk = 180; 
		   gt = 165; 
		   if(csk>gt)
		   {
		     System.out.println("Dhoni gets Trophy");
		   }
		   else
		   {
		     System.out.println("Pandya gets trophy");
		 
		   }

		}
		
	}
	private void play_qualifier(int team1, int team2) {
	    // TODO Auto-generated method stub
	    if(team1>team2)
	    {
	      System.out.println("MI Enters finals");
	    }
	    else
	    {
	      System.out.println("GT enters finals");
	    }
	    
	  }
	}


	


