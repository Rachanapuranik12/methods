//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x raised to n.

import java.io.*;
class FunctionEight{

	static int print(int x, int n){

		int ans=1;

		for(int i=1;i<=n;i++){
			ans=ans*x;
		}

		return ans;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter x:");
		int x = Integer.parseInt(br.readLine());


		System.out.println("Enter n: ");
		int n = Integer.parseInt(br.readLine());

		System.out.println("Answer is: "+print(x,n));
	}
}



