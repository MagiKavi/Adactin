package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Homepage extends Baseclass{
         public Homepage(WebDriver driver) {
         this.driver = driver;
         PageFactory.initElements(driver, this);
         }
                 
         
         @FindBy(id="username_show")
          public WebElement Profile_name;
         
         @FindBy (id="location")
         public WebElement s_location;
         
         @FindBy(id="hotels")
         public WebElement s_hotels;
         
         @FindBy(id="room_type")
         public WebElement s_roomtype;
         
         @FindBy(id="room_nos")
         public WebElement no_of_rooms;
         
         @FindBy(id="datepick_in")
         public WebElement date_select;
         
         @FindBy(id="datepick_out")
         public WebElement date_out;
         
         @FindBy(id="Submit")
         public WebElement Enter_submit;
         
         
         
      }
