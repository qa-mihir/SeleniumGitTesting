package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		
		/*
		 * Latest Selenium jar file
		 * Latest Browser version - FF, Chrome, IE
		 * Latest Browser executable file
		 * 
		*/
		//CTRL+SHIFT+O shortcut to import the package
		
		// Configuring Firefox Driver
		
//		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
		
		// Configuring Chrome Driver
		

		
		/*System.setProperty("webdriver.edge.driver","C:\\SeleniumJars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // webdriver interface extends searchcontext interface whithc is the top most
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		
		driver.close(); // current browser window
		driver.quit(); // current browser window + all related browser in session
		
		
		
		
		
		

	}

}
