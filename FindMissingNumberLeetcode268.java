package QuetionsOnArrays;

import java.util.Scanner;

public class FindMissingNumberLeetcode268 {
	
	public static  int findMissingMostOptimal(int []arr) {		// tc : O(n) || sc : O(1)
		int n = arr.length;
		int xor1 = 0;  int xor2 = 0;
		for(int i=0; i<n-1; i++) {
			xor1 = xor1 ^ (i+1);
			xor2 = xor2 ^ arr[i];
		}
		
		xor1 = xor1 ^ n;
		
		return (xor1 ^ xor2);
		
	}
	
	public static  int findMissingOptimal(int []arr) {		// tc : O(n) || sc : O(1)
		int n = arr.length;
		int sum  = (n*(n+1))/2;     //sum from 0 to n
		
		//find the sum of array
		int sum2=0;
		for(int i=0; i<n; i++) {
			sum2 += arr[i];
		}
		return (sum-sum2);
	}
	
	public static  int findMissingBetter(int []arr) {		// tc : O(2n) || sc : O(n+1)
		// make a occurence array for arr
		int n = arr.length;
		int occ[] = new int[n+1];
		for(int i=0; i<n; i++) {
			occ[arr[i]]++;
		}
		
		for(int i=0; i<occ.length; i++) {
			if(occ[i] == 0) return i;
		}
		return -1;
	}
	
	public static  int findMissingBrute(int []arr) {   // tc : O(n*n) || sc : O(1)
		int n = arr.length;
		for(int i=1; i<=n; i++) {
			boolean flag = false;
			for(int j=0; j<n; j++) {
				if(arr[j] == i) { flag = true;
				break;
				}
			}
			if(flag == false) {
				return i;
			}
		}
		return -1;
		
	}
	

	public static void main(String[] args) {
//		Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//				Example 1:
//				Input: nums = [3,0,1]
//				Output: 2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int missingNum = findMissingOptimal(arr);
		System.out.println("MissingNumber in the range of 0 and "+n+ " is: " +missingNum);

	}

}
