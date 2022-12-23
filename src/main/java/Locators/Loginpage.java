package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Loginpage extends Baseclass {
	 public Loginpage(WebDriver driver)      {
	     this.driver = driver;
	     PageFactory.initElements(driver, this);
	  }
	 @FindBy (className="logo")
	  public WebElement Adactin_Logo;
	  
	  @FindBy(id="username")
	  public WebElement Username;
	  
	  @FindBy(id="password")
	  public WebElement Password;
	  
	  @FindBy(id="login")
	  public WebElement Login_button;
}
