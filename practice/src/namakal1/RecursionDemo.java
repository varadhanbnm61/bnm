package namakal1;

public class RecursionDemo {

	
	public static void main(String[] args) {
	    
	    RecursionDemo rd = new RecursionDemo();
	//    rd.display(1); 
	  //   int result=rd.fact(4);
	//     System.out.println(result);
	   rd.parse();
	  //  rd.displayy();
	     
	  }
	private void displayy() {
		
		System.out.println("hi");
		displayy();
		
	}
	private void parse() {
		
				String s = "1234";
				    
				    try {
				    int no = Integer.parseInt(s);
				    System.out.println("Yes, full of numbers");
				    System.out.print(no);
				    }
				    catch(NumberFormatException nn)
				    {
				      System.out.println("No, it contains other than number");
				    }
		
	}
	private int fact(int no) {
	    // TODO Auto-generated method stub
	    if(no==1)
	      return 1; 
	    return no * fact(no-1);
	  
	  }

	  private void display(int no) {
	    // TODO Auto-generated method stub
	    System.out.println(no);
	    no++; 
	    if(no<=5)
	      display(no);
	  }
}
