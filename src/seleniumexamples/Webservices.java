package seleniumexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webservices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	
		
		//Get Row Count
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
			int r = rows.size();
			System.out.println(r);
		//Get Column Count
		List<WebElement>columns = driver.findElements(By.xpath("//*[@id='resultTable']/thead/tr/th"));
		int c = columns.size();
		System.out.println(c);
		//get text
		String text= driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[4]/td[1]/a")).getText();
		System.out.println(text);
		//Display first column in all rows
		String actual = "2017-10-04 to 2017-10-10";
		int i;
		for(i=1;i<=r;i++)
		{
			String expected = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(expected);
		    if(expected.contentEquals(actual))
		    {
		    	break;
		    }
	  }
	System.out.println(i);
	WebElement dropdown = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[8]/select"));
	Select sel = new Select(dropdown);
	sel.selectByVisibleText("Cancel");
	driver.findElement(By.id("btnSave")).click();
	
	}
}
