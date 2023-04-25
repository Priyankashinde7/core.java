class FindNoOfDigit 
{
	public static void main(String[] args) 
	{
		int i = 578941;
		int x =0;
		int a =0;
		int count=0;
		for(;i!=0;i=i/10){
			count++;
			a=i%10+a;
			//x = x+a;
		}
		System.out.println("Total digits are: "+count);
		System.out.println("Addition of digits "+a);
	}
}	