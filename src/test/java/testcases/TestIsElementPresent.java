package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		int size = driver.findElements(by).size();
		if(size ==0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		


		//System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'English')]")).isDisplayed());
		//isDisplayed() checks if the element is visible or not on display
		// and doesn't check if the element is present or not
		
		System.out.println(isElementPresent(By.id("searchLanguageddd")));
		
	}

}
