package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDragWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		Dimension size = new Dimension(500,400);
		driver.manage().window().setSize(size);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	//(1051, 806)

}
