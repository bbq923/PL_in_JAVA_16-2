package assignment160714;


public class MainTest {

	public static void main(String[] args) {
		
		School mySchool = School.getInstance();
		DisplayTable dTable = DisplayTable.getInstance();
		
		Student stu1 = new Student(141213, "이승기", 101, 95, 20);
		Student stu2 = new Student(141518, "김수현", 102, 90, 100);
		Student stu3 = new Student(141230, "주원", 101, 76, 60);
		Student stu4 = new Student(141255, "김우빈", 101, 85, 89);
		Student stu5 = new Student(141590, "이민호", 102, 90, 95);
		
		stu1.setScore();
		stu2.setScore();
		stu3.setScore();
		stu4.setScore();
		stu5.setScore();
		
		mySchool.setStudentList(stu1);
		mySchool.setStudentList(stu2);
		mySchool.setStudentList(stu3);
		mySchool.setStudentList(stu4);
		mySchool.setStudentList(stu5);
		
		dTable.drawTable(mySchool.getStudentList());
	}

}
