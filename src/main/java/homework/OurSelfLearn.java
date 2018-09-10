package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OurSelfLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     ChromeDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.myHCL.com");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //Login
     driver.findElement(By.id("txtUserID")).sendKeys("GOKUL");
     driver.findElement(By.id("txtPassword")).sendKeys("12345");
     
    //WebElement src = driver.findElement(By.id("ddlDomain"));
     //Select element = new Select(src);
     //element.selectByValue("HCLTECH");
     //element.selectByIndex(2);
     //element.selectByVisibleText("HCLTECH");
     
      driver.findElement(By.id("ddlDomain")).sendKeys("HCLTECH");
     
     
	}

}
