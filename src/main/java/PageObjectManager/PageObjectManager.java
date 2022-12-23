package PageObjectManager;

import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass;
import Locators.Homepage;
import Locators.Loginpage;
import Locators.Loginpage;

public class PageObjectManager extends Baseclass {
public PageObjectManager(WebDriver driver) { //constructor
   this.driver=driver;	
	}

            private Loginpage Loginpage;

           public Loginpage getLoginpage() {
        	   if (Loginpage == null) {
   				Loginpage = new Loginpage(driver);
   			}
	           return Loginpage;
}
           private Homepage homepage;

		public Homepage getHomepage() {
			if (homepage == null) {
				homepage = new Homepage(driver);
				
			}
		  	  return homepage;
	
		}
           
           
           
           
}
           
         

