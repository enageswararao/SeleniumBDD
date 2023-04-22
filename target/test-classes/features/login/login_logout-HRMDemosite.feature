Feature: As a OrangeHRMlive user I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the HRM Login page URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
   # Then I click on sign in button and wait for sign in page
    Then I should see HRM Sign In Page
    When I enter HRM username as "Admin"
    #And I Click on Continue button
    And I enter HRM password as "admin123"
    And click on HRM login button
    Then I am logged in HRM
