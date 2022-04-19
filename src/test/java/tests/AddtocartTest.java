package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Addtocartpage;
import pages.DetalisPage;
import pages.Homepage;
import pages.Searchprouduct;

public class AddtocartTest extends Testbase {
	
	Searchprouduct searchobject;
	String prouductname = "Apple MacBook Pro 13-inch";
	DetalisPage details;
	Addtocartpage addtocart;
	
	@Test(priority = 0)
	public void usercansarchbyautocomplete() throws InterruptedException {
		searchobject = new Searchprouduct(driver);
		details = new DetalisPage(driver);
		searchobject.usersearchbyautomationcomplete("MacB");
		Thread.sleep(4000);
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().equalsIgnoreCase(prouductname));
	}
	@Test(priority = 1)
	public void usercanAddtocart() throws InterruptedException {
		Thread.sleep(4000);
		details = new DetalisPage(driver);
		Thread.sleep(4000);
		details.Addin_to_cART();
		Thread.sleep(4000);
		driver.navigate().to("https://demo.nopcommerce.com/cart");
		Thread.sleep(4000);
	}
	
	@Test(priority = 2)
	public void usercanupdateshopingcart() {
		addtocart = new Addtocartpage(driver);
		addtocart.updateprouductquantity("4");

	}
	@Test(priority = 3)
	public void usercanremovefromshopingcart() {
		addtocart = new Addtocartpage(driver);
		addtocart.removefromcart();
		
	}
	

}
