Feature: Landing page smoke tests


Scenario Outline: I want the title and the URL to be correct when accessing pages from the primary navigation bar
	Given I start on the "<startpage>" page
	When I click on "<primarynavpage>" from the primary navigation
	Then the "<url>" and "<title>" will be correctly formatted
	Examples:
	|	startpage		|	primarynavpage			|	title					|	url								|
	|	homepage		|	About Us				|	About Us				|	About Us						|
	

Scenario Outline: I want the title and url to be correct when accessing pages from the secondary navigation bar
	Given I start on the "<startpage>" page
	When I hover over "<primarynavpage>" and select "<secondarynavpage>" from the secondary navigation
	#When I click on "<secondarynavpage>" from the primary navigation
	Then the "<url>" and "<title>" will be correctly formatted
	Examples:
	|	startpage		|	primarynavpage		|	secondarynavpage		|	title					|	url										|
	|	homepage		|	About Us			|	Alumni					|	Alumni					|	Alumni									|						
	|	homepage		|	About Us			|	At a glance				|	At a glance				|	At a glance								|