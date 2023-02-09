Feature: Register Action

Scenario Outline: Successful Register with provided data
	Given User is on Register Page
	When User enters "<name>" and "<company>" and "<email>" and "<password>" and "<confirmPassword>"
	And Click on Register button
	Then User is able to register and a sucess message should display
Examples:
    | name            | company     |   email             | password | confirmPassword |
    | Ayaz            | Telus       |ayaz.hasan@telus.com | 123      | 123             |
   
