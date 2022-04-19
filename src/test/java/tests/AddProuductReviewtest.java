package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DetalisPage;
import pages.Homepage;
import pages.Rviewproudctpage;
import pages.Searchprouduct;
import pages.UserRegesteration;

public class AddProuductReviewtest extends Testbase  {
	
	Homepage homepageobject;
	UserRegesteration userrigesteration;
	Rviewproudctpage reviewprouductobj;
	Searchprouduct searchobject;
	String prouductname = "Apple MacBook Pro 13-inch";
	DetalisPage details;
	
	
	// we need to register
	@Test(priority = 0)
	public void usercanrigester() {
		homepageobject = new Homepage(driver);
		homepageobject.openregestratiopage();
		userrigesteration = new UserRegesteration(driver);
		userrigesteration.userregetser("msahmfdoeu211", "skhefdwdy1121", "mmms27@gmail.com", "m12345678");
		Assert.assertTrue(userrigesteration.succsefulmessage.getText().contains("Your registration completed"));
	}
	
	@Test(dependsOnMethods ={"usercanrigester"})
	public void usercansarchbyautocomplete() {
		searchobject = new Searchprouduct(driver);
		details = new DetalisPage(driver);
		searchobject.usersearchbyautomationcomplete("MacB");
		
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().equalsIgnoreCase(prouductname));
	}
	@Test(dependsOnMethods = {"usercansarchbyautocomplete"})
	public void openreview() {
		details = new DetalisPage(driver);
		details.Adding_reiviewtoprouduct();
		reviewprouductobj = new Rviewproudctpage(driver);
		reviewprouductobj.addreviewtoprouduct("mac review", "this a very good device but its price is very high.");
	}
	@Test(dependsOnMethods = "openreview")
     public void usercanlogout() {
		userrigesteration.logout();
	}
}
