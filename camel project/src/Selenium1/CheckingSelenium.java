package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingSelenium {
	public static void main(String[] args) {
	System.setProperty("WebDriver.Chrome.driver",
			"D:\\New folder\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	

}
}
