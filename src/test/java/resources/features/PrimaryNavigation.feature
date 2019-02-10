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
	
Scenario Outline: I can return to the homepage from anywhere on the site with the exception of carreers microsite by clicking on the Linklaters Logo
	Given I am on the "<webpage>" page
	When I click on the Linklaters log at the top right of the webpage
	Then I will be returned to the homepage
	Examples:
	|	webpage													|
	|	https://www.linklaters.com/en/about-us					|	
	|	https://www.linklaters.com/en/sectors					|
	|	https://www.linklaters.com/en/client-services			|
	|	https://www.linklaters.com								|

@LoadPage	
Scenario: Print out all primary nav title and urls
	Given I access the websites homepage
	When I click on all primary header links
	Then all primary header pages will contain the correct title
	
