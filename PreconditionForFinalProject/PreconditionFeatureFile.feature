Feature: User submits personal information on website

  Scenario: User enters required personal info and submits form
    Given the user is on the personal information form page
    When the user enters the required personal information into the form fields
    And the user clicks the Submit button
    Then the submitted information should be displayed below the Submit button
