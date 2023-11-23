package com.Clickbuzz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BoarderedGridPage {
WebDriver driver;


	By shop=By.xpath("//*[@id=\"menu-item-7038\"]/a/span");
	
	
	By loginorregister= By.xpath("/html/body/div[1]/header/div/div[2]/div/div/div[3]/div[2]/a/span[2]");
	By borderedgrid= By.xpath("//*[@id=\"menu-item-7038\"]/div/div/section/div/div[1]/div/div/ul/li/ul/li[5]/a");
	By popupcancel= By.xpath("/html/body/div[2]/div/div[1]/div/button");
	By monkeyst= By.xpath("//a[normalize-space()='Augue adipiscing euismod']");
	By addplus=By.xpath("//input[@value='+']");
	By addcart=By.xpath("//button[@value='53']");
	By viewcart=By.xpath("/html/body/div[4]/div[2]/div/div[2]/p[2]/a[1]");
	By proceedtoche=By.xpath("//a[@class='checkout-button button alt wc-forward wp-element-button']");
	By fname=By.xpath("//input[@id='billing_first_name']");
	By lname=By.xpath("//input[@id='billing_last_name']");
	By country=By.xpath("//*[@id=\"billing_country_field\"]/span/span/span[1]/span");
	By countryselect=By.xpath("//input[@id='billing_address_2']");
	By countryenter=By.xpath("//input[@class='select2-search__field']");
	By billingaddress=By.xpath("//input[@name='billing_address_1']");
	By Billcity=By.xpath("//input[@name='billing_city']");
	By statesel=By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span");
	By statesend=By.xpath("//input[@class='select2-search__field']");
	By billzip=By.xpath("//input[@name='billing_postcode']");
	By phone=By.xpath("//input[@name='billing_phone']");
	By placeord=By.xpath("//button[@id='place_order']");
	
	public BoarderedGridPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void borderedg() throws InterruptedException
	{
		
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(shop);
		action.moveToElement(we).build().perform();
		Thread.sleep(3000);
		
		
		
		driver.findElement(borderedgrid).click();
		Thread.sleep(3000);
		driver.findElement(popupcancel).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("scroll(10,500)"); //Scrolling 
		driver.findElement(monkeyst).click();
		Thread.sleep(3000);
		driver.findElement(popupcancel).click();
		Thread.sleep(3000);
		driver.findElement(addplus).click();
		Thread.sleep(3000);
		driver.findElement(addcart).click();
		Thread.sleep(3000);
		driver.findElement(viewcart).click();
		Thread.sleep(3000);
		driver.findElement(popupcancel).click();
		Thread.sleep(3000);
		driver.findElement(proceedtoche).click();
		Thread.sleep(3000);
		driver.findElement(popupcancel).click();
		Thread.sleep(3000);
		driver.findElement(fname).clear();
		driver.findElement(fname).sendKeys("Harsha");
		Thread.sleep(2000);
		driver.findElement(lname).clear();
		driver.findElement(lname).sendKeys("Janawadkar");
		Thread.sleep(2000);
		js.executeScript("scroll(10,500)");
		Thread.sleep(2000);
		driver.findElement(country).click();
		Thread.sleep(2000);
		driver.findElement(countryenter).clear();
		driver.findElement(countryenter).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(countryenter).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(billingaddress).clear();
		driver.findElement(billingaddress).sendKeys("Line Bazar court road");
		Thread.sleep(2000);
		driver.findElement(Billcity).clear();
		driver.findElement(Billcity).sendKeys("Dharwad");
		Thread.sleep(2000);
		driver.findElement(statesel).click();
		Thread.sleep(2000);
		driver.findElement(statesend).clear();
		driver.findElement(statesend).sendKeys("karnataka");
		Thread.sleep(2000);
		driver.findElement(statesend).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		js.executeScript("scroll(10,300)");
		driver.findElement(billzip).clear();
		driver.findElement(billzip).sendKeys("580001");
		Thread.sleep(2000);
		driver.findElement(phone).clear();
		driver.findElement(phone).sendKeys("9342228889");
		Thread.sleep(2000);
		js.executeScript("scroll(10,-600)"); 
		driver.findElement(placeord).click();
		Thread.sleep(3000);
		
		
}
}