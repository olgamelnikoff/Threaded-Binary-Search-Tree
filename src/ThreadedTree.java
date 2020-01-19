public class ThreadedTree {
	private class TreeNode {
		private char letter;
		private int digit;
		private TreeNode leftChild;
		private TreeNode rightChild;
		boolean leftFlag;
		boolean rightFlag;
		
		public TreeNode () {
			
		}
	}
	//End of private class TreeNode
	
	private TreeNode root;
	
	public ThreadedTree () {
		root = null;
	}
	
	public void add (char letter) {
		root = insertElement (letter, root);
	}
	
	private TreeNode insertElement (char newLetter, TreeNode root) {
		
		TreeNode pointer = root;
		TreeNode parent = null; // Parent of the key
		
	    while (pointer != null) {
	    	
	        // If the key already exists, return a message  
	        if (newLetter - '0' == pointer.digit)  {  
	            System.out.println("Duplicate key!");  
	            return root;  
	        }  
	    
	        parent = pointer; // Update the parent  
	    
	        // If the new letter comes before the pointer letter, 
	        // move to the left subtree  
	        if (newLetter - '0' < pointer.digit) {  
	            if (pointer.leftFlag == false) {  
	                pointer = pointer.leftChild; 
	            }
	            else
	                break;  
	        }  
	    
	        // If the new letter comes after the pointer letter, 
	        // move to the right subtree  
	        else {  
	            if (pointer.rightFlag == false) {  
	                pointer = pointer.rightChild;
	            }
	            else
	                break;  
	        }  
	    }  
	    
	    // Create a new node, initialize its local variables  
	    TreeNode temp = new TreeNode ();  
	    temp.letter = newLetter;
	    temp.digit = newLetter - '0';
	    temp.leftFlag = true;
	    temp.rightFlag = true;
	      
	    if (parent == null) {  
	        root = temp;  
	        temp.leftChild = null;  
	        temp.rightChild = null;
	    }
	    
	    else if (newLetter - '0' < (parent.digit)) {  
	        temp.leftChild = parent.leftChild;
	        temp.rightChild = parent;  
	        parent.leftFlag = false;  
	        parent.leftChild = temp;  
	    }  
	    else {  
	    	temp.leftChild = parent;  
	    	temp.rightChild = parent.rightChild; 
	        parent.rightFlag = false;  
	        parent.rightChild = temp;  
	    }  
	    
	    return root;  
	}  
		
	private static  TreeNode inorderLRSuccessor(TreeNode pointer) {  
		// If the rightFlag is true, we can quickly find 
		//the in-order successor of the current node 
	    if (pointer.rightFlag == true)  
	        return pointer.rightChild;  
	    
	    // Or return the leftmost child of the right subtree  
	    pointer = pointer.rightChild;  
	    while (pointer.leftFlag == false) {  
	    	pointer = pointer.leftChild;
	    }
	    	return pointer;  
	}  
	
	private static  TreeNode inorderRLSuccessor(TreeNode pointer) {  
		// If the leftFlag is true, we can quickly find 
		//the in-order successor of the current node 
	    if (pointer.leftFlag == true)  
	        return pointer.leftChild;  
	    
	    // Or return the rightmost child of the left subtree  
	    pointer = pointer.leftChild;  
	    while (pointer.rightFlag == false) {  
	    	pointer = pointer.rightChild;
	    }
	    	return pointer;  
	}  
	    
	// Printing the threaded tree in Left-To-Right scheme  
	public void inorderLRTraversal() {  
	    if (root == null)  
	        System.out.println("The tree is empty");  
	    
	    // Reach leftmost node
	    TreeNode pointer = root;  
	    while (pointer.leftFlag == false)  
	    	pointer = pointer.leftChild;  
	    
	    // Print the successors one-by-one 
	    while ((pointer != null)) {  
	        System.out.print(pointer.letter + " ");  
	        pointer = inorderLRSuccessor(pointer);  
	    }  
	}
	
	// Printing the threaded tree in Right-To-Left scheme
	public void inorderRLTraversal () {
		if (root == null)  
	        System.out.println("The tree is empty");  
	    
	    // Reach rightmost node
	    TreeNode pointer = root;  
	    while (pointer.rightFlag == false)  
	    	pointer = pointer.rightChild;  
	    
	    // Print the successors one-by-one 
	    while ((pointer != null)) {  
	        System.out.print(pointer.letter + " ");  
	        pointer = inorderRLSuccessor(pointer);  
	    }  
	}
}
