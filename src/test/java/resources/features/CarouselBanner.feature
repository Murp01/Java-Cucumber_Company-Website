Feature: Homepage Carousel widget

The homepage has a carousel widget that...


#Fails
Scenario: Click on different tabs on Carousel widget via border arrows
	Given I access the websites homepage
	And I scroll the carousel feature by clicking on the "Right" border arrow
	When I scroll the carousel feature by clicking on the "Right" border arrow
	Then the carousel slide will change
	
#two of three ScenarioFail - have the slides changed and I represent them incorrectly
Scenario Outline: Click on each tab from within a carousel category
	Given I access the websites homepage
	And "<category>" tab is selected
	When I click on "<secondslidechoice>" tab
	Then "<assertedslide>" will be displayed
	
	Examples:
	|	category			|	secondslidechoice	| assertedslide	|
	|	category01			|	slide01				|	slide01		|
	| 	category01			|	slide03				|	slide03		|
	|	category03			|	slide01				|	slide01		|
	
@Complete
Scenario Outline: Click on each category from the carousel widget
	Given I access the websites homepage
	When I click on "<categoryclick>" tab
	Then "<categorydisplayed>" will be displayed
	
	Examples:
	|	categoryclick	|	categorydisplayed	|
	|	category01		|	category01			|
	|	category02		|	category02			|
	|	category03		| 	category03			|	
	
@Complete
Scenario Outline: Clicking on links from within a slide will redirect to another webpage
	Given I access the websites homepage
	And "<selectedcategory" is selected with "<selectedslide>" selected
	When I click on the "<link>" link from the slide
	Then the "<webpage>" webpage will be opened
	
	Examples:
	|	selectedcategory	|	selectedslide	|	link		|	webpage														|
	|	category01			|	slide01			|	EXPLORE		|	https://www.linklaters.com/en/insights/publications/year-review-year-to-come/2018-2019/year-in-review-2018-and-year-to-come-2019---the-world-in-2019 |
	|	category02			|	slide01			|	VISIT THE TRACKER	|	https://www.linklaters.com/en/insights/thought-leadership/brexit/brexit-si-tracker	|

	
	
	

	
