package QuetionsOnArrays;

import java.util.Scanner;

public class FindPivotIndexLeetcode724 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array 1: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		System.out.println("enter "+n+" elements of arr: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int pivot = findPivotIndex(arr);
		System.out.println("Pivot index = "+pivot);		

	}

	private static int findPivotIndex(int[] arr) {
		int n = arr.length;
		
		//make prefix sum array both forward as well as backward
		
		int prefixForward[] = new int [n];  // store prefix sum from forward 
		prefixForward[0] = arr[0];
		for(int i=1; i<n; i++) {
			prefixForward[i] = prefixForward[i-1] + arr[i];
		}
		
		
		int prefixBackward[] = new int [n];	// store prefix sum from backward
		prefixBackward[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			prefixBackward[i] = prefixBackward[i+1] + arr[i];
		}
		
		
		for(int i=0; i<n; i++) {
			if(prefixForward[i] == prefixBackward[i]) {
				return i;
			}
		}
		
		
		return -1;
		
		
	}

}
