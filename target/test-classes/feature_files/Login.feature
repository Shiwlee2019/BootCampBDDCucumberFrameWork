@TutorialsNinjaLogin
Feature: Login functionality of TutorialsNinja


@ValidCredentials
Scenario Outline:  Login with valid credentials
Given User navigate to LoginPage
When User enters valid email <email> into email textbox field
And User enters valid password <password> into password textbox field
And User click on Login button
Then user is navigated to Accountpage
Examples:
|        email           |  password   |
|testingid1999@gmail.com | testing1980 |
|testingid1981@gmail.com | testing1980 |
|testingid19999@gmail.com| testing1980 |
|testingid1983@gmail.com | testing1980 |
|testingid1984@gmail.com | testing1980 |
|testingid1985@gmail.com | testing1980 |
|testingid1986@gmail.com | testing1980 |
|testingid19877@gmail.com| testing1980 |
|testingid19888@gmail.com| testing1980 |
|testingid1989@gmail.com | testing1980 |




@InvalidCredentails
Scenario: Login with invalid credenatils
Given  User navigate to LoginPage
When user enters invalid email into email textbox field
And User enters invalid password 'testingid123456' into password textbox field
And User click on Login button
Then User gets warning message about mismatch credentails

@ValidEmailInvalidPassword
Scenario: Login with valid email and invalid password
Given User navigate to LoginPage
When User enters valid email 'Shiwlee2011@gmail.com' into email textbox field
And User enters invalid password 'testing123456' into password textbox field
And User click on Login button
Then User gets warning message about mismatch credentails

@InvalidEmailValidpassword
Scenario: login with invalid email and valid password
Given User navigate to LoginPage
When user enters invalid email into email textbox field
And User enters valid password 'Rima2022' into password textbox field
And User click on Login button
Then User gets warning message about mismatch credentails

@NoCredentails
Scenario: Login without credentails
Given User navigate to LoginPage
And User click on Login button
Then User gets warning message about mismatch credentails