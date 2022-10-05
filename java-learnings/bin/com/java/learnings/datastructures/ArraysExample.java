package com.java.learnings.datastructures;

import java.util.*;

public class ArraysExample {

	// define an array

	int[] myArray = { 24, 13, 7, 28, 1, 55 };

	// print an array
	void printForEach() {
		for (int i : myArray) {
			System.out.println("Arrays values are: " + i);
		}
	}

	void print(int[] myArray) {
		for (int j = 0; j <= myArray.length; j++) {
			System.out.println("Arrays values are: " + j);
		}
	}
	// reverse an array

	int[] reverseArray() {

		for (int i = myArray.length - 1; i >= 0; i--) {
			for (int j = 0; j <= myArray.length; j++) {
				myArray[j] = myArray[i];
			}
		}

		return myArray;
	}

	int[] reverseArrayUsingCollections() {

		Collections.reverse(Arrays.asList(myArray));
		return myArray;

	}

	// split array
	
	void splitArray() {
		int n = myArray.length;
		 
        int[] a = new int[(n + 1)/2];
 
        System.arraycopy(myArray, 0, a, 0, a.length);
        int[] b = Arrays.copyOfRange(myArray, (n + 1)/2, n);
        
        print(a);
        print(b);
 
	}

}
