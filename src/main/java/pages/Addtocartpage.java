package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage extends pagebase {

	public Addtocartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(css = "button.remove-btn")
	WebElement removebutton;
	
	@FindBy(id = "updatecart")
	WebElement updateshopingcart;
	
	@FindBy(id = "itemquantity11217")
	WebElement quntitybox;
	
	@FindBy(css = "td.subtotal")
	WebElement totalprice;
	
	@FindBy(id ="termsofservice")
	WebElement confirmservices;
	
	@FindBy(id ="checkout")
	WebElement checkoutbutton;
	
	public void updateprouductquantity(String quantity) {
		// if ther is a value in quantity text we need to remove it first and then updating the value of it
		clearelement(quntitybox);
		settext(quntitybox, quantity);
		clickbutton(updateshopingcart);
	}
	public void removefromcart() {
		clickbutton(removebutton);
	}
	public void openingcheckingoutpage() {
		clickbutton(confirmservices);
		clickbutton(checkoutbutton);
	}
	
	

}
