@baba
Feature: RetailOrderPage

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'fawad422222@yahoo.com' and password 'Alijan111111@'
And User click on login button
And User should be logged in into Account


Scenario: Verify User can cancel the order
Given User is on retail website
When User click on Orderss section
And User click on first order inn list
And User click on Cancel The Order button
And User select the cancelation Reason ‘Bought wrong item’
And User click on Cancel Order button
Then a cancelation message should be displayed ‘Your Order Has Been Cancelled’


Scenario: Verify User can Return the order
When User click on Orders sectionn
And User click onn first order in list
And User click on Return Items button
And User select the Return Reason ‘Item damaged’
And User select the drop off service ‘FedEx’
And User click on Return Order button
Then a cancelation message should be displayed ‘Return was successful’


Scenario: Verify User can write a review on order placed
When User click onn Orders section
And User click on firstt order in list
And User click on Review button
And User write Review headline 'headline value' and 'review text'
And User click Add your Review button
Then a review message should be displayed 'Your review was added successfully'