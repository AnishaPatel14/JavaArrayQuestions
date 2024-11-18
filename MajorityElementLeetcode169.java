package QuetionsOnArrays;

import java.util.Scanner;

public class MajorityElementLeetcode169 {
	
	public static int majorityElementOptimized(int [] arr) {
		int n = arr.length;
		int count = 0;
		int majorEle = 0;
		for(int i=0; i<n; i++) {
			if(count == 0) {
				count = 1;
				majorEle = arr[i];
			}
			else if(arr[i] == majorEle) {
				count++;
			}
			else {
				count--;
			}
		}
		
		int count1 = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == majorEle) count1++;
		}
		
		if(count1 > (n/2)) return majorEle;
		return -1;
	}
	
	public static int majorityElementBrute(int[] arr) { //Brute force : tc O(n^2)  | sc = O(1)
		int n = arr.length;

		for(int i=0; i<n; i++) {
			int count = 0; 
			for(int j=0; j<n; j++) {
				if(arr[i] == arr[j]) count++;
			}
			if(count > (n/2)) return arr[i];
		}
		
		return -1;
	}
	
//	public static int majorityElementBrute1(int[] arr) {  // work only for positive numbers
//		
//		int n = arr.length;
//		int max = Maximum(arr); // maximum element in arr
//		int occ[] = new int [max+1];
//		
//		for(int i=0; i<n; i++) {
//			occ[arr[i]]++;
//		}
//		
//		for(int i=0; i<occ.length; i++) {
//			if(occ[i] > (n/2)) return i;
//		}
//		
//        return -1;
//    }
//	
//	
//
//	private static int Maximum(int[] arr) {
//		int max = arr[0];
//		for(int i=0; i<arr.length; i++) {
//			max = Math.max(max, arr[i]);
//		}
//		
//		return max;
//	}



	public static void main(String[] args) {
//		Given an array nums of size n, return the majority element.
//		The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.		 
//		Example 1:
//		Input: nums = [3,2,3]		Output: 3		
//		Example 2:
//		Input: nums = [2,2,1,1,1,2,2]	Output: 2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//int MajorityEle = majorityElementBrute1(arr);
		
		///int MajorityEle = majorityElementBrute(arr);
		
		int MajorityEle = majorityElementOptimized(arr);
		
		System.out.println("majorityElement = "+ MajorityEle);
		
		

	}



}
