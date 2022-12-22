package HeatclinicPagesTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import HeatclinicPages.LoginPage;
import HeatclinicPages.RegisterPage;
import Util.XLSReader;

public class RegisterPageTest extends TestBase {
	RegisterPage registerPage;

	public RegisterPageTest() {
		super();
	}

	@BeforeMethod

	public void RegisterPageTestsetup() throws Exception {
		initialization();
		registerPage = new RegisterPage();

	}

	@Test(priority = 1)
	public void ClicOnRegisterTest() {
		registerPage.RegistrationInfor();

	}

	@Test(priority = 3)
	public void EnterLoginInforTest() {

		XLSReader reader = new XLSReader("D:\\Selenium\\Eclipse Workplace\\Heatclinic\\ExcelFile\\LoginInfo.xlsx");
		int rowCount = reader.getRowCount("RegistrationInfo");
		registerPage.RegistrationInfor();

		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			
			String Email = reader.getCellData("RegistrationInfo", "Email", rowNum);
			driver.findElement(By.xpath("//*[@type='email']")).clear();
			driver.findElement(By.xpath("//*[@type='email']")).sendKeys(Email);
		

			String FirstName = reader.getCellData("RegistrationInfo", "FirstName", rowNum);
			driver.findElement(By.xpath("//*[@id='customer.firstName']")).clear();
			driver.findElement(By.xpath("//*[@id='customer.firstName']")).sendKeys(FirstName);
	
			String LastName = reader.getCellData("RegistrationInfo", "LastName", rowNum);
			driver.findElement(By.xpath("//*[@id='customer.lastName']")).clear();
			driver.findElement(By.xpath("//*[@id='customer.lastName']")).sendKeys(LastName);
		
			String Password = reader.getCellData("RegistrationInfo", "Password", rowNum);
			driver.findElement(By.xpath("//*[@id='password']")).clear();
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Password);
		
			String ConfirmPassword = reader.getCellData("RegistrationInfo", "ConfirmPassword", rowNum);
			driver.findElement(By.xpath("//*[@id='passwordConfirm']")).clear();
			driver.findElement(By.xpath("//*[@id='passwordConfirm']")).sendKeys(ConfirmPassword);
		
			driver.findElement(By.xpath("//*[@value='Register']")).click();

		}

	}

	@AfterMethod

	public void teardown() {
		driver.quit();

	}

}
