package seleniumexamples;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Testngclass2 {
	@BeforeClass
	public static void login()
	{
		System.out.println("login successful");
	}
	@AfterClass
	public static void logout()
	{
		System.out.println("logout successful");
	}
	@Test
	public static void Testingstart()
	{
		System.out.println("Testing started successfully");
	}
	@Test
	public static void Testingstop()
	{
		System.out.println("Testing stopped successfully");
	}
	
}

