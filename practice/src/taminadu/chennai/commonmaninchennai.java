package taminadu.chennai;

public class commonmaninchennai implements Trafficrules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		commonmaninchennai man=new commonmaninchennai();
	//	man.goByDieselVehicle();
		man.goByBicycle();
		
		
	}

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("goByDieselVehicle");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("goByBicycle");
	}

	@Override
	public void varadhan1() {
		// TODO Auto-generated method stub
		System.out.println("varadhan1method");
	}

}
