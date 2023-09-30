
Feature: contact page validation
 

  @smoke
  Scenario: Validate contact page url
   
      Given user is on home page
			When user clicks on contact link
			Then contact page should be displayed
			
	Scenario Outline: verify error messag on blank contact description 
		
		  Given user is on home page
			When user clicks on contact link
			And user clicks on send button
			Then this error message "<errorMsg>" should be displayed 
	Examples:
|errorMsg																												|
|Please enter both your email and message..											|	
			
		
		
	