package com.sujata.demo;

public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int key) {
			super();
			this.key = key;
		}
	}

	Node root;

	public void insertValue(int value) {
		root = insertNode(root, value);
	}

	private Node insertNode(Node root, int key) {
		// if tree is empty, create a new node and return
		if (root == null) {
			root = new Node(key);
			return root;
		}

		// if the tree is not empty, recur down the tree
		if (key < root.key)
			root.left = insertNode(root.left, key);
		else if (key > root.key)
			root.right = insertNode(root.right, key);

		return root;

	}

	public void inorderTraversal() {
		inorderElement(root);
	}

	private void inorderElement(Node root) {
		if (root != null) {
			inorderElement(root.left);
			System.out.println(root.key);
			inorderElement(root.right);
		}
	}

	public void deleteElement(int value) {
		root = deleteNode(root, value);
	}

	private Node deleteNode(Node root,int key) {
		
		//if the tree is empty
		if(root==null)
			return root;
		
		//otherwise, recur down the tree
			if(key<root.key)
				root.left=deleteNode(root.left,key);
			else if(key>root.key)
				root.right=deleteNode(root.right, key);
			//this is the key , which we want to delete
			else {
				//node with one child
				if(root.left==null)
					return root.right;
				else if(root.right==null)
					return root.left;
				//Need to find either the right subtree smallest element(We are doing this)
				// or find the left subtree highest element
				root.key=minValue(root.right);
				
				root.right=deleteNode(root.right, root.key);
				
			}
			return root;
			
	}
	
	
	int minValue(Node root) {
		int minVal=root.key;
		while(root.left!=null) {
			minVal=root.left.key;
			root=root.left;
		}
		return minVal;
	}
}
