@Smoke
Feature: Adactintwo Testcases 
@TC101
Scenario:  To verify system should report an eror message
Given User launch the "chrome" Browser
And User Navigate the Url "https://adactinhotelapp.com/"
Then User verify Login Page
And User enter valid UserName "vijibharathi"
And User enter valid Password "Bharathi@@2629"
And User click The login Button
And User verfiy logined Successfully
And User select the "Sydney" Location as from the dropdown "text" 
And User select the "Hotel Creek" Hotels as from the dropdown "text" 
And User select the "standard" roomtype as from the dropdown "text"
And User select the "1 - One"numberofrooms as from the dropdown "text" 
And User select the "16/12/2022" checkin date as from the testcase
And User select the "14/12/2022"check_out date as from the testcase
And User click the search button

