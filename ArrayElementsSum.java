import java.io.*;
import java.util.*;
class ArrayElementsSum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" values into the array");
		for(int i:a){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of the given elements is : "+sum);
	}
}