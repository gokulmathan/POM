package week1.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //Launch Browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName = new className();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login Button 
		driver.findElementByClassName("decorativeSubmit").click();
		//Click Logout Button
		String text = driver.findElementById("form").getText();
		System.out.println(text);
		if (text.contains("Welcome")) {
			System.out.println("Text is matched");
		}else {
			System.out.println("Text is not matched");
		}
		
		// Click CRM/SFA 
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Click Lead
		driver.findElementByLinkText("Leads").click();
		
		//Click Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter the Types of Sources(DropDown method by visible text)
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select element = new Select(src);
		element.selectByVisibleText("Direct Mail");
		
		//Enter the Types of Marketing campaign(DropDown method by value)
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select method = new Select(marketing);
		method.selectByValue("CATRQ_CARNDRIVER");
		
		//Enter the Types of Industry(DropDown method by Index)
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select make =new Select(industry);
		make.selectByIndex(8);
		
		//DropDown method for select all values
		WebElement own =driver.findElementById("createLeadForm_ownershipEnumId");
		Select sel =new Select(own);
		List<WebElement> allOption = sel.getOptions();	
		
		//System.out.println(allOption.get(2).getText());
		
		int count =allOption.size();
		 
		//System.out.println(count);
		/*for (int i=1; i<count; i++) {
			System.out.println(allOption.get(i).getText());
		}*/
		
		/*for (WebElement eachOption  : allOption) {
			System.out.println(eachOption.getText());
		}*/
		System.out.println(allOption.get(count-1).getText());
		 //Take a SnapShot
		//File src2 = driver.getScreenshotAs(OutputType.FILE);
		//File dec = new File("./snap/img1.png");
		//FileUtils.copyFile(src2, dec);
		
		
		}
}

