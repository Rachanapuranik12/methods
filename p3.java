//Write a function to calculate factorial of number.

import java.io.*;
class FunctionFact{
	static void calculateFact(int n){
		int fact=1;
		int temp=n;
		while(n>=1){
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial of "+temp+" is "+fact);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number: ");

		int n = Integer.parseInt(br.readLine());
		
		calculateFact(n);
	}
}
