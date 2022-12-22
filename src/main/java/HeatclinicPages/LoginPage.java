package HeatclinicPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//*[text()='Login']")
	WebElement login;
	@FindBy(xpath = "//*[@id='details-button']")
	WebElement advanced;
	@FindBy(xpath = "//*[@id='proceed-link']")
	WebElement unsafe;

	@FindBy(xpath = "//*[text()='Login to Your Account']")
	WebElement veryfyloginpage;

	@FindBy(xpath = "//*[@type='email']")
	WebElement email;

	@FindBy(xpath = "//*[@type='password']")
	WebElement password;
	@FindBy(xpath = "//*[@value='Login']")
	WebElement Login;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void ClickOnLogin() {
		// TODO Auto-generated method stub
		login.click();
		advanced.click();
		unsafe.click();
	}

	public String VeryfyLoginPage() {

		return veryfyloginpage.getText();

	}

	public void enterLoginInfor() {
		login.click();
		advanced.click();
		unsafe.click();

	}

}
