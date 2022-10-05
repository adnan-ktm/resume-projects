package com.java.learnings.sorting;

public class RecursiveMergeSort {
	
	void merge(int arr[], int begin, int mid, int end) {

	    int n1 = mid - begin + 1;
	    int n2 = end - mid;

	    int subarray1[] = new int[n1];
	    int subarray2[] = new int[n2];

	    for (int i = 0; i < n1; i++)
	      subarray1[i] = arr[begin + i];
	    for (int j = 0; j < n2; j++)
	      subarray2[j] = arr[mid + 1 + j];

	    
	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = begin;

	    while (i < n1 && j < n2) {
	      if (subarray1[i] <= subarray2[j]) {
	        arr[k] = subarray1[i];
	        i++;
	      } else {
	        arr[k] = subarray2[j];
	        j++;
	      }
	      k++;
	    }	
	    while (i < n1) {
	      arr[k] = subarray1[i];
	      i++;
	      k++;
	    }
	    while (j < n2) {
	      arr[k] = subarray2[j];
	      j++;
	      k++;
	    }
	  }

	  // Divide the array into two subarrays, sort them and merge them
	  void mergeSort(int arr[], int begin, int end) {
	    if (begin < end) {	    
	      int mid = (begin + end) / 2;
	      mergeSort(arr, begin, mid);
	      mergeSort(arr, mid+ 1, end);	     
	      merge(arr, begin, mid, end);
	    }
	  }

}
