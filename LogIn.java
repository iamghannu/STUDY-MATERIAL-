package PAYTM;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Point;
public class LogIn {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GHANSHYAM AGARWAL\\Desktop\\selenium set up\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.Window().maximize();
		//driver.manage().Window.Maximize();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        String handle= driver.getWindowHandle();
        driver.findElement(By.className("_3ac-")).click();
        Thread.sleep(6000);
        Set handles = driver.getWindowHandles();
        for (String handle1 : driver.getWindowHandles()) {
        	 
        	System.out.println(handle1);

        	driver.switchTo().window(handle1);

        	}
        driver.findElement(By.xpath("//input[@name="username"]"));
        	
	}

}
