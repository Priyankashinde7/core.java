public class Demo
{
	public static void main(String[] args) 
	{	
		//Student 1
		Demo d = new Demo();
		Student s1 = d.setMarksForAllSubjects(35,40,50,25);
		d.setCalculatedTotalMarks(s1);
		s1.percent = d.setCalculatedPercent(s1.totalMarks);

		//Student 2
		Student s2 = d.setMarksForAllSubjects(45,74,44,77);
		d.setCalculatedTotalMarks(s2);
		s2.percent = d.setCalculatedPercent(s2.totalMarks);

		//Student 3
		Student s3 = d.setMarksForAllSubjects(45,74,44,77);
		d.setCalculatedTotalMarks(s3);
		s3.percent = d.setCalculatedPercent(s3.totalMarks);

		//Student 4
		Student s4 = d.setMarksForAllSubjects(54,44,11,44);
		d.setCalculatedTotalMarks(s4);
		s4.percent = d.setCalculatedPercent(s4.totalMarks);

		//Student 5
		Student s5 = d.setMarksForAllSubjects(45,74,47,88);
		d.setCalculatedTotalMarks(s5);
		s5.percent = d.setCalculatedPercent(s5.totalMarks);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());


		//Student s1 = new Student;
		//s1.mathMarks = 35;
		//s1.chemMarks = 45;
		//s1.compMarks = 55;
		//s1.bioMarks = 65;
		//s1.totalMarks = s1.mathMarks+s1.chemMarks+s1.compMarks+s1.bioMarks;
		//
		//Student s2 = new Student;
		//s2.mathMarks = 45;
		//s2.chemMarks = 55;
		//s2.compMarks = 55;
		//s2.bioMarks = 55;

		//s2.totalMarks = s2.mathMarks+s2.chemMarks+s2.compMarks+s2.bioMarks;

	}
	Student setMarksForAllSubjects(int mathMarks, int chemMarks, int compMarks, int bioMarks) {
		if(true) {
			System.out.println("Invalid marks");
			return null;
		}
		Student s = new Student();

		s.mathMarks = mathMarks;
		s.chemMarks = chemMarks;
		s.compMarks = compMarks;
		s.bioMarks = bioMarks;
		return s;
	}

	void setCalculatedTotalMarks(Student s) {
		s.totalMarks = s.mathMarks + s.chemMarks + s.compMarks + s.bioMarks;
	}

	double setCalculatedPercent(int totalMarks) {
		double percent = (totalMarks +100) /100; 
		return percent;
	}
}


class Student
{
	int mathMarks;
	int chemMarks;
	int compMarks;
	int bioMarks;
	int totalMarks;
	double percent;

	public String toString() {
	return mathMarks+" "+chemMarks+" "+compMarks+" "+bioMarks+" "+totalMarks+" "+percent;
	}
}
