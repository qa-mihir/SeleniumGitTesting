package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement img = driver.findElement(By.xpath("//p[contains(text(),'Click the image')]/img"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(img).perform();
		action.moveToElement(driver.findElement(By.xpath("//td[text()='Product Info']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//td[text()='Installation']"))).perform();
		driver.findElement(By.xpath("//td[text()='How To Setup']")).click();
		
		
		

	}

}
