package gmailLoginAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gmail.utilities.basePage;

public class logInPage extends basePage {
	private static WebDriver driver;
	public logInPage (WebDriver entermydriver){
	this.driver = entermydriver;
	}

	private String gmailLogin =".//*[@id='Email']";
	private String gmailLoginPass=".//*[@id='Passwd']";
	private String clickLogin ="";
	
	public void enterUserName( String enterUserName){
		clearTextField(getXpath(), gmailLogin);
		enterDataIntoTextField(getXpath(),gmailLogin,enterUserName);
	
	}

	public void enterPassword ( String enterPassWord){
		clearTextField(getXpath(),gmailLoginPass);
		enterDataIntoTextField(getXpath(),gmailLoginPass,enterPassWord);
	}

	public void clickOnLogin (){
		clickOnButton(getXpath(), clickLogin);
	
	}
	
}
	

