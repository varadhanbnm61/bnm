package practice.java.learn;

public class puzzle {

	public static void main(String[] args) {
		
		puzzle puzzlesObj = new puzzle(); 
		puzzlesObj.dPlan();

	}

	private void dPlan() {
		// TODO Auto-generated method stub
		
		int day=1;
		int pm=5;
		int save=0;
		while(day<=10)
		{
			save=save+pm;
			day=day+1;
			System.out.println("daily"+save);
		}
		System.out.println(save);
		
	}

}
