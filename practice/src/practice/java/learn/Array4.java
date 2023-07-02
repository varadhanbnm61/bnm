package practice.java.learn;//String Array

import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] varadhan=new String[5];
System.out.println(varadhan.length);
varadhan[0]="abc";
varadhan[1]="bbc";
varadhan[2]="cbc";
//occupies continuous memory
//unused memory is wasted(fixed memory size)
//array is a collection of similar data type
//syntax:dint air[]=new dint[5];
//5 is must dint data type;
//-5;negative array exception
//what is purpose of new;
//in java array is considers as object
//
int i=0;
while(i<varadhan.length) {
System.out.println(varadhan[i]);
i++;
	
}
	}
}



