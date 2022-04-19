package tests;

import org.testng.annotations.Test;

import pages.Homepage;

public class HovermenueTest extends Testbase {
	
	Homepage homepageobj;
	@Test
	public void usercanchoosefrommenue() {
		homepageobj = new Homepage(driver);
		homepageobj.selectNoteBookMenue();
	}

}
