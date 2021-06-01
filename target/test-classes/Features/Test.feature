@e2e
Feature: To Validate the facebook login page
  

  @smoke
  Scenario: To validate fb app with Invalid username and password
    Given User launch the browser and navigate to fb home page
    When User enters the url
    When User enters the Username and password
    And User click the login button
    Then User validate the homepage
  @smoke
Scenario: To validate fb app with Invalid username and password
    Given User launch the browser and navigate to fb home page
    When User enters the url
    When User enters the Username and password
    And User click the login button
    Then User validate the homepage
    @reg
Scenario: To validate fb app with Invalid username and password
    Given User launch the browser and navigate to fb home page
    When User enters the url
    When User enters the Username and password
    And User click the login button
    Then User validate the homepage 