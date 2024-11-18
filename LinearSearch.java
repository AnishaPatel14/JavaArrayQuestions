package QuetionsOnArrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		//find the first occurrence of target element in the array | if target exists then return its index else return -1
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the target: ");
		int target = sc.nextInt();
		int idx = -1;
		for(int i=0; i<n; i++) {
			if(arr[i]==target) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println(target+" not found in the array");
		} else {
			System.out.println(target+" found at index "+idx);
		}

	}

}
