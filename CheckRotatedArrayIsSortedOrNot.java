package QuetionsOnArrays;

public class CheckRotatedArrayIsSortedOrNot {
	
//	leetcode Q. 1752 Check if Array Is Sorted and Rotated
//	Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
//	There may be duplicates in the original array.


	
	 public static void reverseArr(int arr[],int i, int j){
	        while(i<j){
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }
	 
	 
	    public static boolean check(int[] nums) {
	        int falt = 0;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i-1] > nums[i]){
	                falt = i;  // from this index sorted order is break
	            }
	        }
	        
	        //reverse part 1 
	        reverseArr(nums, 0,falt-1);
	        //reverse part 2
	        reverseArr(nums,falt, nums.length-1);
	        // reverse whole array
	         reverseArr(nums, 0, nums.length-1);
	        
	        boolean isSorted = true;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i-1] > nums[i]){
	                isSorted = false;
	                break;
	            }
	        }
	        
	        return isSorted;
	    }

	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		System.out.println("is array rotated and sorted: "+ check(arr));
	}

}
