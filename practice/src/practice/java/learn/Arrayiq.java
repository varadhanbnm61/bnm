package practice.java.learn;

public class Arrayiq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Arrayiq iq=new Arrayiq();
		//iq.i1();//count no of ocuurances of array elements
		//iq.i2();//sum of element in array
		//iq.i3();
		//iq.i4();
		//iq.i5();
		//iq.add(100,200);
		//iq.add(10,10);
		//iq.find_negative_element();for each loop
		iq.find_negative_element1();//for loop
		
	}
	

	 private void find_negative_element1() {
		
		
		 int a[]= {10,-20,-30,40,50};
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<0) {
					System.out.println(a[i]);
				}
			}
		}


	private void find_negative_element() {
		int a[]= {10,-20,-30,40,50};
		
		for(int i:a)
		{
			if(i<0) {
				System.out.println(i);
			}
		}
	}

	double add(double a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	int add(int a, int b) {
		return a+b;
		
		
	}

	private void i5() {
		
		

		int[] a = {10,20,30, 13, 25, 35}; 

		

		int count = 0; 
		for(int i =0; i<a.length; i++)
		    {
		    if(a[i]%2!=0)
		        count++; 
		    }
		int[] b = new int[count]; 

		int j = 0; 

		for(int i =0; i<a.length; i++)
		    {
		    if(a[i]%2!=0)
		        {
		        b[j] = a[i]; 
		        System.out.println(b[j]); 
		        j++; 
		        }
		    }
		
	}

	private void i4() {
		// TODO Auto-generated method stub
		int[] ar = {5, 8,8, 3,4,8}; 
	        //      0  1  2 3
	int no = 8; 
	boolean present = false;
	for(int i = 0; i<ar.length; i++)
	{
	    if(no == ar[i])
	        {   
	        System.out.println("Yes, We got the number in index " + i); 
	        present = true; 
	        
	        }
	}
	if(present==false)
	{
		System.out.println("No. is not present");
	}
	}


	private void i3() {
		int a[]= {4,5,6,7,6,7,7,7,8};
		
		int count=0;
		for(int i : a) {
			if(i==7){
			count++;
		}
		
		}
		System.out.println(count);
	}

	private void i2() {
		
		int[]a= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

	private void i1() {
		
		
		int a[]= {4,6,7,8,9,4,6,4,4,4};
		int count=0;
		for(int i:a)
		{
			if(i==6)
				count++;
		}
		System.out.println(count);
		
		
	}

}
