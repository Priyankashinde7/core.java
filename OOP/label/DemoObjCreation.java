class DemoObjCreation
{
	int i;
	String s;
	
	boolean m1() {
		boolean properlySaidBye;
		//
		//
		//
		//
		System.out.println("Bye ");
		properlySaidBye = false;
		//
		return properlySaidBye;
	}

	public static void main(String[] args) {
		var i = new DemoObjCreation().m1();
		if(i) {
			System.out.println("Method said bye properly");
		} else {
			System.out.println("Method did not say bye properly");
		}
		localBlock:{
			System.out.println("Statment-1");
		//	if(dl.i == 5) 
		//	break localBlock;
			System.out.println("Statment-5");
		}
		System.out.println("Hello World!");
	}
}
