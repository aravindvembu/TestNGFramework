package pages;

import base.Baseclass;

public class Homepage extends Menupage {
	public Homepage verifyHomeElement() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElement(applauncherIcon).isDisplayed() && 
				driver.findElement(userImg).isDisplayed())
		{
				System.out.println("User landed to the home page");
			return this;
		}else {
			System.out.println("User not landed to the home page");
			return this;
		}
	}
	
	
}
