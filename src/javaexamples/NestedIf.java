package javaexamples;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values between 1 to7");
		int d = sc.nextInt();
		if(d==1)
		{
			System.out.println("Sunday");
		}
		else if(d==2)
		{
			System.out.println("Monday");
		}
		else if(d==3)
		{
			System.out.println("Tuesday");
		}
		else if(d==4)
		{
			System.out.println("Wednesday");
		}
		else if(d==5)
		{
			System.out.println("Thursday");
		}
		else if(d==6)
		{
			System.out.println("Friday");
		}
		else if(d==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid Input,try again");
		}
		
	}

}
