Feature: Login Functionality

@test1
Scenario Outline: Validate UI Screen with Data Table
Given I Enter Username "<username>" and Password "<password>"
When I Enter the details for the Data1 "<Data1>" Data2 "<Data2>"
Examples:
			|username|password|Data1|Data2|
			|admin| admin				| Red 		|Yellow			|
			|admin| admin				| Blue 		|Black			|
			|admin| admin				| Violet 	|Green			|
			|admin| admin				| Red 		|Blue				|
			
