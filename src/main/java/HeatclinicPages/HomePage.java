package HeatclinicPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {
	Actions action = new Actions(driver);

	@FindBy(xpath = "//*[text()='Home']")
	WebElement home;
	@FindBy(xpath = "//*[@alt=\"Hoppin' Hot Sauce\"]")
	WebElement hotsauce;
	@FindBy(xpath = "//*[@alt='Day of the Dead Scotch Bonnet Hot Sauce']")
	WebElement BonnetHotSauce;
	@FindBy(xpath = "//*[@alt='Armageddon The Hot Sauce To End All']")
	WebElement ArmageddonTheHotSauce;
	@FindBy(xpath = "//*[@alt='Cafe Louisiane Sweet Cajun Blackening Sauce']")
	WebElement BlackeningSauce;
	
	

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public void ClickOnHome() {
				home.click();

	}
	public void ClickOnHotSauce() {
				hotsauce.click();

	}
	public void ClickOnBonnetHotSauce() {
		BonnetHotSauce.click();

}
	public void ClickOnArmageddonTheHotSauce() {
		ArmageddonTheHotSauce.click();

}
	public void ClickOnBlackeningSauce() {
		BlackeningSauce.click();

}

//	public void MouseHoverOverOnMerchandise() throws InterruptedException {
//		// TODO Auto-generated method stub
//		action.moveToElement(merchandise);
//		Thread.sleep(2000);
//	}
//
//	public void ClickOnMens() throws InterruptedException {
//		// TODO Auto-generated method stub
//		action.moveToElement(merchandise);
//		Thread.sleep(2000);
//		action.moveToElement(mens).click();
//	}
//
//	public void ClickOnWomens() throws InterruptedException {
//		// TODO Auto-generated method stub
//		action.moveToElement(merchandise);
//		Thread.sleep(2000);
//		action.moveToElement(womens).click();
//	}
//
//	public void ClickOnClearance() {
//		// TODO Auto-generated method stub
//		clearance.click();
//	}
//
//	public void ClickOnNewToHotSauce() {
//		// TODO Auto-generated method stub
//		newtohotsauce.click();
//	}




	

}
