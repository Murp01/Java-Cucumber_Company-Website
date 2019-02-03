Feature: Lawyer Location Search

Container with loads of lawyers like and you can search em

@LoadPage
Scenario Outline: Filter the lawyers using the location search dropdown
	Given I am on the "https://www.linklaters.com/en/sectors/fintech" page
	When I select "<dropdownselection>" from the location dropdown box
	Then the lawyers will filter displaying lawyers who match the "<dropdownselection>"
	Examples:
	|	dropdownselection	|
	|	All Locations		|
	|	France				|
	