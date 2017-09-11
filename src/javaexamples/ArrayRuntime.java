package javaexamples;

import java.util.Scanner;

public class ArrayRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array values");
		for(int i= 0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Displaying Array values");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ "");
		}
	}

}
