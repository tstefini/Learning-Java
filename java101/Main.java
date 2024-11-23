// public class Main{
	//static double f(double x) {
	//		return 2 * x;
	//}
	//public static void main(String[] args) {
	//	double x = 3;

	//	;
	//			System.out.println("f(3): " + f(x));
	//	}
	
	//}

	public class Main {
		public static void main(String[] args) {
			int[] arr = {4, 3, 18, 31, 2, 8, 33, 3, 94};
	
			System.out.println(PracticeProblems.countOccurances(arr, 3));
	
			System.out.println(PracticeProblems.reverseArray(arr));

			double[][] grid = {
				{1.1, 2.2, 3.3},
				{4.4, 5.5, 6.6},
				{7.7, 8.8, 9.9}	};
        	System.out.println("The sum of the elements in the grid is:");
			System.out.println(PracticeProblems.sumGrid(grid));

			System.out.println(PracticeProblems.Fib(3));
		}
	}


	//hello