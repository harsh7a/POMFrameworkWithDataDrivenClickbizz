package com.Clickbuzz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By loginorregister= By.xpath("/html/body/div[1]/header/div/div[2]/div/div/div[3]/div[2]/a/span[2]");
	By popupcancel= By.xpath("/html/body/div[2]/div/div[1]/div/button");
	By username= By.name("username");
	By passwod= By.name("password");
	By loginbutton= By.name("login");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void login() throws InterruptedException
	{
		
		driver.findElement(loginorregister).click();
		Thread.sleep(3000);
		//driver.findElement(username).clear();
		Thread.sleep(3000);
		driver.findElement(popupcancel).click();
		Thread.sleep(3000);
		driver.findElement(username).clear();
		Thread.sleep(3000);
		driver.findElement(username).sendKeys("hjanawadkar@gmail.com");
		Thread.sleep(3000);
		driver.findElement(passwod).clear();
		Thread.sleep(3000);
		driver.findElement(passwod).sendKeys("9342228988");
		Thread.sleep(3000);
		driver.findElement(loginbutton).click();
	}
	
	
}
