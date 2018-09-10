package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends TC001_Login{
	
	@Test(dataProvider = "boss")
	public void Lead(String fname , String lname, String ppid) {
		
		WebElement eleCreateLeads = locateElement ("linktext", "Create Lead");
		click(eleCreateLeads);
		type(locateElement("id","createLeadForm_firstName"),fname);
		type(locateElement("id","createLeadForm_lastNameLocal"),lname);
		type(locateElement("id","createLeadForm_parentPartyId"),ppid);
	}
	@DataProvider(name = "boss")
	public String [] [] getData() {
		
		String [] [] data = new String [2] [3] ;
		data [0] [0] = "gokul";
		data [0] [1] = "raja";
		 data [0][2] = "10234";
		  return data;
		 
				}
	
	

}
