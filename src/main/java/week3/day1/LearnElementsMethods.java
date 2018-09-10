package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearnElementsMethods {
	
	public static void main(String  [] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElementByName("q").sendKeys("gokul");
		driver.findElementByXPath("//input[@name='btnK']").click();
		List<WebElement> allQutoes = driver.findElementsByPartialLinkText("gokul");
		System.out.println(allQutoes.size());
		
		
		
		
		
			
			
			
		}
		
	}


