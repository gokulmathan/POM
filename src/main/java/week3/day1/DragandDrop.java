package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window();
		//driver.get("https://jqueryui.com/draggable/");
		//driver.get("https://jqueryui.com/selectable/");
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		//WebElement drag = driver.findElementById("draggable");
		/*WebElement it = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement it1 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement it2 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement it3 = driver.findElementByXPath("//li[text()='Item 7']");
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.CONTROL).click(it).click(it1).click(it2).click(it3).perform();*/
		WebElement it = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement it1 = driver.findElementByXPath("//li[text()='Item 4']");
		int y = it1.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(it,0,y).release().perform();
		//builder.clickAndHold(it).moveToElement(it1).release().perform();
		}
}
			


