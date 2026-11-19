package testClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pageObject.LoginPageObject;
public class LoginTest extends BaseClass{
	
	@Test(priority=1)
	public void validLogin()
	{
		LoginPageObject obj=new LoginPageObject(driver);
		obj.enterUserName("student");
		obj.enterPassword("Password123");
		obj.clickSubmit();
		
		//Validation
		String actualURL=obj.geturl();
		String expected="https://practicetestautomation.com/logged-in-successfully/";
		Assert.assertEquals(actualURL, expected);
		
	}
	
	@Test(priority=2)
	public void invalidUserName()
	{
		LoginPageObject obj=new LoginPageObject(driver);
		obj.enterUserName("sdent");
		obj.enterPassword("Password123");
		obj.clickSubmit();
		
		//Validation
		String actual=obj.errorMessage();
		String expected="Your username is invalid!";
		Assert.assertEquals(actual, expected);
	}
}
