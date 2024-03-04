//Make a function to multiply two numbers and return the product.


import java.io.*;
class FunctionMul{

	static int calculateProd(int a, int b){
		return a*b;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers: ");

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("Product of 2 numbers is: "+calculateProd(a,b));
	}
}
