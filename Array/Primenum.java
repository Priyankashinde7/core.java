class Primenum
{
	public static void main(String[] args) 
	{
		/*int a=1;
		for(int i=2;i<101;i++){
			for(int j=2;j<101;j++){
				a=i%j;
				System.out.println(a);
				if(a==i){
					System.out.println(" number is prime" +a);
				}else{
					System.out.println("number is not prime");
				}
			}
		}*/
		
		for(int i=1;i<101;i++){
			int c =0;
			for(int j=i;j>=1;j--){
				if(i%j==0){
					c++;
					//System.out.println(i);
				}
			}
			if(c==2){
				System.out.println(i);
			}
		}
	}
}
