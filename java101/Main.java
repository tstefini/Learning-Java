public class Main {
	static int x=6;
	//static double[] arr = {4.5, 6, 9.0, 8};
	static boolean[] arr = new boolean[100];
	static int[][] board = new int[3][3];

	public static void main(String[] args) {
		//int x = 6;
		//System.out.println(x + 4);
		//System.out.println(x);
		//System.out.println(x % 2 == 0);

		//System.out.println("x: " + x);
		// reassigning the value of x to be the old x plus 4
		//x = x + 4;
		//System.out.println("new x: " + x);
		//System.out.println("so cool...bye");

		// to find the length of an array, use array.length
		//System.out.println("Hello World-an array example");
		//System.out.println(arr.length);
		//System.out.println("Hello World-end of an array example");

		//System.out.println("Hello World-an array of booleans");
		//System.out.println("the first element of array=");
		//System.out.println(arr[0]);
		//// setting the 4th element in arr to true
		//arr[3] = true;
		//System.out.println("the 4 element of array which is arr[3]=");
		//System.out.println(arr[0] || arr[3]);
		//System.out.println(arr.length);

		//2D arrarys are confusing
		// to start, let's extract the first row
		// (aka the first element in the array)
		int[] firstRow = board[0];
		// now, we'll get the first value in that row
		int firstVal = firstRow[0];
		System.out.println("print the first value of 3x3 array");
		System.out.println(firstVal);
		
		//or the below code is same as above-have to name it firstVal2 so the 
		//name is not same as first example

		int firstVal2 = board[0][0];
		System.out.println("print the first value of 3x3 array with diff code");
		System.out.println(firstVal2);

		//how do you print the who array??

		//stopping at loops....to be continued...
	}
}