import java.io.*;
import java.util.*;
public class ElseIf{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of three sub");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int total=s1+s2+s3;
		float avg=total/3.0;
		System.out.println("total marks is",+total);
		if(avg>=75)
		{
			System.out.println("student avg is",+avg);
		}
		else if(avg>=60&&avg<75)
		{
			System.out.println("student avg is",+avg);
		}
		else
		{
			System.out.println("student fail");
		}
	}
}
