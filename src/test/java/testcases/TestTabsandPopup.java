package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsandPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rbc.com/canada.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		// System.out.println(firstWindow);

		WebElement link = driver.findElement(By.linkText("Privacy & Security"));
		jse.executeScript("arguments[0].click();", link);
		Set<String> winids = driver.getWindowHandles();
		// set only will return unique values no duplications
		Iterator<String> iterate = winids.iterator();
		String firstWindow = iterate.next();
		String secondWindow = iterate.next();
	
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle().contains("Privacy and"));

	}

}
