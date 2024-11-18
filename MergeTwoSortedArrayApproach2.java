package QuetionsOnArrays;

public class MergeTwoSortedArrayApproach2 {
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
		
		int i = a.length-1, j = b.length-1, k = ans.length-1;  // i-> a | j-> b | k-> ans
		
		while(i>=0 && j>=0) {  //merging a and b backward
			if(a[i] > b[j]) {
				ans[k] = a[i];
				i--;
			}
			else {
				ans[k] = b[j];
				j--;
			}
			k--; // k will always increase
		}
		
		//if a has still some element
		while(i>=0) {
			ans[k] = a[i];
			k--;
			i--;
		}
		
		//or if b has still some element
		while(j>=0) {
			ans[k] = b[j];
			k--;
			j--;
		}
		
		printArray(ans);

	}

}
