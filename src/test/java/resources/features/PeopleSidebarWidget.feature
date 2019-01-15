Feature: People widget sidebar

Scenario Outline: Click on a link from within the People Widget sidebar
	Given I am on the "https://www.linklaters.com/en/about-us" page
	When I click on the "<personprofile>" sidebar widget
	Then "<personprofilepage>" profile page will open
	Examples:
	|	personprofile		|
	|	Charles Jacobs		|
	|	Gideon Moore		|