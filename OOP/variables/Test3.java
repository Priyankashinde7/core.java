class Test3 
{
	int x = 40;
	double a= 50;
	static int i =20;
	static A aObj = new A();
	A aObj1 = new A();

	public static void main(String[] args) 
	{
		Test2 test = new Test2();
		
		System.out.println("A.x "+A.x); // 0
		System.out.println("Hello World! "+aObj.x); //0
		System.out.println("Hello World! "+A.y); //0.0
		System.out.println("Hello World! "+aObj.y);//0.0
//		System.out.println("Hello World! "+A.f); CE
		System.out.println("Hello World! "+aObj.f);//0.0
		System.out.println("Hello World! "+i);//20

		System.out.println("Hello World! "+Test2.i);//20
		System.out.println("Hello World! "+test.x);//40
		System.out.println("Hello World! "+test.a);//50.0
		System.out.println("Hello World! "+test.aObj1.y);//0.0
//		System.out.println("Hello World! "+A.f); CE
		System.out.println("Hello World! "+test.aObj1.f);//0.0
		System.out.println("Hello World! "+test.aObj1.x);//0

	}
}
