package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.beust.jcommander.IDefaultProvider;

public class Myaccountspage extends pagebase {

	public Myaccountspage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a")
	WebElement changepassword;
	
	@FindBy(id  = "OldPassword")
	WebElement Oldpassword;
	
	@FindBy(id = "NewPassword")
	WebElement Newpassword;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement Confirmpassword;
	
	@FindBy(css = "button.button-1.change-password-button")
	WebElement changepasswordbtn;


   public void openchangepassword() {
	   
	   clickbutton(changepassword);
   }
   
   public void changingpassword(String oldpassword, String newpassword) {
	   
	   settext(Oldpassword, oldpassword);
	   settext(Newpassword, newpassword);
	   settext(Confirmpassword, newpassword);
	   clickbutton(changepasswordbtn);
	   
   
   }
   }

