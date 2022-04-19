package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rviewproudctpage extends pagebase{

	public Rviewproudctpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "AddProductReview_Title")
	WebElement reviewtitletxt;
	
	@FindBy(id = "AddProductReview_ReviewText")
	WebElement reviewmessagetxt;
	
	
	@FindBy(css = "button.button-1.write-product-review-button")
	WebElement submitreviewbtn;
	
	
	public void addreviewtoprouduct(String title, String message) {
		
		settext(reviewtitletxt, title);
		settext(reviewmessagetxt, message);
		clickbutton(submitreviewbtn);
		
		
	}

}


