package QuetionsOnArrays;

public class SortArrayOfZeroOneTwo {

	public static void main(String[] args) {
		int arr[] = {1,0,2,2,1,1,0,0,1,2,2,0,1};
		int n = arr.length;
		int zeros=0, ones=0;
		
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// count the no of zeros and ones in the array
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) zeros++;
			else if(arr[i] == 1) ones++;
		}
		
		for(int i=0; i<n; i++) {
			if(i<zeros) arr[i] = 0;
			else if(i<zeros+ones) arr[i] = 1;
			else arr[i] = 2;
		}
		
		
		System.out.print("Array after: ");
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();

	}

}
