package Javaadvanced;
import Javaadvanced.Animalinher;

public class MonkeyInhe extends Animalinher
{
	public void Jump()
	{
		System.out.println("Jumping");
	}
	public void Run()
	{
		System.out.println("Running");
		
	}
	public static void main(String[] args)
	{
		 MonkeyInhe obj2 = new  MonkeyInhe();
		 obj2.eat();
		 obj2.Run();
	}
}
