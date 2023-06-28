package india.newDelhi;

import taminadu.chennai.Trafficrules;

public class CommonManInDelhi implements trafficrulesdelhi,Trafficrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		CommonManInDelhi man1=new CommonManInDelhi();
		man1.dontGoByDieselVehicle();
		man1.goByBicycle();
		man1.varadhan1();
	}

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("21");
	}

	@Override
	public void varadhan1() {
		// TODO Auto-generated method stub
		System.out.println("varadhan2method");
	}

	@Override
	public void varadhan2() {
		// TODO Auto-generated method stub
		System.out.println("varadhan2method");
	}

//	@Override
//	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
	//	System.out.println("31");
	//}

}
