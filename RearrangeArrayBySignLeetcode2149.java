package QuetionsOnArrays;

import java.util.Scanner;

public class RearrangeArrayBySignLeetcode2149 {
	
//	You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
//	You should return the array of nums such that the the array follows the given conditions:
//	Every consecutive pair of integers have opposite signs.
//	For all integers with the same sign, the order in which they were present in nums is preserved.
//	The rearranged array begins with a positive integer.
//	Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
//	Example 1:
//	Input: nums = [3,1,-2,-5,2,-4]
//	Output: [3,-2,1,-5,2,-4]
	
	
    public static int[] rearrangeArray(int[] nums) { //tc = O(n) | sc  = O(n)
        int n = nums.length;
        int ans[] = new int[n];
        
        //fill +ve numbers
        int even = 0, odd = 1;
        for(int i=0; i<n; i++) {
        	if(nums[i] > 0) {  // positive number
        		ans[even] = nums[i];
        		even += 2;
        	} else {  //negative number
        		ans[odd] = nums[i];
        		odd += 2;
        	}
        }
        
        return ans;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans[] = rearrangeArray(arr);
		for(int i=0; i<n; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
