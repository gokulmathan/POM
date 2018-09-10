package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	public static void main (String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Harry");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String txt = driver.findElementById("demo").getText();
		System.out.println(txt);
		
		}
}
