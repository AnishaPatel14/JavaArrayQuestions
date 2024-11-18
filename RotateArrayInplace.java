package QuetionsOnArrays;

import java.util.Scanner;

public class RotateArrayInplace {
	
	public static void reverseArr(int array[], int i, int j) {
		while(i<j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = {10,20,30,40,50,60,70,80,90,100};
		// indexes ->    0  1  2  3  4  5  6  7  8  9
		
		int n = array.length;  // length of array
		
		System.out.println("enter number of steps for rotate array: ");
		int k = sc.nextInt();
		
		if(k>n) {
			k = k%n;
		}
		
		
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//actual process
		// 1. reverse array from 0 to n-k-1
		reverseArr(array,0,n-k-1);
		
		// 2. reverse array form n-k to n-1
		reverseArr(array,n-k,n-1);
		
		// 3. reverse array form 0 to n-1
		reverseArr(array,0,n-1);
		
		
		
		System.out.print("Rotated Array: ");
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}


	}

}
