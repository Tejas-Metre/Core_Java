package p1;

class Student {
int studentId;
String StudentName;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}


} 

class Test
{
	public static void main(String[] args) {
		Student s1 =new Student();
				s1.setStudentId(11);
		s1.setStudentName("Ram");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		
	}
}