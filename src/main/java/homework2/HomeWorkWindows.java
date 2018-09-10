package homework2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        /*ChromeOptions options=new ChromeOptions();
		options.setHeadless(false);
		options.addArguments("--disable-infobars");*/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in");
		
		
		
		
		
		
		//WebElement tab = driver.
		//Actions builder = new Actions(driver);
		//builder.perform();
		
		
		
		

	}

}
