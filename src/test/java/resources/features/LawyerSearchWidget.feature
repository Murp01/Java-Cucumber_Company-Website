Feature: Lawyer Search Widget

	
Scenario: I can search for Lawyer using a partial search term
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page
	And I type "ian" into the Find A Lawyer Page Search Box
	Then all retrieved profiles will contain the term "ian"
	

Scenario Outline: I can use the alphabet buttons to locate persons whose name contains the selected character
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page
	When I click on the "<alphabetbutton>" alphabet button
	Then all retrieved results will contain "<alphabetbutton>"
	Examples:
	|	alphabetbutton	|
	|	A				|
	|	C				|	
	|	Z				|
	
@LoadPage
Scenario Outline: I can use multiple alphabet buttons to locate persons whose name contains the selected character
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page
	When I click on the "<alphabetbuttona>" and "<alphabetbuttonb>" alphabetbuttons
	Then all retrieved results will contain "<alphabetbuttona>" and "<alphabetbuttonb>"
	Examples:
	|	alphabetbuttona		|	alphabetbuttonb	|
	|	A					|	L				|
	|	C					|	K				|	
	|	Z					|	H				|
	
Scenario Outline: I can search for a lawyer by entering the full name into the Name search field
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page
	And the "Lawyer Directory" tab is selected
	When I enter the name of a "<person>" who is in the lawyer team
	Then the "<person>" profile is retrieved
	Examples:
	|	person			|
	|	Michael Brock	|
	|	Angus McGregor	|
	
Scenario Outline: Entering the name of a business team person while the Lawyer directory is selected will not find person
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page
	And the "Lawyer Directory" tab is selected
	When I enter the name of a "<person>" who is in the business team and not a lawyer
	Then the "<person>" profile is not retrieved
	Examples:
	|	person			|
	|	Michael Brock	|
	|	Angus McGregor	|
	
Scenario: Disclaimer text will be displayed when searching for lawyers based in Japan
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page 
	When I select "Japan" from the "Location" dropdown field
	Then a disclaimer will be displayed above the retrieved lawyers
	
Scenario: Only 30 results will be displayed by default and clicking on the Load more button will display a further 15 will be displayed
	Given I am on the "https://www.linklaters.com/en/find-a-lawyer" page
	And the default "30" results will be displayed by default
	When I click on the "LOAD MORE" button
	Then a further "15" retrieved results will be displayed 