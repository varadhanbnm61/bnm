package practice.java.learn;

public class Find_count {

	public static void main(String[] args) {
		
		Find_count varadhan=new Find_count();
		int count=varadhan.Find_count_digits(145);
		System.out.println(count);

	}

	private int Find_count_digits(int no) {
		
	int count=0;
	while(no>0)
	{
		no=no/10;
		count=count+1;
		
		
	}
	
	
		return count;
	}

}
