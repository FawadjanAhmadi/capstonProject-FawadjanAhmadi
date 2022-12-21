Feature: Retail Account Page

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'fawadjan55@yahoo.com' and password 'Alijan111$'
And User click on login button
And User should be logged in into Account

@AccountPage1
Scenario: Verify User can update Profile Information
When User click on Account option
And User update Name 'fawadjann' and Phone '916-876-9800'
And User click on Update button
Then user profile information should be updated

@AccountPage2
Scenario: Verify User can Update password
When User click on Account optionn
And User enter below information |previousPassword 'Fawadjan55$' newPassword 'FawadAh55$'confirmPassword 'FawadAh55$'
And User click on Change Password button
Then a message should be displayed ‘Password Updated Successfully’

@AccountPage3
Scenario: Verify User can add a payment method
When User click on Account optionnn
And User fill Debit or credit card information cardNumber'5667876523234789' nameOnCard'fawadaha'expirationMonth expirationYear securityCode'927'
And User click on Addd your card button
Then a message should be displayed ‘Payment Method added successfully’

@AccountPage4
Scenario: Verify User can edit Debit or Credit card
When User click on Account optionq
And User click on Edit option of card section
And user edit information with below data cardNumber'3422223456555567'nameOnCard'fawadjan'expirationMonth expirationYear securityCode'543'
And user click on Update Your Card button
Then a message should be displayed ‘Payment Method updated Successfully’

@AccountPage5
Scenario: Verify User can remove Debit or Credit card
When User click on Account optionE
And User click on remove option of card section
Then payment details should be removed

@AccountPage6
Scenario: Verify User can add an Address
When User click on Account optionF
And User click on Add address option
And user fill new address form with below information country fullName'fawadjanahmadi'phoneNumber'9166547899'streetAddress'3454 edision ave 'apt '66'city 'sacramento' state zipCode'95821'
And User click Add Your Addresss button
Then a message should be displayed ‘Address Added Successfully’

@AccountPage7
Scenario: Verify User can edit an Address added on account
When User click on Account optionQ
And User click on edit address option
And user fill new address form with below information ccountry fullName'Basitahmadi'phoneNumber'9166547855'streetAddress'1111 edision ave 'apt '11'city 'sacramento' state zipCode'95821'
And User click update Your Address button
Then a message should be displayed ‘Address Updated Successfully’

@AccountPage8
Scenario: Verify User can remove Address from Account
When User click on Account optionZ
And User click on remove option of Address section
Then Address details should be removed