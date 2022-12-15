package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumFirstDemo {
	public static void main(String[] args) {
		// webdriver.gecko.driver, webdriver.ie.driver
		// mozilla , edge(window), safari(mac)
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vaibhav\\git\\sepbatch\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   // session - without cookies
		driver.manage().window().maximize();  // maximize
		
		// website open
		driver.get("https://www.google.com");
		
		By searchBox = By.name("q");  // 
		WebElement elm = driver.findElement(searchBox);
		elm.sendKeys("sachin");
		
		
		// locator 
		// 8 types - 
		// id
		// name
		// classname
		// tagname
		// linktext
		// partiallinktext
		// css selector
		// xpath
		
		
//		driver.quit();   // close entire session
	}
}
