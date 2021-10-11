package com.sujata.demo;

//Ordered Collection of Duplicate values
public class SingleLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	}

	Node head;

	public void insert(int data) {
		Node newNode = new Node(data, null);
		// if list is not there, make newly created node as fisrt node by pointing head
		// on newly created node
		if (head == null)
			head = newNode;
		else {
			// if list is there , move head to end of the list
			Node lastNode = head;
			while (lastNode.next != null)
				lastNode = lastNode.next;

			// Already we reached to the last node of the list, now attach newly created
			// node to the last
			lastNode.next = newNode;
		}

	}

	public void traverse() {
		Node iterator = head;
		while (iterator != null) {
			System.out.println(iterator.data);
			iterator = iterator.next;
		}
	}

	public void delete(int data) {
		// if list is there
		if (head != null) {
			// if Node which is supposed to be deleted is first Node
			if (head.data == data) {
				head = head.next;
			} 
			else {
				Node previousNode = head;
				// pointing previousNode to one node before the delete Node or either data don't
				// exist
				while ( previousNode.next != null && previousNode.next.data != data ) {
					previousNode = previousNode.next;
				}
				// if the data found which we want to delete
				if (previousNode.next != null) {
					previousNode.next = previousNode.next.next;
				}

			}
		}
	}
}
