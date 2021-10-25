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

public class DummyFormRegistration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement box = driver.findElement(By.id("load_box"));
		
		box.findElement(By.name("name")).sendKeys("Mihir");
		box.findElement(By.name("phone")).sendKeys("5559998562");
		box.findElement(By.name("country")).sendKeys("Algeria");
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='submit']")));
		List<WebElement> button = box.findElements(By.xpath("//input[@value='Submit']"));
		System.out.println(button.size());
		button.get(1).click();
		
		//box.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).click();
		
	}

}
