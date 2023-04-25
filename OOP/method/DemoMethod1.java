class DemoMethod1
{
	//[AM] [ELM] <return type> <method name> ([1..n]);
	static void getResult(int a, boolean b, char c, String str, double d, float f) {
//		"details: "+10 ="details: 10"+true = "details: 10true"+'m'="details: 10truem"....
		//1+10 = 11+true :: wrong CE
		String str1 = 1 +a +""+b +c +str +d +f;
		
	}
	
	public static void main(String[] args) 
	{
		
		int id = 10;
		boolean isPrimimum = true;
		char gender = 'm';
		String name = "Vaibhav";
		double percentage = 7.8;
		float fee = 2.3f;

		getResult(id,isPrimimum,gender,name,percentage,fee);
		
		//System.out.println(i1);
	}
}

