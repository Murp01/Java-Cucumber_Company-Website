Feature: Contact Us feature

Scenario Outline: Retrieve location details by selecting from drop down menu
	Given I am on the "https://www.linklaters.com/en/about-us/contact-us" page
	When I select the "<location>" location from the Contact Us drop down box
	Then the details for the "<location>" location will be displayed in the Contact Us box 
	
	Examples:
	|	location	|
	|	London		|
	|	Madrid		|