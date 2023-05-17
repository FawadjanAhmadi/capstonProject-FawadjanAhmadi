@baba
Feature: Create new accunt

Scenario: Verify user can create an account into Retail Website
Given User is on retail website
When User click on Sign in optionn
And User click on Create New Account button
And User fill the signUp information with below name 'Fawadjjjja' email 'fawad422222@yahoo.com' password 'Alijan111111@' confirmPassword 'Alijan11111@'
And User click on SignUp button
Then User should be logged into account page