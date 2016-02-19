package com.gmail.utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.Reporter;

public class basePage extends abstractPage {

	public final static String Xpath = "Xpath";
	public final static String cssSelector  = "css";
	public final static String id = "id";
	public final static String name ="Name";
	
	public static Select dropdown = null;
		
		
		
	public static String getXpath(){
		return Xpath;
	}
	public static String getcssSelector(){
		return cssSelector;
	}
	
	public static String getId (){
		return id;
	}	
		
	public static String getName(){
		return name;
		
		
	}

	
	public void clickOnButton(String locator, String attributelocator){
		 try {
			
			WebElement ele = getElement(locator, attributelocator);
			ele.click();
		 }catch (NoSuchElementException e) {
				e.printStackTrace();
				Reporter.log("no such element found exception occourd on: " 
				+locator+ "" +attributelocator);
		 }
	
	}
	
	
	
	public void clearTextField( String locator, String attributelocator){
		WebElement ele = getElement(locator, attributelocator);
		ele.sendKeys();
		
	}
	
	
	public void enterDataIntoTextField(String Locator, String Attributelocator, String value){
		WebElement ele = getElement(Locator,Attributelocator );
			ele.sendKeys(value);
	
	
	}
	
	

	public void attachingFile(String locator, String attributeLocator, String fileName) {
		WebElement element = getElement(locator, attributeLocator);
		element.sendKeys(fileName);

	
	}
	
	

	
	
	
	
	}
		 	

	