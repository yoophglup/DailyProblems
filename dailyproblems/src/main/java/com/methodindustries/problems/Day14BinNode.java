package com.methodindustries.problems;


public class Day14BinNode {
	// class to create nodes
	static class Node {
	  int key;
	  Node left, right;

	  public Node(int item) {
	  key = item;
	  left = right = null;
	  }
	}

	static class BinaryTree {
	  Node root;

	  // Traverse tree
	  public void traverseTree(Node node) {
	    if (node != null) {
	      traverseTree(node.left);
	      System.out.print(" " + node.key);
	      traverseTree(node.right);
	    }
	  }
	}
}
