class DemoMethod 
{
	//[AM] [ELM] <return type> <method name> ([1..n]);
	static String getResult(int a, boolean b, char c, String str, double d, float f) {
		System.out.println("details: "+a +b +c +str +d +f);
		return "piyu";
	}
	
	public static void main(String[] args) 
	{
		
		int id = 10;
		boolean isPrimimum = true;
		char gender = 'm';
		String name = "Vaibhav";
		double percentage = 7.8;
		float fee = 2.3f;

		String str = getResult(id,isPrimimum,gender,name,percentage,fee);
		
		System.out.println(str);
	}
}
