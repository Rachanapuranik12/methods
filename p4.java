//Make a function to check if number is prime or not.

import java.io.*;
class FunctionPrime{

	static void calculatePrime(int n){

		int cnt=0;

		for(int i=1;i<=n;i++){
			if(n%i==0){
				cnt++;
			}
		}

		if(cnt==2){
			System.out.println("Prime number");
		}else{
			System.out.println("Not a Prime number");
		
		}
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");

		int a = Integer.parseInt(br.readLine());

		calculatePrime(a);
	}
}
