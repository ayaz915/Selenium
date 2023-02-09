Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Login Page
	When User enters "<username>" and "<password>"
	And Click on login button
	Then User is able to login and a sucess message should display
Examples:
    | username        | password     |
    | standard_user   | secret_sauce |
   
