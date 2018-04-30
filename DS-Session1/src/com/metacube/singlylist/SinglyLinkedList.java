package com.metacube.singlylist;

public class SinglyLinkedList {
	Node head = null;								//Points to the first node in the Linked List.
	/**
	 * Below function inserts node in the Linked list.
	 * @param element
	 */
	public void insertion(int element) {
		Node node = new Node(element);
		if( head == null ) {
			head = node;
		}
		else {
			Node q = head;
			while ( q.next != null ) {
				q = q.next;
			}
			q.next = node;
		}
		display();
	}
	
	/**
	 * Below function inserts the particular element at specific location.
	 * @param element
	 * @param location
	 */
	public void insertAtLocation (int element, int location) {
		int loc = 1;
		Node node = new Node(element);
		if ( location == 0 ) {
			System.out.println("invalid location");
		}
		else {
			if ( location == 1) {
				node.next = head;
				head = node;
			}
			else {
			Node q, prev = null;
			q = head;
			while ( q.next != null ) {
				if ( loc == location){
					break;
				}
				else{
				prev = q;
				q = q.next;
				}
				loc++;
			}
				node.next = prev.next;
				prev.next = node;
			}
			display();
		}
	}
	
	/**
	 * Below function removes the particular element from the Linked list.
	 * @param element
	 */
	public void removeElement (int element) {
		if ( head == null) {
			System.out.println("List is empty");
		}
		else if ( head.data == element) {
			head = head.next;
		}
		else {
		Node q, current = null;
		q = head;
		current = q.next;
		while ( q != null ) {
			if ( current.data == element) {
				q.next = current.next;
			}
			q = q.next;
			current = current.next;
		}
		}
		display();
	}
	
	/**
	 * Below function removes the element on the basis of its location specified.
	 * @param location
	 */
	public void removeElementAtLocation (int location) {
		if ( head == null) {
			System.out.println("List is empty");
		}
		else if (location == 0) {
			head = head.next;
		}
		else{
		Node q, current = null;
		q = head;
		current = q.next;
		int loc = 1;
		while ( q != null) {
			if( loc == location) {
				q.next = current.next;
			}
			q = q.next;
			current = current.next;
			loc++;
		}
		}
		display();
 	}
	 
	/**
	 * Below function retrieves element on basis of location.
	 */
	public void retrieveElement(int location) {
		if ( location == 0 ){
			System.out.println(head.data);
		}
		else {
			int loc = 1;
			Node q = head;
			while ( loc != location) {
				q = q.next;
				loc++;
			}
			System.out.println(q.data);
		}
	}
	/**
	 * Below function reverse the Linked list.
	 */
	public void reverseList() {
		Node p = null, q = null,  current = head;
		while( current != null) {
			q = current.next;
			current.next = p;
			p = current;
			current = q;
		}
		head = p;
		display();
	}
	
	public void sortList(){
		int temp;
		Node q, p = null;
		q = head;
		while ( q != null ) {
			p = q.next;
			while ( p != null ) {
				if ( p.data > p.next.data ) {
					temp = p.data;
					p.data = p.next.data;
					p.next.data = temp;
				}
			p = p.next;
			}
			q = q.next;
		}
		display();
	}
	
	/**
	 * Below function displays elements in the list.
	 */
	public void display() {
		Node q = head;
		while( q != null) {
			System.out.println(q.data);
			q = q.next;
		}
	}
}
