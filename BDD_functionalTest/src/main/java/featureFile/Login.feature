@E2E_Testing
Feature: end to end testing

  @Login_Test
  Scenario Outline: check the login functionality with given data
    Given user will launch the browser and will pass the "<Url>"
    When user will enter the username "<Username>" and password "<Password>"
    And user will click on login button
    Then user will go to the home page

    Examples: 
      | Url                                                                | Username | Password |
      | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin    | admin123 |
