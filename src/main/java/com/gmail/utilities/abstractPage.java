package com.gmail.utilities;

import gmailLoginAccount.logInPage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class abstractPage {
	
	public static WebDriver driver = null;
			public static String googleSignIn = "https://accounts.google.com/ServiceLogin";
	
	@BeforeSuite
	
	public void gmailTest(){
		driver = new FirefoxDriver();
		driver.navigate().to(googleSignIn);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@AfterSuite ( alwaysRun = true)
	
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	 public static WebElement getElement ( String locator, String attributelocator)throws NoSuchElementException {
		
	 
		 if(locator.equalsIgnoreCase("id")){
			 return driver.findElement(By.id(attributelocator));
		 }else if (locator.equalsIgnoreCase("className")){
			 return driver.findElement(By.className(attributelocator));
			 
		 }else if(locator.equalsIgnoreCase("css")){
			 return driver.findElement(By.cssSelector(attributelocator));
		 }else if( locator.equalsIgnoreCase("Xpath")){
			 return driver.findElement(By.xpath(attributelocator));
			 
		 }else if (locator.equalsIgnoreCase("name")){
			 return driver.findElement(By.name(attributelocator));
		 }else
			 throw new NoSuchElementException("No Such Element:" + attributelocator);
	 
	 
	 }
	 
	 public logInPage gmailLogin() throws InterruptedException{
		 	logInPage gmailLogin = new logInPage(driver);
		 	return gmailLogin;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
}

