package QuetionsOnArrays;

import java.util.Scanner;

public class SecondLargestElementBySinglePass {

	public static void main(String[] args) {
		
		//finding second largest element -: time complexity : O(n)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int firstLarge = arr[0], secondLarge = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = arr[i];
			}
			else if(arr[i] < firstLarge && arr[i] > secondLarge) {
				secondLarge = arr[i];
			}
		}
		

		System.out.println("First large element: "+ firstLarge);
		if(secondLarge == Integer.MIN_VALUE) {
			System.out.println("No second large exists");
		}else {
		System.out.println("Second large element: "+ secondLarge);
		}
	}

}
