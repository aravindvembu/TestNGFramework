package pages;

import org.openqa.selenium.By;

import base.Baseclass;

public class Menupage extends Baseclass {
	protected By applauncherIcon=By.xpath("//div[@class='slds-icon-waffle']");
	protected By viewAllLink = By.xpath("//button[text()='View All']");
	protected By salesLink = By.xpath("//span[@part='formatted-rich-text']/p[text()='Sales']");
	protected By logoutLink = By.xpath("//a[text()='Log Out']");
	protected By userImg=By.xpath("(//span[@class='uiImage']/parent::div[@data-aura-class='forceEntityIcon'])[1]");

	public Menupage clickUserImg()   {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(userImg).click();  
		return this;
	}
	
	public Loginpage clickLogout() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(logoutLink).click();
		return new Loginpage();
	}
}
