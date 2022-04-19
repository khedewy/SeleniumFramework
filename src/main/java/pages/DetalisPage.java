package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetalisPage extends pagebase {

	public DetalisPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "div.product-name")
	public WebElement prouductnamebreadcrumb;
	
	@FindBy(className  ="button-2.email-a-friend-button")
	WebElement sendemailbtn;
	
	@FindBy(css = "span.price-value-4")
	public WebElement pricevalue; 
	
	@FindBy(linkText ="Add your review")
	WebElement Addreviewingbutton;
	
	@FindBy(id ="add-to-wishlist-button-4")
	WebElement addotowhishbutton;
	
	@FindBy(css = "button.button-2.add-to-compare-list-button")
	WebElement addTocomparebtn;
	
	@FindBy(id = "add-to-cart-button-4")
	WebElement Addtocartbutton;
	
	
	
	public void UserCanADDToWishList() {
		
		clickbutton(addotowhishbutton);
		
	}

  public void opensendemail() {
	  
	  clickbutton(sendemailbtn);
  }
  
  public void Adding_reiviewtoprouduct() {
	  
	  clickbutton(Addreviewingbutton);
	  
  }
  public void Addprouducttocompare() {
	  
	  clickbutton(addTocomparebtn);
  }
  
  public void Addin_to_cART() {
	  clickbutton(Addtocartbutton);
  }
 
  
 
}

