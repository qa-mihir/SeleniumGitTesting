package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSLiders {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirts/pr?sid=clo%2Cash%2Cank&p%5B%5D=facets.price_range.from%3DMin&otracker=categorytree&p%5B%5D=facets.price_range.to%3DMax&p%5B%5D=facets.ideal_for%255B%255D%3DMen");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement slider = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		
		new Actions(driver).dragAndDropBy(slider, 33, 0).perform();
		

	}

}
