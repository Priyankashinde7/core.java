class DemoLabel3 
{
	public static void main(String[] args) 
	{
		OL:for(int i =1 ; i<=5; i++) {
			System.out.println("before for i :: "+i);//5
			IL:for(int j=1; j<=3; j++) {
				System.out.println("before for j :: "+j);//10
				if(j==2) {
					continue OL;
				}
				System.out.println("after for j :: "+j);//5

			}
			System.out.println("after for i :: "+i);//0
		
		}

		System.out.println("Hello World!");
	}
}
