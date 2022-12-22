package HeatclinicPagesTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import HeatclinicPages.LoginPage;
import Util.TestUtil;
import Util.XLSReader;

public class LoginPageTest extends TestBase {
	
	TestUtil util = new TestUtil();

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod

	public void loginsetup() throws Exception {
		initialization();
		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void ClickOnLogInTest() {
		loginPage.ClickOnLogin();

	}

	@Test(priority = 2)
	public void ClickOnLoginTest() {
		loginPage.ClickOnLogin();
		loginPage.VeryfyLoginPage();
		Assert.assertEquals("Login to Your Account", loginPage.VeryfyLoginPage());

	}

	@Test(priority = 3)
	public void EnterLoginInforTest() {

		XLSReader reader = new XLSReader("D:\\Selenium\\Eclipse Workplace\\Heatclinic\\ExcelFile\\LoginInfo.xlsx");
		int rowCount = reader.getRowCount("logininformations");
		loginPage.enterLoginInfor();

		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String email = reader.getCellData("logininformations", "Email", rowNum);
			System.out.println(email);

			String pass = reader.getCellData("logininformations", "Password", rowNum);
			System.out.println(pass);
			driver.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
			driver.findElement(By.xpath("//*[@type='password']")).sendKeys(pass);
			HighlightElement("//*[@value='Login']");
			driver.findElement(By.xpath("//*[@value='Login']")).click();
			
					

		}

	}

	@AfterMethod

	public void teardown() {
		driver.quit();

	}

}
