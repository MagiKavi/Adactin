package Hooks;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Baseclass {

	@Before
	public  void BeforeHooks() {
System.out.println("Am before Hooks");
	}
   
	@After
	public void AfterHooks(Scenario scenario) {
             byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
   scenario.attach(screenshot, "image/png", "screenshot");
		
		
	}
	   
  /*	public static byte[] Report_Screenshot() {
		for baseclass code 
byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
return screenshotAs;
	}*/
	
	
}
