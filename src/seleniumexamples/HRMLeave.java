package seleniumexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HRMLeave {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		//Navigate to MyLeave Page
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		//drop down Code
		Thread.sleep(2000);
		Select leavetype = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		leavetype.selectByVisibleText("Personal Leave");
		//Handling alerts
		Thread.sleep(2000);
		driver.findElement(By.id("leaveBalance_details_link")).click();
		driver.findElement(By.id("closeButton")).click();
		//Alert AlertMessage = driver.switchTo().alert();
		//System.out.println(AlertMessage.getText());
		
		//AlertMessage.accept();
		
		
		
		
		
		
		
	}

}
