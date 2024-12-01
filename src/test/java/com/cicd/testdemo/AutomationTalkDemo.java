package com.cicd.testdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTalkDemo {
	public static WebDriver driver;

	@BeforeMethod
       public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
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
<<<<<<< HEAD
    		System.out.println("NewTest3 title is" + driver.getTitle());
=======
    		System.out.println("title is" + driver.getTitle());
>>>>>>> e864103d2431c0b5eaa02809dc1bb5c3692f6363
    	}
    	
    	@AfterMethod
    	public void quit() {
    		driver.quit();
    	}

	}




