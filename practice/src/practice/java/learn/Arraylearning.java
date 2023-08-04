package practice.java.learn;
import java. util. Scanner;

public class Arraylearning {
//
	public static void main(String[] args) {
		
		
		
		Arraylearning al=new Arraylearning();
		int[]ar= {10,13,16,17,3,8,5,7,1};
		al.bubble_Sort(ar);
	//	al.method();
	//	char[]name= {'h','a','r','i','s','h'};
	//	al.method2(name);
	//	char[]name= {'a','p','p','a'};
	//	al.print_reverse(name);
	//	al.find_total();
	//	al.expense();
	//	al.cricekt();
	//	al.add();
    //	al.arraylength();
	//	al.prime_number();
	//	al.primeno1();
	//	al.per
	//	al.perfect();
	//	al.adjuscent();
	//	al.adjuscentwhile();
	//	al.adjuscent1();
	//	al.adjustcent123();
	//	al.freq();
    //	al.freq1();
	//	al.remove();
   //
		//al.big();
		//al.freq12();
	//	al.freq13();
	//al.binary();
	//	al.bina
		//al.binary_search();
		//al.bigno();
		
		
	}
	

	private void bigno() {
	int arr[]= {8,3,10,19};
	int big=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					big=arr[i];
					
				
				
				
				
				
			}
		}
			
		}
	
}


	private void binary_search() {

		int[] ar = {-5, 10,20,30,34};
	    int key = 15; 
	    int start = 0, end = ar.length-1; // start = 0 end = 3
	      //mid = 1
	    while(start<=end)
	    {
	      int mid = (start+end)/2;
	      if(key == ar[mid])  // 5 == 8 
	      {
	        System.out.println("Yes, present at position: "+ mid );
	        break;
	      }
	      else if(key<ar[mid])
	      {
	        end = mid - 1; 
	      }
	      else {
	        start = mid + 1; 
	      }
	    }
	    if(start>end)
	    {
	      System.out.println("No, Element is not present");
	    }
}


	private void binary() {
	int[]ar= {20,18,15,13};
	int key=18;
	int start=0;
	int end=ar.length-1;
	while(true) 
	{
	int mid=(start+end)/2;
	if(key==ar[mid])
	{
		System.out.println("yes present at position"+mid);
		breremove();
		   //
				//al.big();
				//al.freq12();
			//	al.freq13();
			al.binary();
			//	al.bina
			}
			

			private void binary() {
			int[]ar= {20,18,15,13};
			int key=18;
			int start=0;
			int end=ar.length-1;
			while(true) 
			{
			int mid=(start+end)/2;
			if(key==ar[mid])
			{
				System.out.println("yes present at position"+mid);
				break;
	}
	else if(key>ar[mid]) {
		end=mid-1;
	}
	else {
		start=mid+1;
	}
    }
	}
	
	
	
	
	
	private void freq13() {
	// TODO Auto-generated method stub
		char []name= {'v','a','r','a','d','h','a','n'};
		for(int j=0;j<=name.length;j++) 
		{
		char ch=name[j];
		if(ch!='*') 
		{
		int count=1;
		for(int i=j+1;i<name.length;i++) 
		{

			if(ch==name[i]) 
			{
				
			
				name[i]='*';	
			
	count++;

	
	}
			
		 	
	}
		
		//if(count>1)//max duplicate values
		//if(count==1)//non repeat characters
		System.out.println(ch + "-->appears "+ count +"  times");
		//System.out.println(ch);//removing duplicates problem
	
	}
		
				
			}
		
}
		
	
	
		

	







	private void freq12() {
	char []name= {'P','P','p','o','o','v','a','r','a','s','a','n'};
	char ch=name[0];
	if(ch!='*') {
	int count=1;
	for(int i=1;i<name.length;i++) {
		if(ch==name[i]||ch==name[i]-32) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	 ch=name[1];
	if(ch!='*') {
	int count=1;
	for(int i=2;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	
	 ch=name[2];
	if(ch!='*') {
	int count=1;
	for(int i=3;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}	
	 ch=name[3];
	if(ch!='*') {
	int count=1;
	for(int i=4;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	 ch=name[4];
	if(ch!='*') {
	int count=1;
	for(int i=5;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	 ch=name[5];
	if(ch!='*') {
	int count=1;
	for(int i=6;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	 ch=name[6];
	if(ch!='*') {
	int count=1;
	for(int i=7;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	 ch=name[7];
	if(ch!='*') {
	int count=1;
	for(int i=8;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	 ch=name[8];
	if(ch!='*') {
	int count=1;
	for(int i=9;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
	 ch=name[9];
	if(ch!='*') {
	int count=1;
	for(int i=10;i<name.length;i++) {
		if(ch==name[i]) 
		{
			name[i]='*';		
count++;	
}
}
	System.out.println(ch + "-->appears "+ count +"  times");
}
}	
	
	
	
	
	
	
	
	
	private void bubble_Sort(int[] ar) {
		  for(int j = 1; j<ar.length; j++)
		    {
		    for(int i=0; i<ar.length-j; i++)
		      {
		        if(ar[i]>ar[i+1])
		        {
		          int temp = ar[i];
		          ar[i] = ar[i+1];
		          ar[i+1] = temp;
		        }
		      }
		    }  //return ar;
		  System.out.print("[ ");
		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+ " | ");
		  }
		  System.out.print(" ] ");
		  }
	

	private void big() {
	
		int ar[]= {10,8,5,1};
	
	    for(int i=0; i<ar.length-1; i++)
	    {
	      if(ar[i]>ar[i+1])
	      {
	        int temp = ar[i];
	        ar[i] = ar[i+1];
	        ar[i+1] = temp;
	      }
	    }
	  
	    System.out.println("Biggest is "+ ar[ar.length-1]);
	  }

	private void remove() {
	char a[]= {'v','a','r','a','d','h','a','n'};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) 
				System.out.println(a[i]);
			

		}
	}
	
}

	private void freq1() {
	// TODO Auto-generated method stub
		char[] name = {'p','o','o','v','a','r','a','s','a','n','p','o','o','v'};
	    //char[] name = {'H','a','r','i','s','H'};
	//First Letter:
	char ch = name[0];
	int count = 1; 
	for(int i=1; i<name.length;i++)
	{
	  if(ch == name[i] || ch==name[i]-32)
	    count++;
	}
	System.out.println(ch + " appears "+ count + " time(s)");
	    
	// Second Letter: 
	ch = name[1];
	count = 1; 
	for(int i=2; i<name.length;i++)
	{
	  if(ch == name[i])
	  {
	    name[i] = '*';
	    count++;
	  }
	}
	System.out.println(ch + " appears "+ count + " time(s)");
	    
	// Third Letter: 
	ch = name[2];
	if(ch!='*')
	{
	count = 1; 
	for(int i=3; i<name.length;i++)
	{
	  if(ch == name[i])
	  {
	    name[i] = '*';
	    count++;
	  }
	}
	System.out.println(ch + " appears "+ count + " time(s)");
	    
	}
	//Fourth Letter: 
	  ch = name[3];
	  if(ch!='*')
	  {
	   count = 1; 
	  for(int i=4; i<name.length;i++)
	  {
	    if(ch == name[i])
	    {
	      name[i] = '*';
	      count++;
	    }
	  }
	  System.out.println(ch + " appears "+ count + " time(s)");
	      
	    }
	  
	  //Fifth Letter: 
	    ch = name[4];
	    if(ch!='*')
	    {
	     count = 1; 
	    for(int i=5; i<name.length;i++)
	    {
	      if(ch == name[i])
	      {
	        name[i] = '*';
	        count++;
	      }
	    }
	    System.out.println(ch + " appears "+ count + " time(s)");
	        
	      }
	    
	    //Sixth Letter: 
	        ch = name[5];
	        if(ch!='*')
	        {
	         count = 1; 
	        for(int i=6; i<name.length;i++)
	        {
	          if(ch == name[i])
	          {
	            name[i] = '*';
	            count++;
	          }
	        }
	        System.out.println(ch + " appears "+ count + " time(s)");
	            
	          }
	        
	        //Seventh Letter: 
	        ch = name[6];
	        if(ch!='*')
	        {
	         count = 1; 
	        for(int i=7; i<name.length;i++)
	        {
	          if(ch == name[i])
	          {
	            name[i] = '*';
	            count++;
	          }
	        }
	        System.out.println(ch + " appears "+ count + " time(s)");
	            
	          }
	        //Eighth Letter: 
	        ch = name[7];
	        if(ch!='*')
	        {
	         count = 1; 
	        for(int i=8; i<name.length;i++)
	        {
	          if(ch == name[i])
	          {
	            name[i] = '*';
	            count++;
	          }
	        }
	        System.out.println(ch + " appears "+ count + " time(s)");
	            
	          }
	        //Ninth Letter: 
	        ch = name[8];
	        if(ch!='*')
	        {
	         count = 1; 
	        for(int i=9; i<name.length;i++)
	        {
	          if(ch == name[i])
	          {
	            name[i] = '*';
	            count++;
	          }
	        }
	        System.out.println(ch + " appears "+ count + " time(s)");
	            
	          }
	        //Tenth Letter: 
	        ch = name[9];
	        if(ch!='*')
	        {
	         count = 1; 
	        for(int i=10; i<name.length;i++)
	        {
	          if(ch == name[i])
	          {
	            name[i] = '*';
	            count++;
	          }
	        }
	        System.out.println(ch + " appears "+ count + " time(s)");
	            
	          }
}

	private void freq() {
	// TODO Auto-generated method stub
		char[] name = {'*','o','o','*','a','r','a','s','a','n','p','o','o','v'};
	    for( int j =0; j<name.length;j++)
	    {
	    char ch = name[j]; 
	    if(ch!='#')
	    {
	    int count = 1; 
	    for(int i=j+1; i<name.length;i++)
	    {
	      if(ch == name[i])
	      {
	        name[i] = '#';
	        count++;
	      }
	    }
	    System.out.println(ch + " appears "+ count + " time(s)");  
	    }
	  }
}

	private void adjustcent123() {
	
	    int[] a = {3, 8, 5, 13};  int i =0; 
	      //         0  1  2   3
	    while(i<a.length-1)
	      {
	    int start = a[i]; 
	    int end = a[i+1]; 
	    if(start<end) 
	    {
	    for(int no = start+1; no<end; no++)
	        System.out.print(no+" "); 
	    System.out.println();
	    i++;
	    }
	    else
	    {
	      for(int no = start-1; no>end; no--)
	          System.out.print(no+" "); 
	      System.out.println();
	      i++;
	    }
	    
	      }
	    
	    
	  }

	private void adjuscent1() {
	    int[] a = {3, 8, 5, 13};  int i =0; 
	      //         0  1  2   3
	    while(i<a.length-1)
	      {
	    int start = a[i]<a[i+1]? a[i]:a[i+1];
	    int end = a[i]>a[i+1]? a[i]:a[i+1];
	    
	    for(int no = start+1; no<end; no++)
	        System.out.print(no+" "); 
	    System.out.println();
	    i++;
	      
	      }
		
	}

	private void adjuscentwhile() {
	// TODO Auto-generated method stub
		int a[]= {3,8,10,13};
		int i=0;
		while(i<a.length-1) {
			int start=a[i];
			int end=a[i+1];
			for(int no=start+1;no<end;no++) {
				System.out.println(no);
			}
			i++;
		}
}

	private void adjuscent() {
	// TODO Auto-generated method stub
	int a[]= {3,8,10,13};
	for(int i=0;i<a.length-1;i++) {
		
		int start=a[i];
		int end=a[i+1];
		for(int no=start+1;no<end;no++) {
			System.out.println(no);
		}
	}
	
}

	private void perfect() {
	// TODO Auto-generated method stub
		
	      int[] ar= {1,6,2,28,5,496,8128};
	      boolean result=false;
	      
	      for(int i=0;i<ar.length;i++)
	      {
	        int total=0;
	        for(int div=1;div<=ar[i]/2;div++)
	        {
	           if(ar[i]%div==0)
	             {
	             total=total+div;
	             if(total==ar[i])
	             {
	               System.out.println("Perfect Number "+ar[i]);
	               result=true;
	               break;
	             }
	             }
	        }
	      
	        }
	     
	      if(result==false)
	      {
	        System.out.println("No Perfect Number");
	      }  
	      
	    
}

	private void primeno1() {
	
	       int[] va= {1,2,3,4,5,6,7,8,9};
	       
	        
	        for (int i=0;i<va.length;i++){
	            int count= 0;
	           
	            for (int j=2;j<=va[i]-1;j++){
	                if (va[i]%j==0){
	                    count=count+1;
	                }
	            }
	            if (count==0){
	                System.out.println(va[i]+"prime");
	            }
	            else{
	                System.out.println(va[i]+"notprime");
	            }
	        }
	    }
	
	

	private void prime_number() {
		
		int va[]= {1,2,4,3,5,6,7,8,9};
		
		
		for(int i=0;i<va.length;i++) {
			
			int count=0;
			for(int j=0;j<=va.length;j++) {
			
			if(va[i]%j==0) {
				count++;
			}
			}
			if(count==2) {
				System.out.println(va[i]+"primeno");
			}
			else {
				System.out.println(va[i]+"notprimeno");
			}
		}
		
	}

	private void arraylength() {
		
		
		int[] q = {90, 87, 100};    //3
		int[] h = {89, 67};         //2

		int small = q.length < h.length ? q.length:h.length;
		int big = q.length > h.length ? q.length:h.length;

		int[] result = new int[big];
//		result ==> {90+89, 87+67, 100}; 
//		result[0] = q[0] + h[0]; 
//		result[1] = q[1] + h[1]; 
//		result[2] = q[2]; 

		for(int i=0; i<result.length; i++)
		{
		    if(i<small)
		     {
		    result[i] = q[i] + h[i];
System.out.println(result[i]); 
		    }
		    else
		        {
		        result[i] = q[i]; 
		        System.out.println(result[i]); 
		        }
		}
	}

	private void add() {
		
		int[] first = {90, 76, 87}; 
		int[] second = {56, 98, 45}; 	
	int[] total = new int[first.length];

for(int i=0; i<total.length;i++)
    {
    total[i] = first[i] + second[i];
    System.out.println(total[i]);
    }
	}
	private void cricekt() {
		int[] first = {90, 76, 87}; 
		int[] second = {56, 98, 45}; 
		
                      
		int[] total = new int[first.length + second.length];
		for(int i=0; i<total.length; i++)
		{
		    if(i<first.length)
		    {
		    total[i] = first[i]; 
		    System.out.println(total[i]); 
		    }
		    else
		    {
		    total[i] = second[i-first.length]; 
		     System.out.println(total[i]); 
		    }
		}
		
	}

	private void expense() {
		
		int[] tour = {1000, 1500, 300, 450}; 

		int[] trip = {343, 400};
		int total = 0; 

		for(int i=0; i<tour.length; i++)
		    total = total + tour[i];

		for(int i=0; i<trip.length; i++)
		    total = total + trip[i];  

		System.out.println("Total Expenditure is "+ total);
	}

	private void find_total() 
		
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of subjects: ");
		int subjects = sc.nextInt();
		int[] marks = new int[subjects]; 
		int big = 0; 
		int total = 0; 
		  int count = 0; 
		  int small=100;
		  
		for(int i=0; i<marks.length;i++)
		{
		    System.out.println("Enter Mark ");     
		    marks[i] = sc.nextInt(); 
		    if(marks[i]>big)
		    {
		    	big = marks[i];
		    }
		    if(marks[i]<small)
		    {
		    	small = marks[i];
		    }
		    
		    
		   
		    total = total +  marks[i]; 
		    System.out.println(marks[i]); 
		}
		System.out.println("Total " + total);
		System.out.println(big);
		System.out.println(small);
	}
	
	


	private void print_reverse(char[] name) {
		
		char[]name2=new char[name.length];
		
		int i=0,j=name.length-1;
		while(i<name.length) {
			name2[i]=name[j];
			i++;
			j--;
			
		}
		System.out.println(name2);
		
		
	}
	
	private void method2(char[] name) {
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
		
	}


	private void method() {
		// TODO Auto-generated method stub
		char name[]=new char[6];
		
name[0]='h';
name[1]='a';
name[2]='r';
name[3]='i';
name[4]='s';
name[5]='h';
//stem.out.println(name[0]);
//stem.out.println(name[1]);
//stem.out.println(name[2]);//

//stem.out.println(name[3]);
//stem.out.println(name[4]);
//tem.out.println(name[5]);
int i=0;
while(i<name.length) {
	
	System.out.println(name[i]);
	i++;
}

	char first=name[0];
	int len=name.length;
	char last=name[len-1];
	if(first==last){
		System.out.println("same");
	}
		
	
	
}

 
	}


