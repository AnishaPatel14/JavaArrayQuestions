package QuetionsOnArrays;

import java.util.Scanner;

public class RemoveDublicateElementFromSortedArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i=0, noOfUniques = 1;
		for(int j=1; j<arr.length; j++) {
			if(arr[j] != arr[i]) {	// if current element not equal to arr[i] element then 
				arr[i+1] = arr[j];  // put current element on i+1 th position
				i++; // increase i
				noOfUniques++;
 			}
		}
		
		for(int j = i+1; j<arr.length; j++) {
			arr[j] = 0;
		}
		
		System.out.println("Array after removing dublicates: ");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		
		System.out.println("\nNumber of unique elements in array: "+ noOfUniques);
		
	}

}
