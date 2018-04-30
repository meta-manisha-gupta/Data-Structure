package com.metacube.arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {
	static int[] array = new int[5];
	static int i = 0;
	
	/**
	 * Below function adds the element in the list.
	 * @param element
	 */
	void addElement(int element) {
		if ( i == array.length ) {
			int array2[] = new int[array.length];
			array = Arrays.copyOf(array, array.length + 1);
			array[i++] = element;
		}
		else {
			array[i++] = element;
		}
	}
	
	/**
	 * Below function adds the element at particular location.
	 * @param element
	 * @param location
	 */
	void addElementAtLocation (int element, int location) {
		for ( int j = i; j >= location; j--) {
			array[j+1] = array[j];
		}
		array[location] = element;
	}
	
	/**
	 * Below function retrieves the element at particular location.
	 * @param location
	 * @return
	 */
	int elementAtLocation(int location) {
		return array[location];
	}
	
	/**
	 * Below function searches for the element in the list.
	 * @param element
	 */
	void searchElement(int element) {
		int flag = -1;
		for (int j = 0; j < i; j++ ) {
			if ( array[j] == element) {
				System.out.println("Element found at : "+(j+1));
			}
		}
		
	}
	
	/**
	 * Below function removes the element from specified location.
	 * @param location
	 */
	void removeElementAtLocation(int location) {
		for ( int j = 0; j <= i; j++) {
			if( j == location ){
				for ( int k = j; k <=i; k++) {
					array[k] = array[k+1];
				}
				i--;
			}
		}
		display();
	}
	
	/**
	 * Below function removes the element from the list.
	 * @param element
	 */
	void removeElement(int element) {
		for ( int j = 0; j <= i; j++) {
			if (array[j] == element) {
				for ( int k = j; k <i; k++) {
					array[k] = array[k+1];
				}
				i--;
			}
		}
		display();
	}
	
	/**
	 * Below function removes all the elements from the list.
	 * @param array
	 */
	void removeAllElements() {
		for (int j = 0; j < i; j++) {
			removeElement(array[j]);
		}
	}
	
	/**
	 * Below function reverse the list.
	 * @return
	 */
	int[] reverseList() {
		int size =  i;
		System.out.println(size);
		int reverseArray[] = new int[size];
		for ( int  j = 0; j < i; j++) {
			reverseArray[j] = array[--size];
			
		}
		return reverseArray;
	}
	
	/**
	 * Below function sorts the list.
	 * @return
	 */
	int[] sortList() {
		int []sortedArray = new int[i];
		System.arraycopy(array, 0, sortedArray, 0, i);
		int temp;
		for(int j = 0; j < sortedArray.length; j++) {  
            for(int k = 1; k < sortedArray.length; k++) {  
                     if(array[k-1] > sortedArray[k]) {   
                            temp = sortedArray[k-1];  
                            sortedArray[k-1] = sortedArray[k];  
                            sortedArray[k] = temp;  
                    }
            }
		} 
		return sortedArray;
	}
	
	void display() {
		for (int j = 0; j < i; j++){
			System.out.println(array[j]);
		}
	}
}
