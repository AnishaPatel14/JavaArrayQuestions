package QuetionsOnArrays;

public class MergeTwoSortedArray {
	public static void printArray(int arr[]){
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = {1,22,39};
		int b[] = {13,20,49,68};
		
		printArray(a);
		printArray(b);
		
		int ans[] = new int[a.length+b.length];
		
		int i = 0, j = 0, k = 0;  // i-> a | j-> b | k-> ans
		
		while(i<a.length && j<b.length) {  //merging a and b
			if(a[i] < b[j]) {
				ans[k] = a[i];
				i++;
			}
			else{
				ans[k] = b[j];
				j++;
			}
			
			k++; // k will always increase
		}
		
		//if a has still some element
		while(i<a.length) {
			ans[k] = a[i];
			k++;
			i++;
		}
		
		//or if b has still some element
		while(j<b.length) {
			ans[k] = b[j];
			k++;
			j++;
		}
		
		printArray(ans);

	}

}
