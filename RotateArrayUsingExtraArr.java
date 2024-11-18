package QuetionsOnArrays;

import java.util.Scanner;

public class RotateArrayUsingExtraArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = {10,20,30,40,50,60,70,80,90,100};
		// indexes ->    0  1  2  3  4  5  6  7  8  9
		
		int n = array.length;  // length of array
		
		System.out.println("enter number of steps for rotate array: ");
		int k = sc.nextInt();
		
		if(k>n) {   // when k is greater than n
			k = k%n;
		}
		
		
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
		// actual process 
		int ans[] = new int [n];
		int j = k;
		int l = 0;
		// fill answer array from index k 
		while(j<n) {
			ans[j] = array[l];
			l++;
			j++;
		}
		
		// fill last kth element in answer array
		for(int i=0; i<k; i++) {
			ans[i] = array[l];
			l++;
		}
		//System.out.println(l +" "+ j+" "+k);
		
		System.out.print("Rotated Array: ");
		for(int i=0; i<n; i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
