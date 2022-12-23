package Baseclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	

	  public static WebDriver BrowserLaunch(String BrowserName) {
	 if (BrowserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavidiya\\eclipse-workspace\\Adactindtwo\\src\\test\\resource\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	  }else if (BrowserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "");
		driver = new EdgeDriver();
	  }else if (BrowserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.geko.driver", "");
	  }
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  return driver;
	  }
	    public static void getUrl(String url) {
	       try {
		         driver.get(url);
	     } catch (Exception e) {
	      System.err.println("Invalid URL:"+e.getMessage());
	     }
	}

	public static void elementclick() {

	}
	public static boolean elementIsdisplayed(WebElement element) {
	   boolean display = false;
	  try {
		 display=element.isDisplayed();
	} catch (Exception e) {
	System.err.println("element not visible:"+e.getMessage());
	     }
	    return display;
	}

	       public static void elementSendKeys(WebElement element , String value) {
	       try {
	    	   element.clear();
	    	   element.sendKeys(value);
		} catch (Exception e) {
	  System.err.println("Unable to enter the value:"+e.getMessage());
	  
		}
		}
	       public static void elementClick(WebElement element) {
	      try {
	    	   element.click();
		} catch (Exception e) {
	     System.err.println("Unable to click:"+e.getMessage());
		}
	         
		}
          
	       public static void dropdown ( WebElement element ,String option,String i) {
                      Select s = new Select(element);
                      try {
						if (option.equals("index")) {
							s.selectByIndex(Integer.parseInt(i));
							 
					} else if (option.equals("text")) {
                            s.selectByVisibleText(i);
					}else if (option.equals("value")) {
						s.selectByValue(i);
                      }
                      }catch (Exception e) {
                    	  e.printStackTrace();
                      }
}
	       
	       
	     //  File f =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   s
	      // Files.copy(f. new File(""));
	       

	 /*  	public static File takeScreenshot(String fileName) throws IOException {
	   		File f = new File(System.getProperty("user.dir") + "\\scr\\screenshot\\"
	   				+ fileName + ".png");
	   		TakesScreenshot ts = (TakesScreenshot) driver;
	   		File temp = ts.getScreenshotAs(OutputType.FILE);
	   		//FileUtils.copyFile(temp, f);
	   		return f;

	   	}*/
	       
	   	public static byte[] Report_Screenshot() {
			
byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
return screenshotAs;
		}
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
}
