Construct a linked list from a binary search tree

Narrative:
In order to change to use linked list
As a programmer
I want to construct a linked list from the binary search tree

Meta:
@author Tom Jiang
					 
Scenario:  For a binary search tree with 0 or 1 node, the linked list will be the same as that binary search tree

Given a binary search tree without left nodes and right nodes
When the binary search tree does not have node
Then the linked list will not have node as well
When the binary search tree is one node(10)
Then the linked list will be one with that node(10)

Scenario:  For a binary search tree with left nodes and right nodes, the linked list will be (left nodes)->(parent node)->(right nodes)
Given a binary search tree with left nodes and right nodes
When the binary search tree has 2 nodes: root(10), left(5)
Then the linked list will be left(5)->root(10)
When the binary search tree has 2 nodes: root(10), right(14)
Then the linked list will be root(10)->right(14)
When the binary search tree has 7 nodes: root(10), left(6), left-left(4), left-right(8), right(14), right-left(12), right-right(16)
Then the linked list will be left-left(4)->left(6)->left-right(8)->root(10)->right-left(12)->right(14)->right-right(16)