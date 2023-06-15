package Namakal1;

public class Puzzle {

	public static void main(String[] args) {
		        int chocalaters=1; 
		        int givewrapper=3; 
		        int havemoney=15; 
		        int totalchoci=havemoney/chocalaters; 
		        int wrappers=totalchoci;
		        while (wrappers>=givewrapper) 
		        {
		            int exchangechoci=wrappers/givewrapper; 
		            totalchoci=totalchoci+exchangechoci; 
		            int remainingWrappers=wrappers%givewrapper; 
		            wrappers=exchangechoci+remainingWrappers; 
		        }
		        System.out.println(totalchoci);

	







	}
}
