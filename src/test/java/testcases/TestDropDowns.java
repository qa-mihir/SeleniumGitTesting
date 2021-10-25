package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("searchLanguage")).click();
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		
		/*Select select = new Select(dropdown);
		select.selectByValue("en");*/
		
		List<WebElement> links = dropdown.findElements(By.tagName("option"));
		System.out.println(links.size());
		
		for(WebElement link: links) {
			System.out.println(link.getText() + " -- URS IS ---"+link.getAttribute("href"));
			
		}
		
		/*
		 * dropdown.findelemnts(By.tagName("option")).get(2).click();
		 * 
		*/
		//WebElement block = driver.findElement(By.xpath("//div[@class='other-projects']"));
/*		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link: links) {
			System.out.println(link.getText() + " -- URS IS ---"+link.getAttribute("href"));
			
		}*/
		
		/*WebElement secondBlock = driver.findElement(By.id("blockid"));
		secondBlock.findElements(By.id("abc")).get(2).click();*/
		
		
		
		
		
	}

}
