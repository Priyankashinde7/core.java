class DemoLabel2 
{
	public static void main(String[] args) 
	{
		OL:for(int i =1 ; i<=5; i++) {
			System.out.println("for i :: "+i);//5
			IL:for(int j=1; j<=3; j++) {
				System.out.println("bfore for j :: "+j);//10
				if(j==2) {

					break IL;
					//System.out.println("for j :: "+j);//10

				}
				System.out.println("for j :: "+j);//10

			}
		
		}

		System.out.println("Hello World!");
	}
}
