package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.UserRegesteration;

public class UserRigetsterationtest extends Testbase {
	
	Homepage homepageobject;
	UserRegesteration userrigesteration;
	Loginpage userlogin;
	
	
	@Test(priority = 0,alwaysRun = true)
	public void usercanrigester() {
		homepageobject = new Homepage(driver);
		homepageobject.openregestratiopage();
		userrigesteration = new UserRegesteration(driver);
		userrigesteration.userregetser("msahmfdoeu211", "skhefdwdy1121", "mffff1e133@gmail.com", "m12345678");
		Assert.assertTrue(userrigesteration.succsefulmessage.getText().contains("Your registration completed"));
	}
	@Test(dependsOnMethods = {"usercanrigester"})
	public void usercanlogout() {
		
		userrigesteration.logout();
		
		
	}
	@Test(dependsOnMethods = {"usercanlogout"})
	public void usercanlogin() {
		homepageobject.openloginpage();
		userlogin = new Loginpage(driver);
		userlogin.userlogin("mffff1e133@gmail.com","m12345678");
		
		
	}

}
