//Take input number from user and create an Array of that number size and also sign the values
// to the created object in the array.. and print the values of all array elment
import java.util.Scanner;

class DemoLoop1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("How many Students values you want to enter:");
		int number = sc.nextInt();
		
		Student2 s1 = new Student2();	
		Student2 s[] = new Student2[number];
		for(int i=0;i<number;i++){
			System.out.println("Student :"+(i+1));

			s[i] = new Student2();
			System.out.println();
			System.out.print("Student x:");
			s[i].x = sc.nextInt();  sc.nextLine();
			//System.out.println("Student x:"+s[i].x);

			System.out.print("Student y:");
			s[i].y = sc.nextInt();
			//System.out.println("Student y:"+s[i].y);

			System.out.print("Student s:");
			s[i].s = sc.next();
			System.out.println();
			//System.out.println("Student s:"+s[i].s);
		}
	}
}

class Student2
{
	int x;
	int y;
	String s;
}
