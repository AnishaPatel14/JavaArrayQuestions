package QuetionsOnArrays;

public class NextGreatestElementOptimalApproach {

	public static void main(String[] args) {
		int arr[] = {12,8,61,37,2,49,16,28,21};
		int ans[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		

		// last element of ans array will not have any greatest element
		ans[ans.length-1] = -1;
		
		int curMax = arr[arr.length-1];  // last element of arr
		for(int i = ans.length-2; i>=0; i--) {
			//fill current maximum in the ans array
			ans[i] = curMax;
			// find maximum between curMax and arr[i]
			 curMax = Math.max(curMax, arr[i]);
		}
		
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();

	}

}
