package tests;

import org.testng.annotations.Test;

import pages.ContactPage;
import pages.Homepage;

public class ContactUStest extends Testbase {
	Homepage homepage;
	ContactPage contact;


  @Test
  public void contactus() {
	  
	homepage = new Homepage(driver);
	homepage.opencontactusn();
	
	
  }
  @Test(dependsOnMethods = "contactus" )
  public void complete() throws InterruptedException {
	  Thread.sleep(5000);
	  contact = new ContactPage(driver);
	  contact.usercancontactus("mahmoud", "mahmoud11@gmail.com", "this case for test");
	  
	  
  }
  



}
