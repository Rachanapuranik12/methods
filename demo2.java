class Demo2{
	public static void main(String[] args){

		Demo2 obj = new Demo2();

		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
	}

	void fun(float x){
		System.out.println("In fun");
		System.out.println(x);
	}
}
