Feature: Lawyer Search Widget

Scenario: Search for Lawyer
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page
	And I type "ian" into the Find A Lawyer Page Search Box
	Then all retrieved profiles will contain the term "ian"