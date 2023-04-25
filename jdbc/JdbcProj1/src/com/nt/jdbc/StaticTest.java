class StaticTest{
	static{
		//static{
			System.out.println("SB");
		//}
	}
	public static void m1(){
		System.out.println("static block");
	}
	public static void main(String[] args) throws ClassNotFoundException 
	{
		System.out.println("main");
		Class.forName("Test");
		Class.forName("Pratice");
	}
}
