This is a README file for building a threaded binary tree and traversing it in the In-order Left-to-Right and In-order Right-to-Left schemes.

Created by:
 
Nour Yaghmour 
Olga Melnikova

1. Overview
A "threaded tree" deals with the problem of NULL pointers. If a node does not have the right pointer, it stores a pointer to In-Order left-to-right successor of this node; if it does not have the left pointer, it stores a pointer to In-Order right-to-left successor of the node. "Successor" means the node that will be traversed after the node in question.


2. Description 

The file ThreadedTree has the following methods:

1- insertElement: adds a new letter to the tree based on a Binary Search Tree add rule (if the value to insert is smaller than the root node - add it to the left subtree; if it is larger than the root node - add it to the right subtree).

2- inorderLRSuccessor: takes a node and finds its successor node according to Left-Right Inorder traversal of the binary search tree.

3- inorderRLSuccessor: takes a node and finds its successor node according to Right-Left Inorder traversal of the binary search tree.

4- inorderLRTraversal: prints the elements in the threaded tree based on the Left-To-Right Inorder traversal.

5- inorderRLTraversal: prints the elements in the threaded tree based on the Right-To-Left Inorder traversal.



2. Files inside the directory:

Java code files:

ThreadedTree.java - java code file for building a threaded binary search tree containing all of its methods.

Main.java - java code file for inserting the char elements: T, B, E, A, H, F, D, R, I, O, L and printing the elements in the In-order Left-to-Right and In-order Right-to-Left schemes in the main method.


Compiled Java class files:

ThreadedTree.class - compiled java class file for building a threaded binary search tree containing all of its methods.

Main.class - compiled java class file for inserting the char elements: T, B, E, A, H, F, D, R, I, O, L and printing the elements in the In-order Left-to-Right and In-order Right-to-Left schemes in the main method.




