//Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.io.*;
class FunctionTen{

	static void fun(int n1,int n2){

		while(n1!=n2){

			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
		}
		System.out.println("GCD is: "+n2);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 2 numbers: ");

		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());

		fun(a,b);
	}
}


