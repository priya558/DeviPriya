package seleniumexamples;

import org.openqa.selenium.firefox.FirefoxDriver;

public class navigatemethods {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
	}

}