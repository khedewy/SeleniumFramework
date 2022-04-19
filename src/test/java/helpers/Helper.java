package helpers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	
	public static void capturscreenshoots(WebDriver driver, String screenshotname) {
		
		// to create the destination 
		Path destination = Paths.get("./screenshots/"+screenshotname+".png");
		try {
			Files.createDirectories(destination.getParent());
			FileOutputStream output = new FileOutputStream(destination.toString());
			output.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
