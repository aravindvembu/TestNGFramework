package pages;

import org.openqa.selenium.By;

import base.Baseclass;

public class Loginpage extends Menupage {
	private By usernameTxt=By.id("username");
	private By passwordTxt=By.id("password");
	private By loginBtn=By.id("Login");
	private By remembermeChBox=By.xpath("//label[text()='Remember me']");
	private By forgotLink=By.id("forgot_password_link");
	private By loginFailureMsg = By.cssSelector("#error");
	
	public boolean verifyLoginElement() {
		if(driver.findElement(usernameTxt).isDisplayed() && 
				driver.findElement(passwordTxt).isDisplayed() && 
				driver.findElement(loginBtn).isDisplayed() && 
				driver.findElement(remembermeChBox).isDisplayed() && 
				driver.findElement(forgotLink).isDisplayed() ) {
			return true;
		}else {
			return false;
		}
	}
	
	public Loginpage enterUserName(String userName) {
		driver.findElement(usernameTxt).sendKeys(userName);
		return this;
	}
	
	public Loginpage enterPassword(String password) {
		driver.findElement(passwordTxt).sendKeys(password);
		return this;
	}
	
	public Homepage clickOnLogin() {
		driver.findElement(loginBtn).click();
		return new Homepage();
	}
	
	public Loginpage clickOnLoginInValidCredential() {
		driver.findElement(loginBtn).click();
		return this;
	}
	
	public boolean validateErrorMsg() {
		if(driver.findElement(loginFailureMsg).isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
}
