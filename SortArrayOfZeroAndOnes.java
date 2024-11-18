package QuetionsOnArrays;

public class SortArrayOfZeroAndOnes {

	public static void main(String[] args) {
		int arr[] = {1,0,1,1,0,1,0,1,1};
		int n = arr.length;
		
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int zeros = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) zeros++;
		}
		
//		int i;
//		for(i=0; i<zeros; i++) {
//			arr[i] = 0;
//		}
//		for(int j = i; j<n; j++) {
//			arr[j] = 1;
//		}
		
		
		for(int i=0; i<n; i++) {
			if(i<zeros) arr[i] = 0;
			else arr[i] = 1;
		}
		
		System.out.print("Array after: ");
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();

	}

}
