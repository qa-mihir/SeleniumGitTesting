package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='btnK'])[1]"))).click();
		driver.findElement(By.xpath("//h3[text()='Way2Automation']")).click();
		WebElement menu = driver.findElement(By.xpath("(//span[text()='Resources'])[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Practice Site 1'])[1]"))).click();
		//driver.findElement(By.xpath("(//span[text()='Practice Site 1'])[1]")).click();
	}
}


