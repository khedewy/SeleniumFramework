package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DetalisPage;
import pages.Searchprouduct;

public class SearchprouductTest extends Testbase {
	
	Searchprouduct searchobject;
	String prouductname = "Apple MacBook Pro 13-inch";
	DetalisPage details;
	
	
	
	
	@Test
	public void Usercansearch() {
		searchobject = new Searchprouduct(driver);
		searchobject.prouductsearch(prouductname);
		details = new DetalisPage(driver);
		searchobject.openproudcttitle();
		Assert.assertTrue(details.prouductnamebreadcrumb.getText().equalsIgnoreCase(prouductname));
		
		
		
	}
	

}


