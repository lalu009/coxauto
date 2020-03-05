Feature: CoxAuto contact us feature
  As a user i want to contact CoxAuto

  Scenario: User should contact Movex successfully
    Given I am on the CoxAuto homepage
    When I click on Get in touch link
    And I click on contact Movex at the bottom of the page
    And I enter my name " Steve Jobs"
    And I enter my phone no "07979797979"
    And I enter my email "abcd12@gmail.com"
    And I confirm my email "abcd12@gmail.com"
    And I type my massage" I would like to enquiry about X product"
    And I click on send massage button
    Then Thank you massage should be displayed
