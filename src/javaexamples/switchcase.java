package javaexamples;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number between 1 o 4");
	int d = sc.nextInt();
	
	switch(d){
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		default:
			System.out.println("Invalid input,try again");
	
	}
}

}

