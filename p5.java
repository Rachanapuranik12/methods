// Make a function to print the table of given number.

import java.io.*;
class FunctionTable{
	static void printTable(int n){

		for(int i=1;i<=10;i++){
			System.out.println(n*i);
		}
	}
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number: ");

		int a = Integer.parseInt(br.readLine());
		printTable(a);
	}
}
