Feature: Events Widget


Scenario Outline: While searching for an event by name all results matching the search term will be displayed
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	When I enter "<searchterm>" into the Event Widgets Name field
	Then all retrieved search results will contain the "<searchterm>"
	#This test fails because this search also returns article page search terms.  To successfully automate I would need to build an if statement that will click if can't find search term
	Examples: 
	|	searchterm	|
	|	and			|
	
Scenario: while using a search term that does not match any events a search failed message will be displayed
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	When I enter a search term that matches no events
	Then a message alerting the user that there are no search results will be displayed

@LoadPage	
Scenario Outline: The correct search results will appear with a combination of search filters
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	When I enter "<searchterm>" into the Event Widgets Name field
	And I select "<practiceoption>" from the practice dropdown box
	And I select "<locationoption>" from the locations dropdown box
	And I select "<occuranceoption>" from the events in future box
	And I select "<topicoption>" from the topics dropdown box
	And I select "<typeoption>" from the type dropdown box
	And I select "<speakeroption>" from the speaker dropdown box
	Then all retrieved search results will meet the search criteria
	
	Examples:
	|	searchterm	|	practiceoption						|	locationoption		|	occuranceoption	|	topicoption	|	typeoption	|	speakeroption	|
	|	The			|	Capital Markets						|	Brussels			|	Past Events		|	Brexit		|	DSP			|	Clive Newall	|
	
Scenario Outline: Sort the retrieved results by category 
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	And search results have been retrieved
	When I select "<sortselection>" from the sort dropdown box
	Then the results will be sorted in "<>" order
	
	Examples:
	|	sortselection			|
	|	Sort A-Z				|
	|	Sort Z-A				|
	|	Date (Newest - Oldest)	|
	|	Date (Oldest - Newest)	|	
	
Scenario: Clearing the search results
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	And all filters have been changed and the search query has been returned
	When I click on the Edit Search button
	Then the filters will be reset and the default search results are displayed
	
Scenario: Clicking on the events title will open the event page
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	And all filters have been changed and the search query has been returned
	When I click on the events title
	Then the correct events page will open
	
Scenario: Clicking on the events view link will open the event page
	Given I am on the "https://www.linklaters.com/en/insights/events" page
	And all filters have been changed and the search query has been returned
	When I click on the events view link
	Then the correct events page will open
	
