package Testcases;

import org.testng.annotations.Test;

import Hooks.Baseclass;
import Pages.LoginPage;

public class CreateLead extends Baseclass {

	@Test
	public void runCreateLead() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrmSfa()
		.verifyHomePage()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName().enterPhonenumber()
		.clickCreateLead()
		.verifyMyleads();
		
		

	}
}
