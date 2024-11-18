package QuetionsOnArrays;

import java.util.Scanner;

public class ReversePartOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = {10,20,30,40,50,60,70,80,90,100};
		// indexes ->    0  1  2  3  4  5  6  7  8  9
		
		//reverse array from index 2 to 7
		// ans = {10,20,80,70,60,50,40,30,90,100}
		
		System.out.println("enter two indices in which range you want to reverse array: ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		
		int n = array.length;
		System.out.print("Array before: ");
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		int i = i1, j = i2;
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
