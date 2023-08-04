ssspackage practice.java.learn;

public class String {

	public static void main(java.lang.String[] args) {
		
		String sd=new String();
		
		sd.give_space("MonTuesWednesThursFri");


	}

	private void give_space(String s1) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && (s1.charAt(i)<='Z'))
			{
				//System.out.print();
				if(i!=0)
				System.out.print("day "+s1.charAt(i));
				else
					System.out.print(s1.charAt(i)); //Monday T
			}
			else
			{
				System.out.print(s1.charAt(i));
			}
		}
		
		
	}

	private char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
