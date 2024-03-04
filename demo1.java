class Demo1{

	int fun(int x){
		return x+10;
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		int a = obj.fun(10);
		System.out.println(a);
	}
}
