package javaexamples;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			System.out.println(n+"*"+i+ " = "+n*i);
		}
	}

}
