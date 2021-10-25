package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Way2Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("way2automation");
		
		driver.findElement(By.xpath("//input[@aria-label='Google Search']")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[text()='Way2Automation']")).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='g']/link"))).click();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no. of links: " +links.size());
		
		for(WebElement link: links) {
			System.out.println(link.getText());
		}

	}

}
