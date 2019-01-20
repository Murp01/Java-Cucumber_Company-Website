Feature: Webpages


Scenario Outline: I want the title and the URL to be correct when accessing pages from the primary navigation bar
	Given I am on the "<startpage>" page
	When I click on "<primarynavpage>" from the primary navigation
	Then the "<url>" and "<title>" will be correctly formatted
	Examples:
	|	startpage		|	primarynavpage			|	title					|	url																							|
	|	homepage		|	About Us				|	About Us | Linklaters	|	https://www.linklaters.com/en/about-us						|
	
Scenario Outline: I want the title and url to be correct when accessing pages from the secondary navigation bar
	Given I am on the "<startpage>" page
	When I click on "<secondarynavpage>" from the primary navigation
	Then the "<url>" and "<title>" will be correctly formatted
	Examples:
	|	startpage		|	secondarynavpage		|	title					|	url																							|
	|	homepage		|	About Us				|	About Us | Linklaters	|	https://www.linklaters.com/en/about-us						|						
	