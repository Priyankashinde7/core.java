class AmstrongNum 
{
	public static void main(String[] args) 
	{
		int a =0;
		int i=153;
		int b=i;//b is temporary variable to hold input value
		int count=0;
		for(;i!=0;i=i/10){ // here i variable value updates using assignment operator

			a=(i%10)*(i%10)*(i%10)+a;
			//System.out.println(a);
		}
		//System.out.println(i); ......
		if(b==a){
			System.out.println("Amstrong number is "+a);
		}else{
				System.out.println("The given num is not amstrong");
		}	
	}
}
