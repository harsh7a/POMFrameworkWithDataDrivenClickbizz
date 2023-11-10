package com.Clickbuzz.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Clickbuzz.pages.LoginPage;

public class LoginPageTest {
@Test
	public void varifyLogin() throws InterruptedException {
		
		
		  String projPath = System.getProperty("user.dir");
		  System.out.println("Project path is :"+projPath);
		  
		  System.getProperty("webdriver.chrome.driver",projPath+"/src/test/resources/Driver/chromedriver.exe");
		  
		  ChromeDriver driver=new ChromeDriver();
		  LoginPage loginpage=new LoginPage(driver);
		  
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.navigate().to("https://cls-clickbizz.in/");
		 //Thread.sleep(2000);
		 loginpage.login();
		 
		 String cuurentURL =driver.getCurrentUrl();
		 String expectedURL="https://cls-clickbizz.in/";
		 Assert.assertEquals(cuurentURL, expectedURL);
		 
		 driver.close();
		 Thread.sleep(2000);
		 driver.quit();
		 
	}
	
	
}
