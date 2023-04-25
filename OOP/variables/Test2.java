class Test2 
{
	int x = 40;
	double a= 50;
	static int i =20;
	static A aObj = new A();
	A aObj1 = new A();

	public static void main(String[] args) 
	{
		Test2 test = new Test2();
		A.x =50;
		aObj.y=70.5; // Compliler reads it as A.y=70.5
		//A.f=80.5f; CE
		aObj.f=49.5f;
		test.aObj1.f=14.2f; 
		test.aObj1.x=5; // Compliler reads it as test.A.x=5
		test.aObj1.y=21.0; // Compliler reads it as test.A.y=21.0
		//Test2.x =23;
		//Test2.a =46.3;
		Test2.i =43;
		test.x=4;
		test.a=9;
		System.out.println("A.x "+A.x);//
		System.out.println("Hello World! "+aObj.x);
		System.out.println("Hello World! "+A.y);
		System.out.println("Hello World! "+aObj.y);
//		System.out.println("Hello World! "+A.f); CE
		System.out.println("Hello World! "+aObj.f);
		System.out.println("Hello World! "+i);//

		System.out.println("Hello World! "+Test2.i);//
		System.out.println("Hello World! "+test.x);//
		System.out.println("Hello World! "+test.a);//
		System.out.println("Hello World! "+test.aObj1.y);//
//		System.out.println("Hello World! "+A.f); CE
		System.out.println("Hello World! "+test.aObj1.f);//
		System.out.println("Hello World! "+test.aObj1.x);//

	}
}