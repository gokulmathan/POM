package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.navigate().to("http://leaftaps.com/opentaps/");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   driver.findElementById("username").sendKeys("DemoSalesManager");
		
			driver.findElementById("password").sendKeys("crmsfa");
		 
			driver.findElementByClassName("decorativeSubmit").click();
				
			driver.findElementByLinkText("CRM/SFA").click();
		
			driver.findElementByLinkText("Leads").click();
			 
			driver.findElementByLinkText("Merge Leads").click();
			
			driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
			
			Set<String> src = driver.getWindowHandles();
			List<String> element = new ArrayList<String>();
			element.addAll(src);
			driver.switchTo().window(element.get(1));
			
			driver.findElementByName("firstName").sendKeys("Atreya");
			driver.findElementByXPath("//button[@class='x-btn-text']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
			
			/*src = driver.getWindowHandles();
			element = new ArrayList<String>();
			element.addAll(src);*/
			driver.switchTo().window(element.get(0));
			Thread.sleep(3000);
			
			driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
			
			src = driver.getWindowHandles();
			element = new ArrayList<String>();
			element.addAll(src);
			driver.switchTo().window(element.get(1));
			
			driver.findElementByName("firstName").sendKeys("Atreya");
			Thread.sleep(3000);
			driver.findElementByXPath("//button[@class='x-btn-text']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
			
			/*src = driver.getWindowHandles();
			element = new ArrayList<String>();
			element.addAll(src);*/
			driver.switchTo().window(element.get(0));
			
			driver.findElementByLinkText("Merge").click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByName("id").sendKeys("10107");
			driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
			Thread.sleep(3000);
			driver.close();
			
	}

}
