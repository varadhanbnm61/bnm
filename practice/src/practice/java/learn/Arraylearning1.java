package practice.java.learn;

public class Arraylearning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arraylearning1 a1=new Arraylearning1();
		//a1.ar1();
		//a1.ar2();
		//a1.print_adjucement_elements();
	//	a1.non();
		a1.non1();
		
		
	}

	private void non1() {
		   char[] name = {'s','h','r','i','v','a','r','s','h','a','n'};
		   for(int j = 0; j<name.length-1; j++) {
		       char ch = name[j]; 
		       boolean repeated = false; 
		       for(int i=j+1; i<name.length;i++)
		       {
		         if(ch !=name[i])
		         {
		           continue; 
		         }
		         else
		         {
		           repeated = true; 
		         }
		       }
		       if(repeated == false)
		       {
		         System.out.println("First Non-repeated character is "+ ch);
		         break; 
		       }
		   }
		     
		     }
		
	

	private void non() {
		char[] name = {'h','a','r','i','s','h'};
		for(int j = 0; j<name.length-1; j++) {
		    char ch = name[j]; 
		    boolean repeated = false; 
		    for(int i=j+1; i<name.length;i++)
		    {
		      if(ch !=name[i])
		      {
		        continue; 
		      }
		      else
		      {
		        repeated = true; 
		      }
		    }
		    if(repeated == false)
		    {
		      System.out.println("First Non-repeated character is "+ ch);
		      break; 
		    }
		}
		
	}

	private void print_adjucement_elements() {
		// TODO Auto-generated method stub
		
	int[] a = {3, 5, -8, 13};  int i =0; 
	  //         0  1  2   3
	while(i<a.length-1)
	  {
	int start = a[i]; 
	int end = a[i+1]; 

	for(int no = start+1; no<end; no++)
	    System.out.println(no); 

	i++;
	}
	}

	private void ar2() {
		// TODO Auto-generated method stub
		int a[]= {3,5,8,15};
		
		int start=a[0];
		int end=a[1];
		for(int no=start;no<=end;no++) {
			System.out.println(no);
		}
	}

	private void ar1() {
		
		


		int[] a = {3, 5, 8, 13};  int i =0; 
		  //         0  1  2   3
		while(i<a.length-1)
		  {
		int start = a[i]; 
		int end = a[i+1]; 

		for(int no = start+1; no<end; no++)
		    System.out.println(no); 

		i++;
		}
		
	}

}
