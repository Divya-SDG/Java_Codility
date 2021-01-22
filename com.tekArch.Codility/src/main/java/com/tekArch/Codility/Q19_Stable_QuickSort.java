package com.tekArch.Codility;

import java.util.Arrays;

/*Stable algorithm: A  sorting algorithm is stale if  two  pairs wit equal values are not reordered during the sorting process.
 * Eg: [{pop,00},{div,9},{hop, 9}]. In this case the order of div and hop may not be the same  always. 
 * so its unstable.If the output sorted order maintains input order then its stable.Eg: merge sort, insertion sort, selection sort.
 * quick sort, heap sort are unstable. But unstable can be made stable by  following the technique of comparision of keys.
 * 
 * Algorithm of quicksort:
 * quicksort is divide and conquer. pick pivot element- any way( front, end, middle, random) and partition around the element 
 * like all small less than x and all greater than x.
 */

public class Q19_Stable_QuickSort {
	public static void main(String[] args) {
		Integer[] array = {50, 70, 10, 40, 50 };
		quicksort(array, 0, array.length - 1);
		System.out.println("After sorting : ");
		System.out.println(Arrays.toString(array));
	}

	public static void quicksort(Integer[] a, int low, int high) {
		 if (a == null || a.length == 0){
	            return;
	        }
	         if (low >= high){
	            return;
	        }
	 
		int middle = low + (high-low) / 2;
		int pivot = a[middle];
		int i = low, j = high;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}

		System.out.println(low);
		System.out.println(j);
		if (low < j) {
			quicksort(a, low, j);
		}
		if (high > i) {
			quicksort(a, i, high);
		}

	}

	public static void swap(Integer[] ar, int x, int y) {
		int temp;

		temp = ar[x];
		ar[x] = ar[y];
		ar[y] = temp;
	}

}
