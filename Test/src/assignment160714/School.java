package assignment160714;

import java.util.ArrayList;

public class School {
	private static School schoolInstance = new School();
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	
	private School(){
		System.out.println("School singleton instantiated!");
	}
	
	public static School getInstance(){
		if(schoolInstance == null)
			return new School();
		else
			return schoolInstance;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void setStudentList(Student s){
		if(s instanceof Student){
			studentList.add(s);
		} else {
			System.out.println("Wrong instance input.");
		}
	}
	
	
}
