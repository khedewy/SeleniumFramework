package tests;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.Myaccountspage;
import pages.UserRegesteration;

public class Myaccountstest extends Testbase {
	
	Homepage homepage;
	UserRegesteration usrrigesteration;
	Loginpage loginpage;
	Myaccountspage myaccount;
	
	@Test(priority = 0,alwaysRun = true)
	public void testmyaccounts() {
		homepage = new Homepage(driver);
		homepage.openregestratiopage();
		
		usrrigesteration = new UserRegesteration(driver);
		usrrigesteration.userregetser("mahmoud","anter" , "mmm19111@gmail.com","11123456" );
		
		
	}
	@Test(priority = 1, dependsOnMethods = {"testmyaccounts"})
	public void useracanchangepasswrd() {
		myaccount = new Myaccountspage(driver);
		usrrigesteration.openmyaccount();
		myaccount.openchangepassword();
		myaccount.changingpassword("11123456", "1234567");
	}
	@Test(priority = 2, dependsOnMethods = {"useracanchangepasswrd"})
    public void usercanlogout() {
		
		usrrigesteration.logout();
		
		
	}
	@Test(priority = 3, dependsOnMethods = {"usercanlogout"})
	public void login() {
		loginpage = new Loginpage(driver);
		homepage.openloginpage();
		loginpage.userlogin("mmm19111@gmail.com", "1234567");
		
		
		
	}

}
