package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
public class LoginTest extends BaseTest {
	@Test
	
	public void validLogin() {
		LoginPage login = new LoginPage(driver);
		
		login.login("standard_user","secret_sauce");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	}
	
@Test
	
	public void invalidLogin() {
		LoginPage login = new LoginPage(driver);
		
		login.login("wrong","wrong");
		Assert.assertTrue(driver.getErrorMessage().contains("Epic sadface"));
	}

}
