package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegesteration extends pagebase {

	public UserRegesteration(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "gender-male")
	WebElement gender;
	
	@FindBy(id = "FirstName")
	WebElement Firstname;
	
	
	@FindBy(id = "LastName")
	WebElement Lastname;
	
	@FindBy(id = "Email")
	WebElement Email;
	
    @FindBy(id = "Password")
    WebElement passowrd;
    
    
    @FindBy(id = "ConfirmPassword")
    WebElement confirmpassword;
    
    
    @FindBy(id = "register-button")
    WebElement regesterbtn;
    
    @FindBy(css = "div.result")
    public WebElement succsefulmessage;
    
    @FindBy(css ="a.ico-logout")
    WebElement logoutbutton;
    
    @FindBy(linkText = "My account")
    WebElement myaccountsbtn;

  
    // instead of making it hard code we will provide the method with parameter so we can use it while we use the test cases
    
    public void userregetser(String firstname, String lastname, String email, String password) {
    
    	clickbutton(gender);
    	settext(Firstname, firstname);
    	
    	settext(Lastname, lastname);
    	
    	settext(Email, email);
    	
    	settext(passowrd, password);
    	
    	settext(confirmpassword, password);
    	
    	clickbutton(regesterbtn);
    	
    }
    public void logout() {
    	
    	clickbutton(logoutbutton);
    }
    public void openmyaccount() {
    	
    	clickbutton(myaccountsbtn);
    	
    }
    
 

}
