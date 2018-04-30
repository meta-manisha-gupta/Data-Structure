package com.metacube.arraylist;

import java.util.Scanner;

public class ArrayListHandler {
	public static void main(String args[]) {
		ArrayList arrayInstance = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int element, location;
		do{
			int choice;
			System.out.println("***Menu***");
			System.out.println("1. Add element ");
			System.out.println("2. Adding element at particular location");
			System.out.println("3. Search element");
			System.out.println("4. Retrieving location of element");
			System.out.println("5. Removing element by location");
			System.out.println("6. Removing element");
			System.out.println("7. Clear list");
			System.out.println("8. Reverse list");
			System.out.println("9. Sort list");
			System.out.println("Enter ur choice");
			choice = scan.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter element");
					element = scan.nextInt();
					arrayInstance.addElement(element);
					break;
			case 2: System.out.println("Enter element");
					element = scan.nextInt();
					System.out.println("Enter location");
					location = scan.nextInt();
					arrayInstance.addElementAtLocation(element, location);
					break;
			case 3:System.out.println("Enter location");
				   location = scan.nextInt();
				   int result = arrayInstance.elementAtLocation(location);
				   System.out.println("Element at location : "+result);
				   break;
			case 4:System.out.println("Enter element");
				   element = scan.nextInt();
				   arrayInstance.searchElement(element);
				   break;
			case 5:System.out.println("Enter location");
				   location = scan.nextInt();
				   arrayInstance.removeElementAtLocation(location);
				   break;
			case 6:System.out.println("Enter element");
			   	   element = scan.nextInt();
			   	   arrayInstance.removeElement(element);
			   	   break;
			case 7: arrayInstance.removeAllElements();
				break;
			case 8:int resultantArray[] = arrayInstance.reverseList();	
				   for (int i = 0; i < resultantArray.length; i++) {
					   System.out.println(resultantArray[i]);
				   }
				   break;
			case 9:int sortedArray[] = arrayInstance.sortList();	
			       for (int i = 0; i < sortedArray.length; i++) {
				       System.out.println(sortedArray[i]);
			       } 
			       break;
		   default:
					System.out.println("Please enter a valid option");
			}
	}while(true);
	}
}
