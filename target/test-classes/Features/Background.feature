Feature: Validating Adactin hotel page

Background: 
Given User is on adactin page
When User enters the username and password
And user click the login button 
@smoke
Scenario: Booking with field marked with red astrix mark
When user is on search page and need to select something
And User need to click the login button
@reg
Scenario: Booking with field not marked with red astrix mark
When User is on search page need to select somthing
And User need to click search button
Then User need to validate error message


