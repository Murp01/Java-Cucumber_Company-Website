Feature: Primary Nav Find People Widget

Scenario: Find People Drop Down Search
#Add data table to this once it's up and running
	Given I access the websites homepage
	And I hover over the "Find People" title in the primary navigation and click the "Search Box"
	When I enter the following search term "ian" into the Search Box
	Then all retrieved results will contain the the term "ian"