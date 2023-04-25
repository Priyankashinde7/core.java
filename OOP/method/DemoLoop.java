//Take input number from user and create an Array of that number size and also sign the values
// to the created object in the array.. and print the values of all array elment
//import java.util.Scanner;

class DemoLoop
{
//	Scanner sc = new Scanner(System.in); 
	

	public static void main(String[] args) 
	{
		Student11 s1 = new Student11();	
		Student11 s[] = new Student11[3];
		s[0] = new Student11();
		s[0].x = 10;
		s[0].y = 20;
		s[0].s = "piyu";
		System.out.println(s[0]);
		System.out.println("Student1 x:"+s[0].x);
		System.out.println("Student1 y:"+s[0].y);
		System.out.println("Student1 s:"+s[0].s);
		System.out.println();
		
		s[1] = new Student11();
		s[1].x = 30;
		s[1].y = 40;
		s[1].s = "priya";
		System.out.println(s[1]);
		System.out.println("Student2 x:"+s[1].x);
		System.out.println("Student2 y:"+s[1].y);
		System.out.println("Student2 s:"+s[1].s);
		System.out.println();

		s[2] = new Student11();
		s[2].x = 50;
		s[2].y = 60;
		s[2].s = "priyanka";
		System.out.println(s[2]);
		System.out.println("Student3 x:"+s[2].x);
		System.out.println("Student3 y:"+s[2].y);
		System.out.println("Student3 s:"+s[2].s);
		System.out.println();
	}
}

class Student11
{
	int x;
	int y;
	String s;
}
