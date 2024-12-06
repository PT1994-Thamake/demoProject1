package com.cicd.testdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationTalkDemo {
	public static WebDriver driver;

	@BeforeMethod
       public void setUp() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
       }
        
        @Test
    	public void Test1() {
    		driver.navigate().to("https://www.AutomationTalks.com");
    		System.out.println("Test1 title is" + driver.getTitle());
    	}
    	@Test
    	public void Test2() {
    		driver.navigate().to("https://www.AutomationTalks.com");
    		System.out.println("Test2 title is" + driver.getTitle());
    	}
    	@Test
    	public void Test3() {
    		driver.navigate().to("https://www.AutomationTalks.com");
    		System.out.println("NewTest3 title is" + driver.getTitle());

    	}
    	
    	@AfterMethod
    	public void quit() {
    		driver.quit();
    	}

	}




