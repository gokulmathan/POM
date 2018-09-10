package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Launch Browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName = new className();
		ChromeDriver driver = new ChromeDriver();
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
		//Enter The CompanyName
		driver.findElementById("createLeadForm_companyName").sendKeys("DRS Pvt");
		//Enter The ParentAccount
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("10423");
		//Enter The ForeName
		driver.findElementById("createLeadForm_firstName").sendKeys("Gokul");
		//Enter the SurName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mathan");
		//Enter The Type Of Source
		WebElement make = driver.findElementById("createLeadForm_dataSourceId");
		Select source = new Select(make); 
		source.selectByVisibleText("Direct Mail");
		//Enter The Type of Marketing Campaign
		WebElement campaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketing = new Select(campaign); 
		marketing.selectByVisibleText("Car and Driver");
		//Enter The FirstName Local
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Gokul");
		//Enter The LastName Local
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Mathan");
		//Enter the Salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Greeting");
		//Enter The Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Salesmanager");
		//Enter The Department
		driver.findElementById("createLeadForm_departmentName").sendKeys("Checking");
		//Enter The AnnualRevenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2Crore");
		//Enter The Type Of Industry
		WebElement note = driver.findElementById("createLeadForm_industryEnumId");
		Select industry = new Select(note);
		industry.selectByValue("IND_SOFTWARE");
		//Enter The  Of OwnerShip
		WebElement own = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownership = new Select(own);
		ownership.selectByValue("OWN_PARTNERSHIP");
		//Enter The SIC Code
		driver.findElementById("createLeadForm_sicCode").sendKeys("12234");
		//Enter The Description
		driver.findElementById("createLeadForm_description").sendKeys("To Make a Note");
		//Enter The ImportantNote
		driver.findElementById("createLeadForm_importantNote").sendKeys("To Be Improve");
		//Enter The Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("76");
		//Enter The PhoneNumber
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9787652626");
		//Enter The Mail
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("gokulmathan1@gmail.com");
		//Enter The ToName
		driver.findElementById("createLeadForm_generalToName").sendKeys("Gokul");
		//Enter The AddressLine1
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("kovil street");
		//Enter The City
		driver.findElementById("createLeadForm_generalCity").sendKeys("Erode");
		//Enter The PostalCode
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("638003");
		//Enter The Type of State
				WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
				Select province = new Select(state);
				province.selectByValue("IN");
		//Enter The Type of Country
				WebElement mark = driver.findElementById("createLeadForm_generalCountryGeoId");
				Select country = new Select(mark);
				country.selectByValue("IDN");	
		//Click CreateLead
		driver.findElementByName("submitButton").click();
			
		
	}

}
