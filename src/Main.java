public class Main {
	public static void main (String [] args) {
		ThreadedTree newTree = new ThreadedTree();
		newTree.add('T');
		newTree.add('B');
		newTree.add('E');
		newTree.add('A');
		newTree.add('H');
		newTree.add('F');
		newTree.add('D');
		newTree.add('R');
		newTree.add('I');
		newTree.add('O');
		newTree.add('L');
		newTree.inorderLRTraversal();
		System.out.println();
		newTree.inorderRLTraversal();
	}
}
