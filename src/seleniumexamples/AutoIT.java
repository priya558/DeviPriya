package seleniumexamples;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  //WebDriver driver =  new ChromeDriver();
	
	driver.get("https://login.naukri.com/nLogin/Login.php?msg=0&URL=http%3A%2F%2Fmy.naukri.com");
	driver.findElement(By.id("emailTxt")).sendKeys("priyanandigam55555@gmail.com");
	driver.findElement(By.id("pwd1")).sendKeys("nandigam558");
	Thread.sleep(5000);
	driver.findElement(By.name("Login")).click();
	Actions action = new Actions(driver);
	WebElement edit = driver.findElement(By.xpath("//*[@id='mainHeader']/div/div/ul[2]/li[2]/a/div[2]"));
	action.moveToElement(edit).build().perform();
	driver.findElement(By.xpath("//*[@id='mainHeader']/div/div/ul[2]/li[2]/div/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='colL']/div[2]/div[1]/a[1]")).click();
	driver.findElement(By.id("uploadLink")).click();
	driver.findElement(By.id("attachCV")).click();
	//below line execute AutoIT Script
	Runtime.getRuntime().exec("D:\\autoIt\\FileUpload.exe");
	if(driver.getPageSource().contains("File uploaded successfully"))
	{
		System.out.println("pass");
		//WebElement ele =driver.findElement(By.xpath(".//*[@id='editForm']/div[7]/button]"));
		//String name = driver.findElement(By.cssSelector(".w85bt.fl")).getText();
		//System.out.println("Save name:"+name);
		Thread.sleep(10000);
		driver.findElement(By.linkText("Save")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", ele);
	}
	else
	{
		System.out.println("fail");
	}

	}

}
