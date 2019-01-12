Feature: Primary Nav Find People Widget

Scenario: Entering a search term into search box will retrieve all lawyer profiles that contain search term
#Add data table to this once it's up and running
	Given I access the websites homepage
	When I hover over the "Find People" title in the primary navigation and click the "Search Box"
	And I enter the following search term "ian" into the Search Box
	Then all retrieved results will contain the the term "ian"
	
