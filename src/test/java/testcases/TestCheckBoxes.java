package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement block = driver.findElement(By.xpath("(//div[@class='display'])[1]"));
		
		List<WebElement> checkboxes = block.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("total checkboxes: " +checkboxes.size());
		
		for(WebElement link:checkboxes) {
			link.click();
			
		}

	}

}
