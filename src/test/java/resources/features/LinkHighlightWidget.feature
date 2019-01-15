Feature: Link Highlight Widget

Scenario: Click on a link from the Link highlight widget
	Given I am on the "https://www.linklaters.com/en/about-us/alumni" page
	When I click on the link widget
	Then the webpage will be redirected to the correct page
	