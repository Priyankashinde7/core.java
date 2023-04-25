class DemoConst 
{
	public static void main(String[] args) 
	{
		A a1 = new A();//constructor calling

		//int byte short double float char long 
		// Refrence, [], class
			
		//int a;
		//double d;
		long l = 565454654554l;

		int [] a = new int[5];
		//String str;
		int x[] = new int[10];
		a1.m1(); // method calling
		System.out.println("Hello World!");
	}
}

class A { //concret class
	int i; //instance variable of type premetive or value 
	int j = 10;
	String str; //instance vaiable of type refrence

	A() { //Constructor
	
	}
	void m1 () { // Method
		System.out.println("Hello from m1()");
	}
}
