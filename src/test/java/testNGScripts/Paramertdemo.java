package testNGScripts;

public class Paramertdemo {
	
	public void add(int val1, int val2)
	{
		int a = val1;
		int b = val2;
		int result = a+b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paramertdemo obj = new Paramertdemo();
		
		obj.add(10,20);
		
		obj.add(100, 200);
		
	}

}
