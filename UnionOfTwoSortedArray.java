package QuetionsOnArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArray {
	public static void printArr(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// union of two sorted array should contain only unique elements present in the both arrays
		// time complexity : O(n1+n2)
		// space complexity : O(n1+n2) -> for return the list of union elements
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array 1: ");
		int n1 = sc.nextInt();
		int arr1[] = new int [n1];
		
		System.out.println("enter "+n1+" elements of arr1: ");
		for(int i=0; i<n1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("enter the size of array 2: ");
		int n2 = sc.nextInt();
		int arr2[] = new int [n2];
		
		System.out.println("enter "+n2+" elements of arr2: ");
		for(int i=0; i<n2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		ArrayList<Integer> union = new ArrayList<Integer>();
		
		int i = 0, j = 0;
		
		while(i<n1 && j<n2) {
			if(arr1[i] < arr2[j]) {
				if(union.size()==0|| union.get(union.size()-1) != arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
			} 
			else {
				if(union.size()==0||union.get(union.size()-1) != arr2[j]) {
				union.add(arr2[j]);
				}
				j++;
			}
		}
		
		while(i<n1) {
			if(union.get(union.size()-1) != arr1[i]) {
				union.add(arr1[i]);
			}
			i++;
		}
		
		while(j<n2) {
			if(union.get(union.size()-1) != arr2[j]) {
				union.add(arr2[j]);
			}
			j++;
		}
		
		printArr(arr1);
		printArr(arr2);
		System.out.println(union);

	}

}
