////Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.io.*;
class FunctionSeven{

	static void printCount(int[] arr){

		int pos=0,neg=0,zero=0;
		//int neg=0;
		//int zero=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]>0){
				pos++;
			}else if(arr[i]<0){
				neg++;
			}else{
				zero++;
			}
		}

		System.out.println("Count of positive numbers: "+pos);

		System.out.println("Count of negative numbers: "+neg);

		System.out.println("Count of zeroes is: "+zero);

	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter  count of numbers:");

		int s = Integer.parseInt(br.readLine());

		int[] arr = new int[s];

		System.out.println("Enter numbers: ");

		for(int i=0;i<s;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		printCount(arr);
	}
}



