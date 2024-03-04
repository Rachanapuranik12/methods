//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.io.*;
class FunctionFour{

	static double printCircumference(int r){

		return (2*3.14*r);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter radius: ");

		int r = Integer.parseInt(br.readLine());

		//double ans = printCircumference(r);
		System.out.println("Circumference is: "+printCircumference(r));
	}
}
	
