class Test1 
{
	static int i =20;
	static A aObj = new A();
	public static void main(String[] args) 
	{
		
		A.x =50;
		aObj.y=70.5;
		System.out.println("Hello World! "+A.x);
		System.out.println("Hello World! "+aObj.x);
		System.out.println("Hello World! "+A.y);
		System.out.println("Hello World! "+aObj.y);
//		System.out.println("Hello World! "+A.f); CE
		System.out.println("Hello World! "+aObj.f);
		System.out.println("Hello World! "+i);

	}
}
