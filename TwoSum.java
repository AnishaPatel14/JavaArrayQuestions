package QuetionsOnArrays;

public class TwoSum {

	public static void main(String[] args) {
		int array[] = {5,2,7,4};
		int x = 6;
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]+array[j] == x) {
					System.out.print("Indexes are: ("+i+","+j+")");
				}
			}
		}

	}

}
