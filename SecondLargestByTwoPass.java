package QuetionsOnArrays;

import java.util.Scanner;

public class SecondLargestByTwoPass {

	public static void main(String[] args) {
		
		//finding second largest element -: time complexity : O(2n)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//find first largest -> pass 1
		int firstLarge = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i] > firstLarge) {
				firstLarge = arr[i];
			}
		}
		
		//now find second largest  -> pass 2
		int secondLarge = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] != firstLarge && arr[i] > secondLarge) {
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
