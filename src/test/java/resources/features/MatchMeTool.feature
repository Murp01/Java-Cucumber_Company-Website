Feature: Match Me tool

Scenario: I can Use the match me tool as a user still in school to see what I am eligible to apply for
	Given I am on the "https://careers.linklaters.com/en/early-careers/match-me" page
	When I select "School" from the "educationstage" page of the chatbot
	Then the "Results" page will be displayed with the matched result being "School"
	
Scenario: I can view details on the result from the results page
	Given I am on a matched results screen
	When I click on the quick view button for the top result
	Then a window will appear with the details of the match
	
Scenario Outline: I will be directed to a webpage with futher results on my matched result
	Given the details window for the matched "<matchedresult>" results is displayed
	When I click on the "VIEW MORE" link from the matched detail window
	Then I am redirected to the "https://careers.linklaters.com/en/early-careers/schools" page
	Examples:
	|	matchedresult	|	webpage													|
	|	School			|	https://careers.linklaters.com/en/early-careers/schools	|
	
Scenario Outline: I can start a new match query by clicking on a link from the current matched results page
	Given I am on the "<matchedresultscreen1>" matched results screen
	And I click on the "Match Me" link from the primary navigation bar
	And I run a query that takes me to the matched results screen which has "<matchedresultscreen2>" as the top result
	When I click on the "View previous match" link
	Then I will be returned to the "<matchedresultscreen1>" page
	Examples:
	|	matchedresultscreen1	|	matchedresultscreen2	|
	|	School					|	Vacation Schemes London	|
	
Scenario Outline: I can click on a link from the matched results screen that will take me to websites Our Opportunities page 
	Given I am on the "<matchedresultscreen1>" matched results screen
	When I click on the "VIEW MORE" button on the matched results screen
	Then the "https://careers.linklaters.com/early-careers/our-opportunities" page will be opened
	Examples:
	|	School	|