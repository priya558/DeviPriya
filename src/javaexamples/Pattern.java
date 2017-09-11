package javaexamples;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,rows;
		System.out.println("Enter row number");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(j);
			}
			System.out.println("\n");
		}
		
		
		

	}

}
