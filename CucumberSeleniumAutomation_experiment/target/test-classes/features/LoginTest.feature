
Feature: Validate Login for user
 @smoke
   Scenario: verify desk page when valid credential is specified
    Given user is on home page
		When user navigate to login page
		And user specifies email as "nitesh_iiitm@yahoo.com"
		And user specifies password as "Test@123"
		And user clicks on login button
		Then desk page should be displayed
  	Then selling module should be visible
  
	@smoke  
  Scenario: verify error message when invalid credential is used
    Given user is on home page
		When user navigate to login page
		And user specifies invalid crdential
		And user clicks on login button
		Then error invalid login should be displayed
		
  @regression
  Scenario: i want to check  desk page when valid credential is used
    Given user is on home page
		When user navigate to login page
		And user specifies valid crdential
		And user clicks on login button
		Then desk page should be displayed
  	Then selling module should be visible
  ###########################################################
 
  
  
  
  