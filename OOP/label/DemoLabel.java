//There are 3 types blocks 
//1. static block
//2. non-static block
//3. local block

class DemoLabel {
	int x;//9
	static int y;//1

	{//10
		System.out.println("IB : Before y : "+y);//11 y=5
		System.out.println("IB : Before x : "+x);//12 x=0
		y = 10;//13
		x = 20;//14
		System.out.println("IB : after y : "+y);//15 y=10
		System.out.println("IB : after x : "+x);//16 x=20
		IBLB:{		
			System.out.println("LB : Before y : "+y);//11 y=5
			System.out.println("LB : Before x : "+x);//12 x=0
			x = 30 ;//14
			System.out.println("LB : after y : "+y);//15 y=10
			System.out.println("LB : after x : "+x);//16 x=20
			
		}
	}

	void m1() {
		System.out.println("m1 x :: "+x);
	}
	void m2() {
		System.out.println("m2 x :: "+x);
	}

	public static void main(String[] args) {//6
	
		int w =10;
		System.out.println("main before instatiation : ");//7
		DemoLabel dl = new DemoLabel();//8
		dl.m1();
		dl.m2();
		DemoLabel dl1 = new DemoLabel();//8
		dl1.m1();
		dl1.m2();
		System.out.println("main after instatiation : ");//17

		LB:{
			System.out.println("main LB");
			System.out.println("main LB");
			System.out.println("main LB");
			ILB:{
				System.out.println("ILB main LB");
				System.out.println("ILB main LB");
				System.out.println("ILB main LB");
				if (w ==10)
				{
					break ILB;
				}
				System.out.println("ILB main LB");
				System.out.println("ILB main LB");
			}
			System.out.println("main LB");
			System.out.println("main LB");
		}
		System.out.println("after main LB");


	}

	static {//2
		System.out.println("SB : Before y : "+y);//3 y=0
		y = 5;//4
		System.out.println("SB : After y : "+y);//5 y=5
		SBLB:{
			System.out.println("SB : LB : After y : "+y);//5 y=5
		}
	}
}
