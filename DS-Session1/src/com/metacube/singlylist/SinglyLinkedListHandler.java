package com.metacube.singlylist;

import java.util.Scanner;

public class SinglyLinkedListHandler {
	public static void main(String args[]) {
		SinglyLinkedList singlyLikedListInstance = new SinglyLinkedList();
		Scanner scan = new Scanner(System.in);
		int element, location;
		do{
			int choice;
			System.out.println("***Menu***");
			System.out.println("1. Insert element ");
			System.out.println("2. Inserting element at particular location");
			System.out.println("3. Remove element");
			System.out.println("4. Removing element at particular location");
			System.out.println("5. Reverse list");
			System.out.println("6. Retrieve element on basis of location");
			choice = scan.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter element");
					element = scan.nextInt();
					singlyLikedListInstance.insertion(element);
					break;
			case 2: System.out.println("Enter element");
					element = scan.nextInt();
					System.out.println("Enter location");
					location = scan.nextInt();
					singlyLikedListInstance.insertAtLocation(element, location);
					break;
			case 3:System.out.println("Enter element");
				   element = scan.nextInt();
				   singlyLikedListInstance.removeElement(element);
				   break;
			case 4:System.out.println("Enter location");
				   location = scan.nextInt();
				   singlyLikedListInstance.removeElementAtLocation(location);
				   break;
			case 5:singlyLikedListInstance.reverseList();
				   break;
			case 6:System.out.println("Enter location");
			       location = scan.nextInt();
				   singlyLikedListInstance.retrieveElement(location);
				   break;
			default:
				System.out.println("Please enter a valid option");   	   
			}
		}while(true);
}
}
