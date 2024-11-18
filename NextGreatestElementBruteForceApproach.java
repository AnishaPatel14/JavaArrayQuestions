package QuetionsOnArrays;

public class NextGreatestElementBruteForceApproach {

	public static void main(String[] args) {
		int arr[] = {12,8,41,37,2,49,16,28,21};
		int ans[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// last element of ans array will not have any greatest element
		ans[ans.length-1] = -1;
		
		for(int i=0; i<arr.length-1; i++) {
			
				int max = arr[i+1];
				for(int j = i+1; j<arr.length; j++) {
					if(arr[j] > max) max = arr[j];
				}
				ans[i] = max;
		}
		
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();

	}

}
