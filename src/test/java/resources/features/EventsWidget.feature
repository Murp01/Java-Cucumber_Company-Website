Feature: Events Widget

Scenario Outline: While searching for an event by name all results matching the search term will be displayed
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	When I enter "<searchterm>" into the Event Widgets Name field
	Then all retrieved search results will contain the "<searchterm>"
	
	Examples: 
	|	searchterm	|
	|	the			|
	
Scenario: while using a search term that does not match any events a search failed message will be displayed
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	When I enter a search term that matches no events
	Then a message alerting the user that there are no search results will be displayed
	
Scenario: The correect search results will appear with a combination of search filters
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	When I enter "<searchterm>" into the Event Widgets Name field
	And I select "<practiceoption>" 