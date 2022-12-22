package HeatclinicPagesTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Util.XLSReader;

public class HomePageTest extends TestBase {
	

	HeatclinicPages.HomePage homepage;

	@BeforeMethod

	public void setup() throws Exception {
		initialization();
		homepage = new HeatclinicPages.HomePage();
		
	}


	@Test(priority = 1)
	public void Test1() {
		homepage.ClickOnHome();

	}

	@Test(priority = 2)
	public void Test2() {

		homepage.ClickOnHotSauce();

	}
	@Test(priority = 3)
	public void Test3() {

		homepage.ClickOnBonnetHotSauce();

	}
	@Test(priority = 4)
	public void Test4() {

		homepage.ClickOnArmageddonTheHotSauce();

	}
	@Test(priority = 5)
	public void Test5() {

		homepage.ClickOnBlackeningSauce();

	}
	
	

	

//	@Test(priority = 3)
//	public void Test3() throws InterruptedException {
//
//		homepage.ClickOnMens();
//
//	}
//
//	@Test(priority = 4)
//	public void Test4() throws InterruptedException {
//		homepage.ClickOnWomens();
//
//	}
//
//	@Test(priority = 5)
//	public void Test5() {
//
//		homepage.ClickOnClearance();
//
//	}
//
//	@Test(priority = 6)
//	public void Test6() {
//
//		homepage.ClickOnNewToHotSauce();
//
//	}
//
//
//	@Test(priority = 7)
//	public void Test7() {
//		homepage.ClickOnLogin();
//	Assert.assertEquals("Login to Your Account", homepage.VeryfyLoginPage());
//
//
//	}

	@AfterMethod

	public void teardown() {
		driver.quit();

	}

}
