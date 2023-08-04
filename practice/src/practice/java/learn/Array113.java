package practice.java.learn;

public class Array113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array113 ar=new Array113();
//ar.find_palindrome();
ar.findd_palindrome();
	}
	private void findd_palindrome() {
	    char[] name = {'a', 'm', 'm', 'a'};
	    int i = 0;
	    int len = name.length - 1;
	    while (i < len) {
	        char first = name[i];
	        char last = name[len];
	        if (first!=last) {
	            System.out.println("Not");
	            return;
	        }	
	        i++;
	        len--;}
	    System.out.println("yes");
	}
		
	
	private void find_palindrome() {
		// TODO Auto-generated method stub
		char[] name = {'a','m','p','d'}; 
		int count = 0; 
		int len = name.length-1; int i=0; 
		while(i<len){
			char first = name[i]; // a
			char last = name[len]; //a
			if(first == last)
				{
				count++; 
				}
			else
			{
				System.out.println("Not Palindrome");
				break; 
			}
			i++;
			len--; 
		}
		if(count == name.length/2)
		{
			System.out.println("Palindrome");
		}
		
	}
}

