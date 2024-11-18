package QuetionsOnArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveAllZerosAtTheEndOfTheArray {
	
	public static void moveZerosOptimized(int []arr) {  // tc = O(n) || sc = O(1)
//		step1 : first zero in the array
		int j = -1; // index of first zero
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		
//		step2 : swap zero to non zero element
		for(int i = j+1; i<arr.length; i++) {
			if(arr[i] != 0) {
				// swap them
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
	}
	
	public static void moveZerosBrute(int []arr) {  //tc = O(2n)  || sc = O(x) where x = number of non zero elements in the array
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {   // store all none zeros number to the temp
			if(arr[i] != 0) temp.add(arr[i]);
		}
		
		// fill all none zero number to arr
		for(int i=0; i<temp.size(); i++) {
			arr[i] =  temp.get(i);
		}
		
		//at remainning places fill zeros
		for(int i=temp.size(); i<arr.length; i++) {
			arr[i] = 0;
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
		
		System.out.println("Array before: ");
		printArr(arr);
		
		//moveZerosBrute(arr);
		moveZerosOptimized(arr);
		
		System.out.println("Array After: ");
		printArr(arr);

	}

}
