package bank.chennai;

class ActorSivakumar implements Actor {
static String address="coimbatore";
int age=65;
String car;

	ActorSivakumar(int age, String car) {
		
		
		
		this.age=age;
		this.car=car;
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivakumar as=new ActorSivakumar(65,"Audi car");
		as.act();
		as.dance();
		as.sing();
		System.out.println(as.address);
		System.out.println(as.age);
		
		Actor ac=new ActorSivakumar(65, "audi car");
		System.out.println(ac.address);
	}
	
	void Speaking() {
		
	}
	@Override
	public void act() {
		System.out.println("act");
	}
	@Override
	public void dance() {
	
		System.out.println("dance");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("sing");
	}

}
