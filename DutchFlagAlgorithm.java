package QuetionsOnArrays;

public class DutchFlagAlgorithm {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {1,0,1,2,1,2,2,0,1,0,2,1,1,0};
		int n = arr.length;
		
		
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		// Dutch flag algorithm  
		int low = 0, mid = 0, high = n-1;
		
		while(mid<=high) {
			if(arr[mid] == 0) {
				//swap the element on mid and low
				swap(arr,low,mid);
				low++;
				mid++;
			}
			
			else if(arr[mid] == 1) mid++;
			
			if(arr[mid] == 2) {
				//swap the element on mid and high
				swap(arr,mid, high);
				high--;
			}
			
		}
		
		System.out.print("Array after: ");
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();

	}

}
