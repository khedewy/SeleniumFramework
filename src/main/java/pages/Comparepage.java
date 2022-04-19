package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Comparepage extends pagebase {

	public Comparepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(css =  "a.clear-list")
	WebElement clearlistbutton;
	
	@FindBy(css = "div.no-data")
	WebElement nodatalbl;
	
	@FindBy(css = "table.compare-products-table")
	WebElement comparetable;
	
	@FindBy(tagName =  "tr")
	List<WebElement> allrows;
	
	@FindBy(tagName = "td")
	List<WebElement> allcoulmns;
	
	@FindBy(linkText = "Asus N551JK-XO076H Laptop")
	public WebElement Firstprouductname;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	public WebElement secondprouductname;
	
	public void usercancleamlist() {
		clickbutton(clearlistbutton);
	}
	public void copmareprouducts() {
		for(WebElement row : allrows) {
			System.out.println(row.getText());
			for(WebElement column : allcoulmns) {
				System.out.println(column.getText());
			}

			
		}
		
		
	}

}
