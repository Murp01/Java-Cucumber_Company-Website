Feature: Primary Navigation Bar

Scenario Outline: Click on each Primary Navigation title link
	Given I access the websites homepage
	When I click on "<title>" from the primary navigation header
	Then the link will open the "<url>" page
	
	Examples:
	|				title				|				url										|
	|  	About Us          				|   https://www.linklaters.com/en/about-us  			|
	|	Client Services					|	https://www.linklaters.com/en/client-services		|
	|	Sectors							|	https://www.linklaters.com/en/sectors				|
	
	