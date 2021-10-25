package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AskuityChallenge {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		

		WebElement women = driver.findElement(By.linkText("Women"));

		Actions action = new Actions(driver);
		women.click();

		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//li/a[text()='Dresses'])[1]"))).click();

		driver.findElement(By.xpath("(//ul[@class='tree dynamized']/li)[2]")).click();

		driver.findElement(By.xpath("(//div/ul[@class='tree dynamized']/li)[3]")).click();

		WebElement summerDress = driver.findElement(By.xpath("(//div[@class='right-block'])[1]"));
		action.moveToElement(summerDress).build().perform();
		driver.findElement(By.xpath("//span[text()='Quick view']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		driver.findElement(By.xpath("//div[@class='selector']")).click();
		List<WebElement> dropdown = driver.findElements(By.xpath("//div[@class='selector']//option"));
		// System.out.println(dropdown.size());
		dropdown.get(0).click();
		driver.findElement(By.id("add_to_cart")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		WebElement cart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		action.moveToElement(cart).build().perform();
		driver.findElement(By.id("button_order_cart")).click();
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		driver.findElement(By.id("email_create")).sendKeys("learningqa@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		WebElement box1 = driver.findElement(By.xpath("(//div[@class='account_creation'])[1]"));
		
		
		box1.findElement(By.id("customer_firstname")).sendKeys("FirstName");
		box1.findElement(By.id("customer_lastname")).sendKeys("LastName");
		box1.findElement(By.id("passwd")).sendKeys("notarealpassword@7");
		
		WebElement box2 = driver.findElement(By.xpath("(//div[@class='account_creation'])[2]"));
		
		box2.findElement(By.id("firstname")).sendKeys("FirstName");
		box2.findElement(By.id("lastname")).sendKeys("LastName");
		box2.findElement(By.id("address1")).sendKeys("33 unknown street");
		box2.findElement(By.id("city")).sendKeys("Toronto");
		
		WebElement stateDropdown = driver.findElement(By.id("id_state"));
		
		Select select = new Select(stateDropdown);
		select.selectByValue("5");
		box2.findElement(By.id("postcode")).sendKeys("55599");
		box2.findElement(By.id("phone_mobile")).sendKeys("5459995852");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.xpath("//div[@class='checker']")).click();
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		
		
	
		
	

	}

}
