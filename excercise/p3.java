//Write a function which takes in 2 numbers and returns the greater of those two.


import java.io.*;
class FunctionThree{
	static int printGreater(int a, int b){

		if(a>b){
			return a;
		}else{
			return b;
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two numbers: ");

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

//		int ans = printGreater(a,b);

		System.out.println("Greater number is :"+printGreater(a,b));
	}
}
