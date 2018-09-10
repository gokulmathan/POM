package homework;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelfLearn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_dropdown-menu&stacked=h");
		driver.switchTo().frame("iframeResult");
		WebElement src = driver.findElementByClassName("dropdown-menu");
		List<WebElement> dec = src.findElements(By.tagName("li"));
		System.out.println(dec.size());
		for (WebElement webElement : dec)
		{
			String Name= webElement.getText();
			System.out.println("tt: "+Name);
			
		}
		
	}

}
