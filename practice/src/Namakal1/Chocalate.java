package Namakal1;

public class Chocalate {

	public static void main(String[] args) {
		int chocalaters=1;
		int havemoney=21;
		int wrappervalue=3;
		int havechoclate=havemoney/chocalaters;
		
		if(havechoclate>=wrappervalue) {
			
			System.out.println(havechoclate);
			int havechoclate1=havechoclate/wrappervalue;
			System.out.println(havechoclate1);
			int havechoclate2=havechoclate1/wrappervalue;//1 choclate
			int havechoclate3=havechoclate1%wrappervalue;//2wrapper
			int havechoclate4=havechoclate3+havechoclate2;
			int havechoclate5=havechoclate4/wrappervalue;
		    System.out.println(havechoclate2);
			int totalchoc=havechoclate+havechoclate1+havechoclate2+havechoclate5;
			System.out.println(totalchoc);
			
	
		}
		
		

	}
}

