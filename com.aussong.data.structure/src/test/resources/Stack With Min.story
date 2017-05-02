Construct a stack with min function

Narrative:
In order to add min function to a stack
As a programmer
I want to construct a stack with min function

Meta:
@author Tom Jiang
					 
Scenario:  When pushing a node into a stack, the stack top will increase 1, and the min index will be updated

Given a stack
When the stack is empty, pushing a node(10) into a stack
Then the top will be 1, and the min index will be 1
When pushing a smallest node(8) into a stack
Then the top will increase 1 to 2, and the min index will be same as top, that is, 2
When pushing a larger node(12) into a stack
Then the top will increase 1 to 3, but the min index will be same as before, that is, 2