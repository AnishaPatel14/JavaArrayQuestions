package QuetionsOnArrays;

public class SortZeroOneByTwoPointer {

	public static void main(String[] args) {
		int arr[] = {1,0,0,1,1,0};
		int n = arr.length;
		
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int i = 0, j = n-1;
		while(i<j) {
			
			if(arr[i] == 0) i++;  //left side having 0 
			
			if(arr[j] == 1) j--;  // right side having 1
			
			if(i<j) {
				if(arr[i] == 1 && arr[j] == 0) {
				//swap them 
				arr[i] = 0;
				arr[j] = 1;
				i++;
				j--;
				}
			}
		}
		
		System.out.print("Array after: ");
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
	}

}
