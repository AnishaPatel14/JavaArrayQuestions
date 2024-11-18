package QuetionsOnArrays;

import java.util.Scanner;

public class SingleNumberLeetcode136 {
	
	public static int singleNumBest(int nums[]) {	// tc = O(n) | sc = O(1)
		int n = nums.length;
		 int xor = 0;
         
	        for(int i=0; i<n; i++){
	            xor = xor ^ nums[i];
	        }
	    
	        return  xor;
	}
	
	public static int singleNumBetter(int nums[]) { // tc = O(3n) | sc = O(max+1)
		
		int n = nums.length;
		
		// find max element in nums;
		 int maxEle = maximum(nums);
		 
		 
		 //make a occurence array of size maxEle+1
		 int occurence[] = new int[maxEle+1];
		 
		 //mark occurence of all elements in the nums array
		 for(int i=0; i<n; i++) {
			 occurence[nums[i]]++;
		 }
		 
		 //iterate over the occurence element and return that element who has occurence  of 1
		 for(int i=0; i<n; i++) {
			 if(occurence[i] == 1) return i;
		 }
		 
		return 0;
	}
	
	public static int singleNumBrute(int nums[]) {  // tc = O(n^2) | sc = O(1)
		int n = nums.length;
		for(int i=0; i<n; i++){
			// do linear search of every element in the array | return that element whose occurence is 1
            int num = nums[i];
            int occ = 0;
           //search num in the array
            for(int j=0; j<n; j++){
                if(nums[j] == num){
                    occ++;
                }
            }
            if(occ == 1) return nums[i];
        }
        return 0;
	}
	
	public static int maximum(int arr[]) {
		int n = arr.length;
		int max = arr[0];
		for(int i = 0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		 return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int nums[] = new int [n];
		
		System.out.println("enter "+n+" elements of array: ");
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		
		int singleNum = singleNumBest(nums);
		
		System.out.println("single number in array: "+ singleNum);

	}

}
