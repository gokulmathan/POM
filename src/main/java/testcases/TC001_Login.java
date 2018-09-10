package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC001_Login extends SeMethods{
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uname);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCrm = locateElement ("linktext", "CRM/SFA");
		click(eleCrm);
		WebElement eleLeads = locateElement ("linktext", "Leads");
		click(eleLeads);
	}
		
		
		
		
	}









