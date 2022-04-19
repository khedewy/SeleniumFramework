package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchprouduct extends pagebase {

	public Searchprouduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "small-searchterms")
	WebElement serachtext;
	
	@FindBy(css = "button.button-1.search-box-button")
	WebElement searchbutton;
	
	@FindBy(id = "ui-id-1")
	List<WebElement> prouductList;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	WebElement prouductTitle;
	
	
	
	public void prouductsearch(String prouductname) {
		
		settext(serachtext,prouductname);
		clickbutton(searchbutton);
	}
	
	public void openproudcttitle() {
		
		clickbutton(prouductTitle);
	}
	
	public void usersearchbyautomationcomplete(String prouductnameauto) {
		settext(serachtext, prouductnameauto);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prouductList.get(0).click();
		
		
		
		
	}

}
