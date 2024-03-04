// Write a function to print the sum of all odd numbers from 1 to n.

import java.io.*;
class FunctionTwo{

	static int printSum(int n){

		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2==1){
			sum=sum+i;
			}
		}

		return sum;
	}
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number:");

		int a = Integer.parseInt(br.readLine());

		int ans = printSum(a);

		System.out.println("Sum of odd numbers is :"+ans);
	}
}



