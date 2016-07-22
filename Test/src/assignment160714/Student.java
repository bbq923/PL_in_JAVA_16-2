package assignment160714;

import java.util.ArrayList;

public class Student {
	int studentCode;
	String name;
	int majorCode;
	int mathSessionID = 101; //sessionID를 여기에 유지하는 게 상당히 께름칙하지만 어디로 빼서 어디에 어떻게 배치해야할 지 모르겠다.
	int englishSessionID = 102;
	private int mathScore;
	private int englishScore;
	private ArrayList<Score> courseCredit;
	
	public Student(int studentCode, String name, int majorCode, int mathScore, int englishScore){
		this.studentCode = studentCode;
		this.name = name;
		this.majorCode = majorCode;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		courseCredit = new ArrayList<Score>();
	}
	
	public int getMathScore(){
		return mathScore;
	}
	
	public void setMathScore(int mathScore){
		this.mathScore = mathScore;
	}
	
	public int getEnglishScore(){
		return englishScore;
	}
	
	public void setEnglishScore(){
		this.englishScore = englishScore;
	}
	
	public void setScore(){
		Score mScore = new Score(studentCode, majorCode, mathSessionID, mathScore);
		Score eScore = new Score(studentCode, majorCode, englishSessionID, englishScore);
		courseCredit.add(mScore);
		courseCredit.add(eScore);
	}
	
	public ArrayList<Score> getScore(){
		return courseCredit;
	}
	
}
