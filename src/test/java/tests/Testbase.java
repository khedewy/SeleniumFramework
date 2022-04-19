package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import helpers.Helper;

public class Testbase {
	
	public static WebDriver driver;
	
	public static String downloadpath = System.getProperty("user.dir")+"/.Downloads";
	
	public static FirefoxOptions firefoxoption(){
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.download.dir", downloadpath);
		return options;
				
		
		
		
		
	}
	
	@BeforeTest
	public void startdriver() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		driver = new FirefoxDriver(firefoxoption());
		driver.navigate().to("https://demo.nopcommerce.com/");
		
	}
	@AfterTest
	public void closedriver() {
		
		driver.quit();
		
	}
	@AfterMethod
	public void takescreenshot(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			
			System.out.println("faild!");
			System.out.println("takescreenshot.....");
			Helper.capturscreenshoots(driver, result.getName());
			
		}
		
	
		
		
		
		
	}

}
