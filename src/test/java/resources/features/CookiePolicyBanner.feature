Feature: Cookie Policy Banner

Scenario: Assert cookie banner text
	Given I am on the "https://www.linklaters.com/en/about-us" page
	
Scenario: Close cookie banner and return to website ensuring banner no longer appeared
	Given I am on the "https://www.linklaters.com/en/about-us" page