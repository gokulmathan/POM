package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowsHandles {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://legacy.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("GUEST CHECK-IN")).click();
		 
        Set<String>allWin = driver.getWindowHandles();
        List<String> allList = new ArrayList<String>();
        allList.addAll(allWin);
        driver.switchTo().window(allList.get(1));
        
        Thread.sleep(5000);
        
        File src2 = driver.getScreenshotAs(OutputType.FILE);
 		File dec = new File("./snap/img2.png");
      	FileUtils.copyFile(src2, dec);
      	
      	Thread.sleep(3000);
      	
        driver.findElement(By.linkText("View Offer»")).click();
        
        Set<String> allWin1 = driver.getWindowHandles();
        List<String> allList1 = new ArrayList<String>();
        allList1.addAll(allWin1);
        driver.switchTo().window(allList1.get(2));
        System.out.println(driver.getTitle());
        
        Thread.sleep(3000);
        
        File src3= driver.getScreenshotAs(OutputType.FILE);
 		File dec2 = new File("./snap/img3.png");
      	FileUtils.copyFile(src3, dec2);
      	
      	driver.close();
        
     

	}

}
