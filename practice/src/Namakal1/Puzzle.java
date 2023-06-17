package Namakal1;
public class Puzzle {
	public static void main(String[] args) {
		        int chocalaters=2; 
		        int givewrapper=3; 
		        int havemoney=15; 
		        int totalchoci=havemoney/chocalaters; 
		        int wrappers=totalchoci;
		        while (wrappers>=givewrapper) 
		        {
		            int exchangechoci=wrappers/givewrapper;//5 
		            totalchoci=totalchoci+exchangechoci; 
		            int balancewrappers=wrappers%givewrapper; 
		            System.out.println(balancewrappers);
		            wrappers=exchangechoci+balancewrappers; 
		        }
		        System.out.println(totalchoci);
	}
}
