package bank.chennai;

public class ActorSivakumar implements Actor {
static String address="coimbatore";
int i=65;

	public ActorSivakumar(int i, String string) {
		
		
		
		this.i=i;
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivakumar as=new ActorSivakumar(65,"Audi car");
		as.act();
		as.dance();
		as.sing();
		System.out.println(as.address);
		System.out.println(as.i);
		
		Actor ac=new ActorSivakumar(65, "audi car");
		System.out.println(address);
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
