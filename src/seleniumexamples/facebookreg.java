package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookreg {
	public static void main(String[] args){
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("priya9");
		driver.findElement(By.name("lastname")).sendKeys("nandigam");
		driver.findElement(By.name("reg_email__")).sendKeys("9490497623");
		driver.findElement(By.name("reg_passwd__")).sendKeys("nandigam558");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("10");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("May");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1992");
		driver.findElement(By.id("u_0_g")).click();
		driver.findElement(By.name("websubmit")).click();
		
}

}
