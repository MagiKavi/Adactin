package Stepdefinition;

import javax.swing.JList.DropLocation;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import Baseclass.Baseclass;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends Baseclass {

	PageObjectManager obj = new PageObjectManager(driver);
	@Given("User launch the {string} Browser")
	public void user_launch_the_browser(String string) {
	   BrowserLaunch(string);
	}
	@Given("User Navigate the Url {string}")
	public void user_navigate_the_url(String string) {
	  getUrl(string);
	}
	@Then("User verify Login Page")
	public void user_verify_login_page() {
		 System.out.println();
		    Assert.assertTrue(elementIsdisplayed(obj.getLoginpage().Adactin_Logo));
	}
	@Then("User enter valid UserName {string}")
	public void user_enter_valid_user_name(String string) {
	   elementSendKeys(obj.getLoginpage().Username, string);
	}
	@Then("User enter valid Password {string}")
	public void user_enter_valid_password(String string) {
	   elementSendKeys(obj.getLoginpage().Password, string);
	}
	@Then("User click The login Button")
	public void user_click_the_login_button() {
	    elementClick(obj.getLoginpage().Login_button);
	}
	@Then("User verfiy logined Successfully")
	public void user_verfiy_logined_successfully() {
		 Assert.assertTrue(elementIsdisplayed(obj.getHomepage().Profile_name));
	}
	@Then("User select the {string} Location as from the dropdown {string}")
	public void user_select_the_location_as_from_the_dropdown(String string, String string2) {
        	           dropdown(obj.getHomepage().s_location, "text", "Sydney");
	}
	@Then("User select the {string} Hotels as from the dropdown {string}")
	public void user_select_the_hotels_as_from_the_dropdown(String string, String string2) {
	          dropdown(obj.getHomepage().s_hotels, "text", "Hotel Creek");
	}
	@Then("User select the {string} roomtype as from the dropdown {string}")
	public void user_select_the_roomtype_as_from_the_dropdown(String string, String string2) {
	         dropdown(obj.getHomepage().s_roomtype, "text", "Standard");
	}
	
	@Then("User select the \"{int} - One\"numberofrooms as from the dropdown \"text\"")
	public void user_select_the_one_numberofrooms_as_from_the_dropdown_text(Integer int1) {
	        dropdown(obj.getHomepage().no_of_rooms, "text", "1 - One");
	}

	@Then("User select the {string} checkin date as from the testcase")
	public void user_select_the_checkin_date_as_from_the_testcase(String string) {
            elementSendKeys(obj.getHomepage().date_select, string);
	}
	@Then("User select the \"{int}\\/{int}\\/{int}\"check_out date as from the testcase")
	public void user_select_the_check_out_date_as_from_the_testcase(Integer int1, Integer int2, Integer int3) {
	                   elementSendKeys(obj.getHomepage().date_out, "14/12/2022");
	}
	@Then("User click the search button")
	public void user_click_the_search_button() {
		obj.getHomepage().Enter_submit.click();
	}
}
