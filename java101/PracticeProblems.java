public class PracticeProblems {
//problem 1
		static int countOccurances(int[] arr, int n){
			int occurs =0;
			for (int i=0; i<arr.length; i++){
				if (arr[i]==n){
				occurs +=1;
				}
			}
			return occurs;
		}

//problem 2
		static String reverseArray (int[] arr){
			String reverseOrder = "(";
			for (int i = arr.length-1; i>=0; i--) {
				reverseOrder += arr[i];
				if (i != 0) {
					reverseOrder += ", ";
				}
			}
			return reverseOrder + ")";

			}
//problem 3
		static double sumGrid(double[][] grid) {
			double sum = 0.0;
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
						sum += grid[i][j];
					}
				}
				return sum;
			}
//problem 4			
	static int Fib (int n){
		int x=0; int y=1; int z=0;
		//using n-2 because the first 2 number was given 0,1
		for (int i=0; i<n-2; i++){;
			z=x+y;
			x=y;
			y=z;
		}
		return z;
	}
}


