//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.io.*;
class FunctionFive{

	static boolean printEligible(int age){

		if(age>=18){
			return true;
			//System.out.println("Eligible to vote");
		}else{
			return false;
			//System.out.println("Not eligible to vote:");
		}
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter age: ");

		int age = Integer.parseInt(br.readLine());

	//	boolean ans = printEligible(age);

	//	System.out.println(ans);
	
		if(printEligible(age) == true){
			System.out.println("Eligible to vote:");
		}else{
			System.out.println("Not Eligible to vote: ");
		}
	}
}

