/*
 *  자바의 정석 6장 연습문제 3번, 4번, 5번
 */

package cp6_exercise;

public class Student {
	public String name; // 학생이름
	public int ban; // 반
	public int no; // 번호
	public int kor; // 국어점수
	public int eng; // 영어점수
	public int math; // 수학점수

	public Student(){} //기본 생성자
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5) / 10f;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}
