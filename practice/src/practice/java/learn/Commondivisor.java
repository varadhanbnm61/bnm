public class Comm {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int no = 1634; 
    
    ArmstrongNumber an = new ArmstrongNumber();
    int count = an.find_count(no);
    int result = an.find_each_digit(no,count);
  if(result == no)
  {
    System.out.println("Armstrong Number");
  }
  else
  {
    System.out.println("Not Armstrong Number");
  }
  
  }

  private int find_each_digit(int no,int count) {
    // TODO Auto-generated method stub
    int total = 0; 
    while(no>0)
    {
      int rem = no%10; 
      int each_digit_result = (int)Math.pow(rem,count);
          
      //find_power(rem, count);
      total = total + each_digit_result;
      no = no/10; 
    }
    return total; 
  }

  private int find_power(int base, int power) {
    // TODO Auto-generated method stub
    int result = 1; 
    while(power>0)
    {
      result = result * base; 
      power = power - 1; 
    }
    return result; 
    
  }

  private int find_count(int no) {
    // TODO Auto-generated method stub
    int count = 0; 
    while(no>0)
    {
      no = no/10; 
      count = count +1;
    }
    return count; 
  }

}