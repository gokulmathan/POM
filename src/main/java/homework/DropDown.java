package homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Drop down")).click();
		
		WebElement src =driver.findElement(By.id("dropdown1"));
		Select element = new Select(src);
		element.selectByValue("1");
		
		WebElement src1 =driver.findElementByName("dropdown2");
        Select element1 =new Select(src1);
		//element1.selectByVisibleText("Loadrunner");
		List<WebElement> allOption = element1.getOptions();
		System.out.println(allOption.get(4).getText());
		
		WebElement src2 =driver.findElementById("dropdown3");
		Select element2 = new Select(src2);
		element2.selectByIndex(3);
		/*List<WebElement> allOption1 = element2.getOptions();
		int count = allOption1.size();
		System.out.println(count); */
		
		WebElement src3 =driver.findElementByClassName("dropdown");
		Select element3 = new Select(src3);
		element3.selectByIndex(2);
		
		WebElement src5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		Select element5 = new Select(src5);
		element5.selectByVisibleText("Appium");
		
		WebElement src4= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select element4 = new Select(src4);
		element4.selectByValue("2");
		element4.selectByValue("3");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
