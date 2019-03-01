Feature: Accordion Widget

The website uses an accordion widget to neatly show subject headers with its content hidden until clicked.
Upon clicking on the subject header the content will be displayed below.  The content can contain links which
when clicked on will redirect to another webpage.  Each segment will remain open when another has been clicked
on.  When arriving on a webage that contains an accordion feature all segments will be closed by default

@Complete
Scenario: Open all accordions segments
	Given I am on the "https://www.linklaters.com/en/about-us" page
	When I click on each "closed" accordions segments
	Then the correct content will be displayed
	
@Complete
Scenario: Upon arriving on the page the accordion will be closed by default
	Given I am on the "https://www.linklaters.com/en/about-us" page
	And "segment01" is open
	When I go to another page on the same website
	And I click the "back" browser button
	Then all accordion segments will be closed
	
@Complete
Scenario: Close all segments of the accordion widget
	Given I am on the "https://www.linklaters.com/en/about-us" page
	And I click on each of the accordions segments
	When I click on each "open" accordion segment
	Then all accordion segments will be closed
	
#fails
Scenario:  All links within accordion's content will direct to the correct destination page
	Given I am on the "https://www.linklaters.com/en/about-us" page
	And "segment01" is open
	When I click on the "ResponsibleBusinessSection" link from within "segment01"
	Then the webpage will change to "https://www.linklaters.com/en/about-us/responsibility"

@Complete
Scenario: Segments will remain open when another segment is opened
	Given I am on the "https://www.linklaters.com/en/about-us" page
	And "segment01" is open
	When "segment02" is open
	Then "segment01 " will remain open


	

