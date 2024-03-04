// Make a function to add two numbers and return the sum.

import java.io.*;
class FucntionAdd{
	static int calculateSum(int a, int b){

		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers: ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		int ans = calculateSum(a,b);
		System.out.println("Sum of 2 numbers is: "+ans);
	}
}


