package javaexamples;

public class constructor {
	constructor()
	{
		System.out.println("constructor executed");
		
	}
	public int add(int x,int y)
	{
		int z = x + y;
		return z;
	}
	public static void main(String[] args)
	{
		constructor obj = new constructor();
		System.out.println(obj.add(20,10));
	}
	
}
