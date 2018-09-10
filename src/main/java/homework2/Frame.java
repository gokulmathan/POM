package homework2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		    ChromeDriver driver = new ChromeDriver();
		   driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		   driver.switchTo().frame("childIframe");
		   Thread.sleep(3000);
		   driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
		
		
		
		   	    
		    
	}

}
