package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DetalisPage;
import pages.Emailpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Searchprouduct;
import pages.UserRegesteration;

public class EmailToFriendtest extends Testbase {
	
	// user need to rigester

	Homepage homepageobject;
	UserRegesteration userrigesteration;
	Loginpage userlogin;
	DetalisPage details;
	Searchprouduct searchobject;
	String prouductname = "Apple MacBook Pro 13-inch";
	Emailpage emailobjct;
	
	
	@Test(priority = 0,alwaysRun = true)
	public void usercanrigester() {
		homepageobject = new Homepage(driver);
		homepageobject.openregestratiopage();
		userrigesteration = new UserRegesteration(driver);
		userrigesteration.userregetser("msahmfdoeu211", "skhefdwdy1121", "mmmxe133@gmail.com", "m12345678");
		//Assert.assertTrue(userrigesteration.succsefulmessage.getText().contains("Your registration completed"));
	}
	// we need to search 
	@Test(priority = 1)
	public void usercansarchbyautocomplete() {
		searchobject = new Searchprouduct(driver);
		details = new DetalisPage(driver);
		searchobject.usersearchbyautomationcomplete("MacB");	
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().equalsIgnoreCase(prouductname));		
	}
	// we need to send email to friend
	@Test(priority = 2)
	public void rigesteredusersendingemail() throws InterruptedException {
		emailobjct = new Emailpage(driver);
		details = new DetalisPage(driver);
		details.opensendemail();
		emailobjct.sendemail("wwww@gmail.com", "hello this email from khedewy wish u happy day and check this prouduct for me");
	}
	@Test(dependsOnMethods = "rigesteredusersendingemail",priority = 3)
	public void usercanlogout() {	
		userrigesteration.logout();
	}
}
