@TutorialsNinjaRegister
Feature: Register functionality of TutorialsNinja

  @MandatoryFields
  Scenario: Register with mandatory fields
  Given User navigates to RegisterPage
    When User enters below mandatory fields
    |firstname 			| Shiwlee			|
    |lastname				| Rahman 			|
    |telephone			| 929060211 	|
    |password				| Rima2022    |
    |confirmpassword| Rima2022	  |
   
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User account gets created successfully


 @AllFields
  Scenario: Register with all fields
  Given User navigates to RegisterPage
    When User enters below all fields
    |firstname 			| Shiwlee			|
    |lastname				| Rahman			|
    |telephone			| 9296090211	|
    |password				| Rima2022 	  |
    |confirmpassword| Rima2022  	|
    And User selects Yes for newsletter
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User account gets created successfully
    
 
 
  @DuplicateEmail
  Scenario: Register with existing email
  Given User navigates to RegisterPage
    When User enters below all fields with existing email
    |firstname 			| Shiwlee							|
    |lastname				| Rahman							|
    |email 					|Shiwlee2011@gmail.com|
    |telephone			| 9296090211 					|
    |password				| Rima2022					  |
    |confirmpassword| Rima2022					  |
    And User selects Yes for newsletter
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User gets warning message of duplicate email  
 
 
  @NoFields
  Scenario: Register with no fields
  Given User navigates to RegisterPage
    When User clicks on Continue button
    Then User gets warning message for mandatory fields
    