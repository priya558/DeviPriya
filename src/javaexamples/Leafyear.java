package javaexamples;

import java.util.Scanner;

public class Leafyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year");
		Scanner sc =  new Scanner(System.in);
		int year = sc.nextInt();
		if((year%4 == 0))
		{
			System.out.println("year" +year+ "is Leap year");
		}
		else
		{
			System.out.println("year" +year+ "is not Leap year");
		}
		
	}

}
