package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class Homepage extends pagebase {

	public Homepage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		actions = new Actions(driver);
	}
	
	// this annotation is instead of find element by it is an advanced way 
	@FindBy(linkText = "Register")
	WebElement regestration;
	
	@FindBy(linkText ="Log in")
    WebElement loginbtn;
	
	@FindBy(linkText="Contact us")
	WebElement contactusbtn;
	
	@FindBy(id = "customerCurrency")
	WebElement currencyofthecustomer;
	
	
	@FindBy(linkText = "Computers ")
	WebElement Computermenue;
	
	@FindBy(linkText = "Notebooks")
	WebElement notbokelink;
	

	// then to make a method to do some functions to the element
	public void openregestratiopage() {
		
		clickbutton(regestration);
	}
	
	public void openloginpage() {
		
		clickbutton(loginbtn);
		
	}
	public void opencontactusn() {
		
		scrolldown();
		clickbutton(contactusbtn);
	}
	
	public void changecurrency()
	{
		select = new Select(currencyofthecustomer);
		select.selectByIndex(1);
		
	}
	public void selectNoteBookMenue() {
		actions.moveToElement(Computermenue).moveToElement(notbokelink).click().build().perform();
		
	}
}
