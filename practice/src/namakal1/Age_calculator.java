package namakal1;
import java.util.Scanner;
public class Age_calculator {

	public static void main(String[] args) {
		
		int Birth_day;
		int Birth_month;
		int Birth_year;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter Birth date");
		Birth_day=obj.nextInt();
		System.out.println("Enter Birth Month");
		Birth_month=obj.nextInt();
		System.out.println("Enter Birth Year");
		Birth_year=obj.nextInt();
		
		int current_day = java.time.LocalDate.now().getDayOfMonth();
		int current_month = java.time.LocalDate.now().getMonthValue();
		int current_year = java.time.LocalDate.now().getYear();
		
		
		if(current_day>=Birth_day && current_month>=Birth_month  && current_year>=Birth_year) {
			
			Birth_day=current_day-Birth_day;
			Birth_month=current_month-Birth_month;
			Birth_year=current_year-Birth_year;
			
			
			System.out.println(Birth_day +Birth_month +Birth_year);
			
		}
		else {
			
			
		}
		
		
		

	}

}
