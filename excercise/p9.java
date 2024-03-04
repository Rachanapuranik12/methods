//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 .....


import java.io.*;
class FunctionNine{

	static void fun(int n){

		int a=0;
		int b=1;

		System.out.print(a+" "+b+" ");

		for(int i=1;i<=n-2;i++){
			int c=a+b;
			System.out.print(c+" ");

			a=b;
			b=c;
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter n: ");
		int s = Integer.parseInt(br.readLine());

		fun(s);
	}
}


