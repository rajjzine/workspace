package javaPractice.collections;

import java.util.Comparator;

public class Student1 {
	private String studentname;
	private int rollno;
	private int studentage;
	
	
	public Student1(String studentname, int rollno, int studentage) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}


	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	
//	public static Comparator<Student1> StuNameComparator = new Comparator<Student1>() {
//		public int compare(Student1 s1, Student1 s2) {
//			String StudentName1 = s1.getStudentname().toUpperCase();
//			String StudentName2 = s2.getStudentname().toUpperCase();
//			return StudentName1.compareTo(StudentName2);
//		}
//	};
	
	public static Comparator<Student1> StudRollno = new Comparator<Student1>() {
		public int compare(Student1 s1, Student1 s2) {
			int rollno1 = s1.getRollno();
			int rollno2 = s2.getRollno();
			
			return rollno1-rollno2;
		}
	};


	@Override
	public String toString() {
		return "Student1 [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
	
	
	
	
	
	
	

}
