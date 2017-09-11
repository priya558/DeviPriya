package seleniumexamples;

import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Testngclass1 {
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
	@Test(priority=1)
	public void search()
	{
		System.out.println("search successfully");
	}
	@Test(priority=2)
	public void advancedsearch()
	{
		System.out.println("advanced search successful");
	}
	

}
