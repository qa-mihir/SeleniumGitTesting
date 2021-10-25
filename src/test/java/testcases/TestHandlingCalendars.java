package testcases;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHandlingCalendars {
	
	static int targetDay = 0,
			targetMonth = 0,
			targetYear = 0;
	
	static int currentDay = 0,
			currentMonth = 0,
			currentYear = 0;
	
	static int jumpMonthsBy = 0;
	
	static boolean increment = true;
	

	public static void main(String[] args) {
	
	/*
	 * 
	 * target day, month, year
	 * current day, month, year
	 * jump to the month
	 * increment or decrement
	 */		
		
		String dateToSet = "16/10/2015";
		
		//get current date
		
		getCurrentDateMonthAndYear();
		System.out.println(currentDay+"   "+currentMonth+"  "+currentYear);
		
		//get target date
		getTargetDateMonthAndYear(dateToSet);
		System.out.println(targetDay+"   "+targetMonth+"   "+targetYear);
		
		//get Jump Month
		calculateHowManyMonthsToJump();
		System.out.println(jumpMonthsBy);
		System.out.println(increment);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).click();
		
		for(int i=0; i<jumpMonthsBy; i++) {
			if(increment) {
				driver.findElement(By.xpath(""));
			}
		}
		
		
		
		
		
		
		
		
		
	
	}
	
	
	public static void getCurrentDateMonthAndYear() {
		
		Calendar cal = Calendar.getInstance();
		
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
		
	}
	
	public static void getTargetDateMonthAndYear(String dateString) {
		
		int firstIndex = dateString.indexOf("/");
		int lastIndex = dateString.lastIndexOf("/");
		
		String day = dateString.substring(0, firstIndex);
		targetDay = Integer.parseInt(day);
		
		String month = dateString.substring(firstIndex+1, lastIndex);
		targetMonth = Integer.parseInt(month);
		
		String year = dateString.substring(lastIndex+1, dateString.length() );
		targetYear = Integer.parseInt(year);
	
		
	}
	
	public static void calculateHowManyMonthsToJump() {
		
		if((targetMonth-currentMonth)>0) {
			jumpMonthsBy = (targetMonth-currentMonth);
		}else {
			jumpMonthsBy = (currentMonth-targetMonth);
			increment = false;
		}
	}
	
	
	
	
	
	
	
	
	
	

}
