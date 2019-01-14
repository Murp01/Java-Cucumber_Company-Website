Feature: JobListing Widget

Scenario: The open vacancies closing dates will not exceed the current date
	Given I am on the "https://careers.linklaters.com/en/early-careers/your-application" page
	When When I select the "Open vacancies" tab
	Then none of the vacancies will have a closing date that exceeds the current date
	
Scenario: Clicking on a vacancies apply link will redirect to job posting page
	Given I am on the "https://careers.linklaters.com/en/early-careers/your-application" page
	And when I select the "Open vacancies" tab
	When I click on a vacancies Apply button
	Then the webpage is redirected to the job posting page
	
Scenario: The future vacancies tab will display upcoming vacancies
	Given I am on the "https://careers.linklaters.com/en/early-careers/your-application" page
	When When I select the "Future vacancies" tab
	Then upcoming vacancies will be displayed
 