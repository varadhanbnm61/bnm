package Namakal1;

public class Minister extends Government {

	public static void main(String[] args) {
		
		
		Government officials = new Minister();
		officials.raid();
		officials.collect_documents();
		officials.pay_salary();
		
		
		Minister minister=new Minister();
		
		
		
	}
		@Override
		public void raid() {
			// TODO Auto-generated method stub
			System.out.println("Cooperate Raid");
		}

		@Override
		public void collect_documents() {
			// TODO Auto-generated method stub

			System.out.println("Give necessary documents");
		}
			public void loot()
			{
				System.out.println("Looting from schemes");
			}
		}
	
