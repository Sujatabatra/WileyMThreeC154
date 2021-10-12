package com.sujata.demo;

public class BinarySearchTree {
	
	class Node{
		int key;
		Node left,right;
		public Node(int key) {
			super();
			this.key = key;
		}
	}
	
	Node root;
	
	public void insertValue(int value) {
		root=insertNode(root, value);
	}
	private Node insertNode(Node root,int key) {
		//if tree is empty, create a new node and return
		if(root==null) {
			root=new Node(key);
			return root;
		}
		
		//if the tree is not empty, recur down the tree
		if(key<root.key)
			root.left=insertNode(root.left, key);
		else if(key>root.key)
			root.right=insertNode(root.right, key);
		
		return root;
		
	}
	
	public void inorderTraversal() {
		inorderElement(root);
	}
	
	private void inorderElement(Node root) {
		if(root!=null) {
			inorderElement(root.left);
			System.out.println(root.key);
			inorderElement(root.right);
		}
	}

}
