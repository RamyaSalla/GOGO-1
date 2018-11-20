# GOGO-1
GOGO-1
 # Frame work
 
 	 Main/java is the where different folders are created for the project.
 
  		com.qa.base : would have all the methods and variable defined for complete projects.
	
  		com.qa.config : would have properties file where we define the environment varible for our project.
	
 		 com.qa.MainTest : would have all the Unit Test to be performed for each method defined at base folder.
	
 		 com.qa.Tesdata : would have all the test related data/Pre requities for the test to run sucessfully.
	
  		com.qa.util : would have all the common funtion to be used in the Testing process, not related to application.
	
  	 test/java is where we have all the pakages to execute the test with a workflow/scenarios.
	
  		GOGO.GOGO : have all the test cases and data for data driven testing
				This pakage would also contains folder for screenshot, Logs and Test results 
  
  
  # Methods and explination
  
  	# MainCard.java : This has the methods and variable to be used in the project
  	we defined some global variables and 3 methods
	It also has a constructor which would be initialized to fecth values from .properties file
		
		Methods:
		
		Suffle : This method would get the no. of cards in the deck from the properties files and run with the randon number.
		         and  place 1st card with  random postion card. This continues till the counter is equal to the deck count.
		Display : This method would display all the card which with thier new postion.
			we are dividing by 13 as we have 13 card for each symbol.
			and reminder is used to fecth the card number.
		Remove card : This method woudl display the card which is to be removed specified in the properties file.
		
	# DisplayTest.Java would be used for unit testing the Display method
	# RemoveCardTest.java is used to unit test the removeCard method.
	# Shuffle is used to test the shuffle method.
	# PageObject.java is used to have the object details and used as repository.
	# TestData.java is used to have details all the data required for the used for unit testing and also pre requisites.
	# ConfigValue.java is used to have all the generic methods used for the project not application specific.
	# Testcase1.java is the test case use to run shuffle and print the card to the user.
	# Testcase2.java is test case used to shuffle and show the card to be deleted at the poistion specified.

  # Properties file
  
  	# card.properties  this file would have all the  values needed and could be changed to run the test as needed
			Remove : No of the card to be removed from the deck.
			card: position of the card to be removed from the deck.
			

	
	
	
		
		
		
		
		
		
  
  
	
	
	
