package core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
	
	private WebDriver driver;
	
	
	
	public WebDriver getDriver(String browserName) throws Exception {
		switch(browserName.toLowerCase()) {  
		 case "chrome" : 
			  			 		     
			   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			  // System.setProperty("webdriver.chrome.driver","F:\\Mailer Cloud\\Automation\\TestFramework17\\chromedriver.exe");
			    
			   //System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
			  /*  ChromeOptions options = new ChromeOptions();
			    options.addArguments("--no-sandbox"); //Bypass OS security model   
			    options.addArguments("--start-maximized");
			    options.addArguments("--disable-dev-shm-usage");
			    options.addArguments("--headless");
			   // webDriver = new ChromeDriver(options);*/

			    			

		        driver =  new ChromeDriver();
		        
		        System.out.println("Wait");
		        Thread.sleep(1000);
				break;
		  case "firefox" : 
				System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
				driver =  new FirefoxDriver();
				break;
		  case "edge" : 	
			  	System.setProperty("webdriver.edge.driver","C:\\drivers\\msedgedriver.exe");
				driver =  new EdgeDriver();
				break;
			default: 
				throw new Exception("Incorrect browser "+ browserName + " provided");	
		}
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(TestConfig.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(TestConfig.getProperty("implicitiWait")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
		return driver;
	}
	
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
	

}
