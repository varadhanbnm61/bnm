package practice.java.learn;

public class Shop {
 String brand;
int price,discount;
Shop(String brand,int price,int discount){
	System.out.println(price);
	this.brand=brand;
	this.price=price;
	this.discount=discount;
	
}

public static void main(String[]args) {
	
	Shop prod1=new Shop("abc",100,10);
	Shop prod2=new Shop("bcd",200,20);
	
	
}


}
