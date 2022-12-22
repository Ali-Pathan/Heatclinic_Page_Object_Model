package HeatclinicPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class RegisterPage extends TestBase {

	@FindBy(xpath = "//*[text()='Register']")
	WebElement register;
	@FindBy(xpath = "//*[@id='details-button']")
	WebElement advanced;
	@FindBy(xpath = "//*[@id='proceed-link']")
	WebElement unsafe;

	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void RegistrationInfor() {
		register.click();
		advanced.click();
		unsafe.click();

	}

}
