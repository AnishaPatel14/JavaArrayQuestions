package QuetionsOnArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class InterSectionOfTwoSortedArray {
	
	public static ArrayList<Integer> intersectionOptimized(int []a, int []b){
		// time complexity :  O(n1+n2)
		// space complexity : O(1)
		int n1 = a.length;
		int n2 = b.length;
		
		ArrayList<Integer> interSection = new ArrayList<Integer>();
		int i = 0; 
		int j = 0;
		
		while(i<n1 && j<n2) {
			if(a[i] < b[j]) {
				i++;
			} 
			else if(b[j] < a[i]) {
				j++;
			}
			else { // both a[i] & b[j] are equal
				interSection.add(a[i]);
				i++;
				j++;
			}
		}
		
		return interSection;
	}
	
	public static ArrayList<Integer> intersectionBruteForce(int []a, int []b){
		// time complexity :  O(n1*n2)
				// space complexity : O(n2)
		int n1 = a.length;
		int n2 = b.length;
		
		ArrayList<Integer> interSection = new ArrayList<Integer>();
	
		//make array to track which element of b  is already have a paired with element of  a say it as visited array
		int visited[] = new int[n2];  // visited[i] = 1 -> means already paired | if visited[i] = 0 -> not paired
		
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				if(a[i]==b[j] && visited[j] == 0) {
					interSection.add(a[i]);
					visited[j] = 1;
					break;
				}
				if(b[j] > a[i]) break;
			}
		}
		return interSection;
	}
	
	public static void printArr(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// intersection of two sorted arrays : for every element in first array there has to be a corresponding element in the second array
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array 1: ");
		int n1 = sc.nextInt();
		int a[] = new int [n1];
		
		System.out.println("enter "+n1+" elements of a: ");
		for(int i=0; i<n1; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter the size of array 2: ");
		int n2 = sc.nextInt();
		int b[] = new int [n2];
		
		System.out.println("enter "+n2+" elements of b: ");
		for(int i=0; i<n2; i++) {
			b[i] = sc.nextInt();
		}
		
		//ArrayList<Integer> ans = intersectionBruteForce(a, b);
		ArrayList<Integer> ans = intersectionOptimized(a, b);
		printArr(a);
		printArr(b);
		System.out.println(ans);

	}

}
