import java.util.Set;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class PracticeSwitchWindow {
 
		public static WebDriver driver;
 
		public static void main(String[] args) {
 
			// Create a new instance of the Firefox driver
 
	        driver = new FirefoxDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 
	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
 
	        // Store and Print the name of the First window on the console
 
	        String handle= driver.getWindowHandle();
 
	        System.out.println(handle);
 
	        // Click on the Button "New Message Window"
 
	        driver.findElement(By.name("New Message Window")).click();
 
	        // Store and Print the name of all the windows open	              
 
	        Set handles = driver.getWindowHandles();
 
	        System.out.println(handles);
 
	        // Pass a window handle to the other window
 
	        for (String handle1 : driver.getWindowHandles()) {
 
	        	System.out.println(handle1);
 
	        	driver.switchTo().window(handle1);
 
	        	}
 
	        // Closing Pop Up window
 
	        driver.close();
 
	        // Close Original window
 
	        driver.quit();
 
	}
 
}
 
 
Practice Exercise 2
1) Launch new Browser
2) Open URL �http://toolsqa.wpengine.com/automation-practice-switch-windows/�
3) Click on Button �Alert Box�, it will open a Pop Up Window generated by JavaScript
4) Switch to Alert window (Use �SwitchTo()Alert() command)
5) Close the Pop Up Window (Use Accept command)

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
package practiceTestCases;
 
import java.util.Set;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.Alert;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class PracticeSwitchWindow {
 
		public static WebDriver driver;
 
		public static void main(String[] args) {
 
			// Create a new instance of the Firefox driver
 
	        driver = new FirefoxDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 
	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
 
	        // Click on the Button "Alert Box"
 
	        driver.findElement(By.name("Alert Box")).click();
 
	        // Switch to JavaScript Alert window
 
	        Alert myAlert = driver.switchTo().alert();
 
	        // Accept the Alert
 
	        myAlert.accept();
 
	        // Close Original window
 
	        driver.close();
 
	}
 
}
 

 
 
 
 
 
Share this page









