package QuetionsOnArrays;

import java.util.Scanner;

public class LeftRotateArrayByKPlace {
	
	public static void leftRotateArrByOnePlace(int []arr) {   //time complexity = O(n) | space complexity = O(1)
		//arr = {1,2,3,4,5}  after rotating by one place -> {2,3,4,5,1}
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];  // move every element one place left from 1st index
		}
		arr[arr.length-1] = temp; // put first element at the end
	}
	
	public static void leftRotateArrByKPalce(int []arr , int k) {
		int n  = arr.length;
		// step 1: make a temp array
		int temp[] = new int[k];
		for(int i=0; i<k; i++) {
			temp[i] = arr[i]; // copy first k element of arr to temp
		}
		
		
		//step 2: shift other elements towards left
		for(int i=k; i<n; i++) {
			arr[i-k] = arr[i];
		}
		
		//step 3: put back temp array in the arr
		int j = 0;
		for(int i=n-k; i<n; i++) {
			arr[i] = temp[j++];
		}
	}
	
	public static void leftRotateArrOptimizedSolution(int arr[], int k) {
		int n  = arr.length;
		reverseArr(arr,0,k-1);  //reverse arr from 0 to k-1 index
		reverseArr(arr,k,n-1);	//reverse arr from k to n-1 index
		reverseArr(arr,0,n-1);	//reverse whole array
	}
	
	public static void reverseArr(int array[], int i, int j) {
		while(i<j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void printArr(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
//		leftRotateArrByOnePlace(arr);
//		printArr(arr);
		
		System.out.println("enter the number of place do you want to roatate: ");
		int k = sc.nextInt();
		
		k = k%n;  // if k is greater than n 
		
		//leftRotateArrByKPalce(arr,k);
		leftRotateArrOptimizedSolution(arr,k);
		
		printArr(arr);
	}

}
