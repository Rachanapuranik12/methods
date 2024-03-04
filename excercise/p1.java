// Enter 3 numbers from the user & make a function to print their average.

import java.io.*;
class FunctionOne{

	static int printAverage(int a,int b, int c){

		return (a+b+c)/3;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 3 numbers: ");

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		System.out.println("Average of numbers is: "+printAverage(a,b,c));
	}
}

