@Regression
Feature: Validate Selling Module
 
   Scenario Outline: verify modules under Selling
    Given user is on home page
		When user navigate to login page
		And user specifies email as "<email>"
		And user specifies password as "<password>"
		And user clicks on login button
		Then desk page should be displayed
  	Then selling module should be visible
Examples:
|email									|password		|
|nitesh_iiitm@yahoo.com	|Test@123		|
 
 		
