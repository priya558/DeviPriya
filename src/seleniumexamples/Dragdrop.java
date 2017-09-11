package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		Actions obj = new Actions(driver);
		obj.dragAndDrop(source, destination).build().perform();
		
	}

}
