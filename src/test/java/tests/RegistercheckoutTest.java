package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Addtocartpage;
import pages.DetalisPage;
import pages.Homepage;
import pages.Registercheckoutpage;
import pages.Searchprouduct;
import pages.UserRegesteration;

public class RegistercheckoutTest extends Testbase {
	// user registration
	// user search
	// add to cart 
	// check out
	// log out
	Homepage homepageobject;
	UserRegesteration userrigesteration;
	Searchprouduct searchobject;
	String prouductname = "Apple MacBook Pro 13-inch";
	DetalisPage details;
	Registercheckoutpage checkoutobj;
	Addtocartpage addtocartobj;
	
	
	
	@Test(priority = 0,alwaysRun = true)
	public void usercanrigester() {
		homepageobject = new Homepage(driver);
		homepageobject.openregestratiopage();
		userrigesteration = new UserRegesteration(driver);
		userrigesteration.userregetser("msahmfdoeu211", "skhefdwdy1121", "mra1sc13a3@gmail.com", "m12345678");
		Assert.assertTrue(userrigesteration.succsefulmessage.getText().contains("Your registration completed"));
}
	@Test(priority = 1, dependsOnMethods ={"usercanrigester"})
	public void usercansarchbyautocomplete() {
		searchobject = new Searchprouduct(driver);
		details = new DetalisPage(driver);
		searchobject.usersearchbyautomationcomplete("MacB");
		
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().equalsIgnoreCase(prouductname));
		
		
	}
	@Test(priority = 2, dependsOnMethods = {"usercansarchbyautocomplete"})
	public void usercanAddtocart() throws InterruptedException {
		Thread.sleep(4000);
		details = new DetalisPage(driver);
		Thread.sleep(4000);
		details.Addin_to_cART();
		Thread.sleep(4000);
		driver.navigate().to("https://demo.nopcommerce.com/cart");
		Thread.sleep(4000);
		
		
		
	}
	@Test(priority = 3, dependsOnMethods = {"usercanAddtocart"})
	public void usercancheckoutprouduct() throws InterruptedException {
		checkoutobj = new Registercheckoutpage(driver);
		addtocartobj = new Addtocartpage(driver);
		addtocartobj.openingcheckingoutpage();
		Thread.sleep(4000);
		checkoutobj.RegisteredUserCheckoutProduct("Egypt", "test address", "1234567", "123456788756", "Cairo", prouductname);
		Thread.sleep(4000);
		//Assert.assertTrue(checkoutobj.prodcutName.isDisplayed());
		//Assert.assertTrue(checkoutobj.prodcutName.getText().contains(prouductname));
		Thread.sleep(4000);
		checkoutobj.confirmorder();
		Thread.sleep(4000);
		
		
		
	}
	
	@Test(priority = 4, dependsOnMethods = {"usercancheckoutprouduct"})
    public void usercanlogout() {
		
		userrigesteration.logout();
		
		
	}

		
		
		
		
	






}
