package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DetalisPage;
import pages.Homepage;
import pages.Searchprouduct;

public class Changecurrencytest extends Testbase {
	
	Searchprouduct searchobject;
	String prouductname = "Apple MacBook Pro 13-inch";
	Homepage homepageobject;
	DetalisPage details;
	
	@Test(priority = 0)
	public void usercanchangecurrency() {
		homepageobject = new Homepage(driver);
		homepageobject.changecurrency();
		
	}
	@Test(priority = 1)
	public void usercansarchbyautocomplete() {
		searchobject = new Searchprouduct(driver);
		details = new DetalisPage(driver);
		searchobject.usersearchbyautomationcomplete("MacB");
		
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().equalsIgnoreCase(prouductname));
		Assert.assertTrue(details.pricevalue.getText().contains("€"));

		
		
	}
	}


