package RegressionTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import gmailLoginAccount.logInPage;

import org.testng.annotations.Test;

import com.gmail.utilities.abstractPage;

public class TC_001_gmailLogin extends abstractPage{

	
	
	@Test (description = " login page ")
	public void logintogmail () throws InterruptedException{
	gmailLogin().enterUserName("rahatr@gmail.com");
	gmailLogin().enterUserName("xamaka");
	gmailLogin().clickOnLogin();
		
	}

}