package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends pagebase {

	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "Email")
	WebElement emailtxtbox;
	
	@FindBy(id = "Password")
	WebElement passwordtxtbox;
	
	@FindBy(css = "button.button-1.login-button")
	WebElement userloginbutton;
	

   public void userlogin(String email, String password) {
	   settext(emailtxtbox, email);
	   settext(passwordtxtbox, password);
	   clickbutton(userloginbutton);
	   
	   
	   
   }
}
     
