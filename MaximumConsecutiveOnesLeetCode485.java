package QuetionsOnArrays;

import java.util.Scanner;

public class MaximumConsecutiveOnesLeetCode485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int nums[] = new int [n];
		
		System.out.println("enter "+n+" elements of array: ");
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int max = 0; // maximum no of consecutive 1's
        int count = 0; // count the ones in consecutive order
        
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else{
               count = 0; 
            }
            
        }
        
        System.out.println("Maximun consecutive one's are: "+ max);

	}

}
