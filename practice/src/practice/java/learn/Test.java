package practice.java.learn;

public class Test {
int a = 10;
public static void main(String args[]) {
Test t = new Test();
t.doStuff(4);
}
public void doStuff(int a) {
a -= 1;
System.out.println(a--);
}
}
