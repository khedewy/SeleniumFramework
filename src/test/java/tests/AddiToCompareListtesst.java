package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Comparepage;
import pages.DetalisPage;
import pages.Homepage;
import pages.Searchprouduct;

public class AddiToCompareListtesst extends Testbase {
	
	String firstprouductname = "Apple MacBook Pro 13-inch";
	String secondprouductname = "Asus N551JK-XO076H Laptop";
	
	DetalisPage details;
	Searchprouduct searchobject;
	Homepage homepageobj;
	Comparepage comparepageobj;
	
	
	@Test
	public void usercanaddtocpmaprelist() throws InterruptedException {
		details = new DetalisPage(driver);
		searchobject = new Searchprouduct(driver);
		homepageobj = new Homepage(driver);
		comparepageobj = new Comparepage(driver);
		
		searchobject.usersearchbyautomationcomplete("MacB");
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().contains(firstprouductname));
		details.Addprouducttocompare();
		
		searchobject.usersearchbyautomationcomplete("Asus");
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().contains(secondprouductname));
		details.Addprouducttocompare();
		Thread.sleep(5000);
		driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
		Assert.assertTrue(comparepageobj.Firstprouductname.isDisplayed());
		Assert.assertTrue(comparepageobj.secondprouductname.isDisplayed());
		comparepageobj.copmareprouducts();
	}
	@Test
	public void usercanclearlist() {
		comparepageobj.usercancleamlist();
	}
}
