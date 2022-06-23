package sorting;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int a[] = {4,3,2,1};
		// bubbleSort(a);
		// System.out.println(Arrays.toString(a));
		//bubbleSort(a);
		//selectionSort(a);
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

	/*public static void quickSort(int a[], int low, int high) {
		 if (low < high) {
			 
			 int pivot = partition(a ,0 ,a.length - 1);
			 quicksort(a[], 0, pivot -1);
			 quicksort(a[], pivot +1, a.length -1);
		 
			
		}
	}
	public static int partition(int a[], int low , int high) {
		int pivot = a[low];
		for(int i = low; i <= high;i++) {
			if (a[i] > pivot){
				swap(i, low, a);
				
				
			}
			
		}
		
		
		
		
		
	}*/

	public static void insertionSort(int arr[]) {
		int unsorted = 0;
		int i = 0;
		int value = 0;
		for (unsorted = 1; unsorted < arr.length; unsorted++) {
			value = arr[unsorted];
			for (i = unsorted; i > 0 && arr[i - 1] > value; i--) {
				System.out.println(Arrays.toString(arr));
				arr[i] = arr[i - 1];
			}
			arr[i] = value;
			
		}

	}

	public static void bubbleSort(int a[]) {
		int n = a.length;
		for (int j = n; j > 0; j--) {
			for (int i = 0; i < j - 1; i++) {

				if (a[i] > a[i + 1])
					swap(i, i + 1, a);
			}
		}
	}

	public static void selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					swap(min, j, a); // min = i;
					//int temp=a[min];
					//a[min]=a[j+1];
					//a[j+1]=temp;
					System.out.println(Arrays.toString(a));
				}
			}
		}
	}

	public static void swap(int p, int q, int a[]) {
		int temp = a[p];
		a[p] = a[q];
		a[q] = temp;

	}

}
