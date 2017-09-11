package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mercuryproject {
	public static void main(String[] args){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("priya");
		driver.findElement(By.name("lastName")).sendKeys("nandigam");
		driver.findElement(By.name("phone")).sendKeys("9490497623");
		driver.findElement(By.name("userName")).sendKeys("devipriya.nandigam@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Kukatpally,Hyderabad");
		driver.findElement(By.name("city")).sendKeys("hyderabad");
		driver.findElement(By.name("state")).sendKeys("AndhraPradesh");
		driver.findElement(By.name("postalcode")).sendKeys("534704");
		
		//Select country = new.Select(driver.findElement(By.name("country")));
		
		
	}
}
