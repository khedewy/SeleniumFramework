package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registercheckoutpage extends pagebase {

	public Registercheckoutpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(css = "input.button-1.checkout-as-guest-button")
	private WebElement guestBtn;

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement fnTxt;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lnTxt;

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailTxt;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryList;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneTxt;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTxt;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement addressTxt;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postCodeTxt;

	@FindBy(xpath = "//*[@id=\'billing-buttons-container\']/button")
	private WebElement continueBtn;

	@FindBy(id = "shippingoption_1")
	private WebElement shippingMethodRdo;

	@FindBy(xpath = "//*[@id=\'shipping-method-buttons-container\']/button")
	private WebElement continueShippingBtn;

	@FindBy(xpath = "//*[@id=\'payment-method-buttons-container\']/button")
	private WebElement continuePaymentBtn;

	@FindBy(xpath = "//*[@id=\'payment-info-buttons-container\']/button")
	private WebElement continueInfoBtn;

	@FindBy(css = "a.product-name")
	public WebElement prodcutName;

	@FindBy(css = "button.button-1.confirm-order-next-step-button")
	private WebElement confirmBtn;

	@FindBy(css = "h1")
	public WebElement ThankYoulbl;

	@FindBy(css = "div.title")
	private WebElement successMessage;

	@FindBy(linkText = "Click here for order details.")
	private WebElement orderDetailsLink;


	public void RegisteredUserCheckoutProduct(String countryName, String address, 
			String postcode, String phone, String city, String productName) throws InterruptedException {
		select = new Select(countryList);
		select.selectByVisibleText(countryName);
		settext(cityTxt, city);
		settext(addressTxt, address);
		settext(postCodeTxt, postcode);
		settext(phoneTxt, phone);
		Thread.sleep(4000);
		clickbutton(continueBtn);
		clickbutton(shippingMethodRdo);
		clickbutton(continueShippingBtn);
		Thread.sleep(4000);
		clickbutton(continuePaymentBtn);
		Thread.sleep(4000);
		clickbutton(continueInfoBtn);


}
	public void confirmorder() {
		clickbutton(confirmBtn);
	}
	

}
