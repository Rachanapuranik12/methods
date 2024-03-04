
class Demo{

	int fun(int x){

		int y = x+10;
		return y;
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		System.out.println(obj.fun(10));
	}
}
