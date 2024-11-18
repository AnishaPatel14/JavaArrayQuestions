package QuetionsOnArrays;

public class ReverseArrayWithoutUsingExtraArray {

	public static void main(String[] args) {
		
		int [] array = {10,20,30,40,50,60};
		// indexes ->    0  1  2  3  4  5
		
		int n = array.length;
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		// Approach 1 
		// swap indexes : 0 -> 5 | 1 -> 4 | 2 -> 3 |
	// sum of both indexes:  5        5        5    -> that is n-1 
		// so formula : i+j = n-1 => j = n-1-i
//		for(int i=0; i<n/2; i++) {
//			//swap 
//			int temp = array[i];
//			array[i] = array[n-1-i];
//			array[n-1-i] = temp;
//		}
		
		
		// Approach 2 -> Two Pointer
		int i = 0, j = n-1;
		while(i<j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		
		
		System.out.print("Array after: ");
		for(i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
