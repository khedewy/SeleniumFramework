package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pagebase {
	// crate our driver 
	protected WebDriver driver;
	public JavascriptExecutor jse;
	Select select;
	public Actions actions;
	
	//make a constructor
	public pagebase(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public static void clickbutton(WebElement button) {
		button.click();
		
		
	}
	
	public static void settext(WebElement setText, String value) {
		
		setText.sendKeys(value);
		
	}
	
	public void scrolldown() {
		
		
		jse.executeScript("scrollBy(0,2500)");
		
	}
	public void clearelement(WebElement elemnet) {
		elemnet.clear();
	}
	
	

}
