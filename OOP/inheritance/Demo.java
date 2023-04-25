class A {
	static {
		System.out.println("A static block");
	}
	A() {
		super();
		System.out.println("A constructor");
	}
	int i = 10;
}
class B extends A {
	static {
		System.out.println("B static block");
	}
	int i = 70;
	B() {
		super();
		System.out.println("B constructor");
	}
	void m1() {
		int i = 50;
		System.out.println("i "+ i);
		System.out.println("this.i "+ this.i);
//		System.out.println("super.i "+ super.i);
		System.out.println("B class m1()");
	}
}
class C extends B{
	static {
		System.out.println("C static block");
	}
	C() {
		super();
		System.out.println("C 1 param constructor");
	}
	void m1() {
		System.out.println("C class m1()");
	}
}
class D extends C {
	static {
		System.out.println("D static block");
	}
	D() {
		super();
		System.out.println("D constructor");
	}
	void m1() {
		System.out.println("D class m1()");
	}
	void m2() {
		System.out.println("D class m2()");
	}
	int i =100;
}
public class Demo//1 load class Demo...javac Demo.java....java Demo
{
	static {//2
		System.out.println("Demo static block");
	}
	public static void main(String[] args) 
	{
		A a1 = new D();
		//a1.m1();
		
		System.out.println(a1.equals(a1));
	}
}
