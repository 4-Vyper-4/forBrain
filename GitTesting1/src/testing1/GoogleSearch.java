package testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/brianguadron/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Cybertekschool.com");
		String expected = new String("Google");
		String actual = driver.getTitle();
		if (driver.getTitle().equalsIgnoreCase(expected))
			System.out.println("Pass");
		else
			System.out.println("Fail Title: " + expected + "(Expected) " + "(Actual) " + actual);
		driver.close();
		
		
	}
}