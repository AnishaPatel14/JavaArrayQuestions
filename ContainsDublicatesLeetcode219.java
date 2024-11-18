package QuetionsOnArrays;

public class ContainsDublicatesLeetcode219 {
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        
       // brute force : tc = O(n^2) | sc = O(1)  -> TLE
//         for(int i=0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i] == nums[j] && Math.abs(i-j) <= k){
//                     return true;
//                 }
//             }
//         }
//         return false;
        
        // TWO POINTER
        int i = 0;
        for(int j=1; j<n; j++) {
        	if(nums[i] == nums[j] && Math.abs(i-j) <= k) return true;
        	else {
        		j++;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
	int arr[] = {1,0,1,1};
	int k = 1;
	System.out.println(containsNearbyDuplicate(arr, k));

	}

}
