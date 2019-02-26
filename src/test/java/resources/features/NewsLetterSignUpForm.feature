Feature: Newsletter SignUp Form

Scenario: Subscribed items will be displayed in a subscribed to box on the first page
	Given I am on the "https://www.linklaters.com/en/about-us/newsletter-signup" page
	When I subscribe to the following items
	|	Asia News	|	Insurance Update	|	UK Pensions	|
	Then the following subscribed items will be displayed in the pg1 subscribed to box
	|	Asia News	|	Insurance Update	|	UK Pensions	|
	
Scenario: Subscribing to items then clicking continue will open second page
	Given I am on the "https://www.linklaters.com/en/about-us/newsletter-signup" page
	And I subscribe to the following items
	|	Asia News	|	Insurance Update	|	UK Pensions	|
	When I click on the continue link
	Then the Address form will be displayed
	Then the following subscribed items will be displayed in the pg2 subscribed to box
	|	Asia News	|	Insurance Update	|	UK Pensions	|
	
Scenario: I am able to return to the previous page and add more subscribed items
	Given I am on the "https://www.linklaters.com/en/about-us/newsletter-signup" page
	And I subscribe to the following items
	|	Asia News	|	Insurance Update	|	UK Pensions	|
	And I click on the continue link
	And the Address form will be displayed
	And the following subscribed items will be displayed in the pg2 subscribed to box
	|	Asia News	|	Insurance Update	|	UK Pensions	|
	And I click on page2 Return to Step one link
	Then the following subscribed items will be displayed in the pg1 subscribed to box
	|	Asia News	|	Insurance Update	|	UK Pensions	|
	And I subscribe to the following checkboxes
	|	UK Corporate Update	|
	And I unsubscribe to the following items
	|	Asia News	|
	Then the following subscribed items will be displayed in the pg1 subscribed to box
	|	UK Corporate Update	|	Insurance Update	|	UK Pensions	|