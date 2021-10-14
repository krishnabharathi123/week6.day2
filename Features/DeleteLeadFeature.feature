Feature: Delete the created lead in the leaftaps application

#Background:
#Given Open the browser and launch the 'http://leaftaps.com/opentaps/'

@regression
Scenario: Delete the lead
Given Enter the 'username' 'DemoSalesManager'
And Enter the 'password' 'crmsfa'
When Click on the submit button
Then 'Home page' page should be displayed
When Click on the 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on the 'Leads' link
Then 'My Leads' page should be displayed
When Click on the 'Find Leads' link
Then 'Find Leads' page should be displayed
Given Click on the 'Phone' tab
And Click on 'phoneNumber' as '9090'
When Click on Find Leads tab
Then Get the firest filtered lead id
Given Click on the filtered lead id
When Click on the 'Delete' link

