package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
	    driver.findElement(By.xpath("//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
		//Thread.sleep(5000);
		//WebElement act = driver.findElement(By.linkText("Enter your User ID using standard keyboard"));
		
		//String act = driver.findElement(By.xpath("//*[@id='main-wrapper']/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]")).getText();
		  //String exp = "Enter your User ID using standard keyboard";
		  //if(exp.contains(act))
		  //{
			  //System.out.println("Pass");
		  //}
		  //else
		  //{
			  //System.out.println("Fail");
		  //}
		if(driver.getPageSource().contains("Enter your User ID using standard keyboard"))
		{
			System.out.println("pass");
		}
		else
		{
			
			System.out.println("Fail");
		}
	}

}
