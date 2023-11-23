package com.Clickbuzz.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Clickbuzz.pages.BoarderedGridPage;
import com.Clickbuzz.pages.HomePage;
import com.Clickbuzz.pages.NoPageHeadingPage;
import com.Clickbuzz.pages.ShopHiddenSideBarPage;

public class BoarderedGridTest {


	public WebDriver driver;
	

	@Test
	
	public void verifybordergridpage() throws InterruptedException {
		
		
		String projPath = System.getProperty("user.dir");
		  System.out.println("Project path is :"+projPath);
		  
		  System.getProperty("webdriver.chrome.driver",projPath+"/src/test/resources/Driver/chromedriver.exe");
		  
		  ChromeDriver driver=new ChromeDriver();
		  HomePage loginpage=new HomePage(driver);
		 
		  
		  BoarderedGridPage boarderedg=new BoarderedGridPage(driver);
		  
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.navigate().to("https://cls-clickbizz.in/");
	
		 loginpage.login();
		 
		 String cuurentURL =driver.getCurrentUrl();
		 String expectedURL="https://cls-clickbizz.in/";
		 Assert.assertEquals(cuurentURL, expectedURL);
		 Thread.sleep(2000);
		 boarderedg.borderedg();
		 
		 driver.close();
		 Thread.sleep(2000);
		 driver.quit();
		 
	}
	
	
}
