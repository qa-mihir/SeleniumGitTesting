package testcases;

import java.util.concurrent.TimeUnit;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Captcha {
	
	@Test(invocationCount=5)
	public static void captchaTest() throws ScriptException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		String sum = driver.findElement(By.id("mathq2")).getText();
		String sum2 = sum.replaceAll("\\s", "");
		//System.out.println(sum2);
		String sum3 = sum2.substring(0, (sum2.length() - 1));
		Integer ans = calculator(sum3);
		driver.findElement(By.id("mathuserans2")).sendKeys(ans.toString(calculator(sum3)));
		driver.findElement(By.xpath("//div[@pg='Vote']")).click();
		driver.close();
	   
		
	}
	
	  public static int calculator(String str)
	    {
	        // Split expression string using + operator.
	        // Now every index will have either an integer or an
	        // expression of only products.
	        String[] arr = str.split("\\+");
	       
	  
/*	        for (int i = 0; i < arr.length; i++) {
	            int result = 1;
	  
	            // If index contains * sign,
	            // split expression using *
	            if (arr[i].contains("*")) {
	                String[] num = arr[i].split("\\*");
	  
	                // Multiply each number separated by * and
	                // store final product in 'result' variable
	                for (int j = 0; j < num.length; j++) {
	                    result *= Integer.parseInt(num[j]);
	                }
	  
	                // Store resultant product value in the
	                // array index. For ex: index having 2*3 is
	                // replaced by 6 and index having 4*5*6 is
	                // replaced by 120.
	                arr[i] = String.valueOf(result);
	            }
	        }*/
	        
	        
	  
	        // Now every array index has a
	        // single integer as element.
	        int len = arr.length;
	        int sum = 0;
	  
	        // Calculate the sum of all elements
	        // of array to get final result.
	        for (int i = 0; i < len; i++) {
	            sum += Integer.parseInt(arr[i]);
	        }
	  
	        // Return the final result
	        return sum;
	    }

	
}


