Feature: Global Site Search


@LoadPage
Scenario Outline: I can search the entire website with a search term by using a global site search field
	Given I access the websites homepage
	When I type "<searchterm>" into the global site search field and click on the search button
	Then the search results screen will open displaying up to 10 articles
	And a "LOAD MORE" button will appear below the last retrieved article if there are more than 10 results
	Examples:
	|	searchterm			|
	|	Gideon				|

	
Scenario Outline: I want the search results to appear below the global site search field as the site autocompletes the search query
	Given I access the websites homepage
	When I type "<searchterm>" into the global site search field
	Then the results will appear below the global site search field as I type the characters in
	Examples:
	|	searchterm			|
	|	Gideon				|
	|	Gid					|
	
Scenario Outline: I want to be informated on the search results page that my query from the global site search has not retrieved any results
	Given I access the websites homepage
	When I type "<searchterm>" into the global site search field and click on the search button
	Then the search results screen will display a message stating no results have been returned
	Examples:
	|	searchterm				|
	|	as;dlfkajsd;			|
	|	343240985732049			|
	
Scenario Outline: I want the search results to appear below the global site search field as the site autocompletes the search query
	Given I access the websites homepage
	When I type "<searchterm>" into the global site search field
	Then a message will display below the site search field stating no results have been returned
	Examples:
	|	searchterm				|
	|	as;dlkfjas;				|
	|	23423432				|