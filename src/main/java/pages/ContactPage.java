package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends pagebase {

	public ContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id ="FullName")
	WebElement fullname;
	
	@FindBy(id = "Email")
	WebElement emailuser;
	
	
	@FindBy(id = "Enquiry")
	WebElement textmessagebox;
	
	@FindBy(css = "button.button-1.contact-us-button")
	WebElement submitbtn;


   public void usercancontactus(String name, String emai, String message) {
	   
	   settext(fullname, name);
	   settext(emailuser, emai);
	   settext(textmessagebox, message);
	   clickbutton(submitbtn);
	   
	   
	   
	   
   }}
