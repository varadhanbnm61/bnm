package Trichy;
public class Student4 {
	int marks;
	String name;
	String nickname;
	public Student4(int i,String a)
	{
		marks=i;
		name=a;
	
	}
	
	public Student4(int i,String a,String b )
	{
		marks=i;
		name=a;
		nickname=b;
	
	}
	
	
	
	void display()
	{
		System.out.println(  marks +  name +  nickname);	
	}
	
	public static void main(String[] args) {
		Student4 stu1=new Student4(120, "varadhan");
		Student4 stu2=new Student4(121, "age", "ca");
		stu1.display();
		stu2.display();
		
	}
    }
