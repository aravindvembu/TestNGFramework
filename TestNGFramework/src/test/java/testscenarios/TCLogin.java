package testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.Loginpage;

public class TCLogin extends Baseclass {
	
	@Test(priority = 1)
	public void loginFieldVaidation() {
		boolean result = new Loginpage()
		.verifyLoginElement();
		Assert.assertTrue(result);
	}
	
	@Test(priority = 2)
	public void loginWithValidCredential() {
		boolean result = new Loginpage()
		.enterUserName("aravind5vembu@credo.com")
		.enterPassword("Aravindvembu@5")
		.clickOnLogin()
		.verifyHomeElement()
		.clickUserImg()
		.clickLogout()
		.verifyLoginElement();
		Assert.assertTrue(result);
	}
	
	@Test(priority = 3)
	public void loginWithInValidCredential() {
		boolean result = new Loginpage()
		.enterUserName("mathan@credosystemz.sanbox")
		.enterPassword("1111111111111")
		.clickOnLoginInValidCredential()
		.validateErrorMsg();
		Assert.assertTrue(result);
	}

}
