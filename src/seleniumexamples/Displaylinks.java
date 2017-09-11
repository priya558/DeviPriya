package seleniumexamples;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Displaylinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List <WebElement> linksize= driver.findElements(By.tagName("a"));
		System.out.println(linksize.size());
		for(int i=0;i<linksize.size();i++)
		{
			String str = linksize.get(i).getText();
			System.out.println(str);
					
					
		}
			
		
}

}
