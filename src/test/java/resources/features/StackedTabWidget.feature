Feature: Stacked Tab Widget

Scenario: Click on each stacked tab icon and ensure the tab's content is displayed

	Given I am on the "https://careers.linklaters.com/en/early-careers/our-opportunities" page
	When I click on stacked tab "Left01"
	Then the content of stacked tab "Left01" will be displayed

