package javaexamples;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args){
		int i,m=0,flag=0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("not a prime");
				flag =1;
				break;
			}
			if(flag==0)
			{
				System.out.println("prime number");
				break;
				
			}
				
				
		}
		
	}
}
