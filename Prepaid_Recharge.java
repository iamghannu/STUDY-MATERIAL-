package PAYTM;


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
public class Prepaid_Recharge {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GHANSHYAM AGARWAL\\Desktop\\selenium set up\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.Window().maximize();
		//driver.manage().Window.Maximize();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/ul/li[1]/div/div/input"));
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/ul/li[1]/div/div/input")).sendKeys("8001352770");
     //Select e= new Select (  driver.findElement(By.xpath("//label[@data-reactid=\"206\")));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//label[@data-reactid=\"206\"]")));
        driver.findElement(By.xpath("//div[@class=\"_1e5B\"]")).click();
        actions.sendKeys("BSNL");
        actions.build().perform();
        Thread.sleep(2000);
     //driver.findElement(By.xpath("//label[@data-reactid=\"206\"]")).sendKeys("BSNL");
    // e.selectByIndex(1);    
     //Thread.sleep();
        //driver.wait();
        //driver.close();
        //WebElement element = driver.findElement(By.xpath("//label[text()='Circle']"));
       // org.openqa.selenium.Point classname = element.getLocation();
       // int x = classname.getX();

        //JavascriptExecutor js =(JavascriptExecutor)driver;
       // js.executeScript(window.scrollTo(0,element.getLocation().x));
       // element.click();
        
        boolean ans= driver.findElement(By.xpath("//label[text()='Circle']")).isDisplayed();
        if(ans)
        {
        	WebElement element = driver.findElement(By.xpath("//label[text()='Circle']"));
             Point classname = element.getLocation();
             int x = classname.getX();
             int y = classname.getY();
             actions.moveToElement(element, x, y).click();
        	//actions.moveToElement(driver.findElement(By.xpath("//label[text()='Circle']")));
        	// driver.findElement(By.xpath("//label[text()='Circle']")).click();
        	 actions.sendKeys("West Bengal");
             actions.build().perform();
        }
        
       // actions.moveToElement(driver.findElement(By.xpath("//label[text()='Circle']")));
      // driver.findElement(By.xpath("//label[text()='Circle']")).click();
      //  actions.sendKeys("West Bengal");
        // actions.sendKeys("West Bengal");
       // actions.build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//label[@data-reactid=\"218\"]")));
        actions.sendKeys("110");
        actions.build().perform();
	}

}
