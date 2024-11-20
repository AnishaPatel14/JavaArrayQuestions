package QuetionsOnArrays;

import java.util.Scanner;

public class MaximumSubArraySumLeetcode53 {
	
	 public static int maxSubArray(int[] nums) {
		 
	        //brute - better : tc =  O(n^2) | sc = O(1)
	        // int maxSum = Integer.MIN_VALUE;
	        // for(int i=0; i<nums.length; i++){
	        //     int sum = 0;
	        //     for(int j=i; j<nums.length; j++){
	        //         sum += nums[j];
	        //         maxSum = Math.max(sum, maxSum);
	        //     }
	        // }
	        // return maxSum;
		 
	        
	        //optimal approach  tc = O(n) | sc = O(1)
	        
	        int sum = 0, maxSum = Integer.MIN_VALUE;
	        for(int i=0; i<nums.length; i++){
	            sum = sum + nums[i];
	            
	            if(sum > maxSum) maxSum = sum;
	            
	            if(sum < 0) {   // if sum is -ve do not take this to forward
	                sum = 0;
	            }
	        }
	        return maxSum;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

			int maxSum = maxSubArray(arr);
			System.out.println("maximum sum =  "+maxSum);
	}

}
