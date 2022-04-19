package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Emailpage extends pagebase {

	public Emailpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "FriendEmail")
	WebElement emailtofriendtext;
	
	@FindBy(id = "PersonalMessage")
	WebElement message;
	
	
	@FindBy(css = "button.button-1.send-email-a-friend-button")
	WebElement sendemailbutton;
	
  public void sendemail(String friendemail, String messagetofrind) throws InterruptedException {
	  
	  settext(emailtofriendtext, friendemail);
	  settext(message, messagetofrind);
	  Thread.sleep(5000);
	  clickbutton(sendemailbutton);
	  
	  
  }
  
}

