/*
 * 16.06.16 수업 과제
 * 
 * 유효한 날짜인지 검사하기(윤년에 주의)
 * 
 */

package assignment160616;

public class Birthday {
	private int day;
	private int month;
	private int year;
	
	//생성할 때 생일을 입력값으로 넘겨서 private인 변수들을 정의해준다.
	public Birthday(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//private으로 선언된 변수들을 선언하고 참조할 수 있는 Set 함수와 Get 함수 구현.
	public void setDay(int day){
		this.day = day;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}
	
	//인스턴스의 day, month, year가 각각 유효한 값인지 검사한 뒤, boolean값을 리턴해 주는 함수
	public boolean isValid(){
		boolean truthValue = true;
		
		if(month < 1 || month > 12) truthValue = false; //month값이 invalid한 경우
		if(day < 1 || day > 31) truthValue = false; //day값이 invalid한 경우
		if(day == 31){
			if(month == 2 || month == 4 || month == 6 || month == 9 || month == 11)
				truthValue = false; //31일까지 없는데 day가 31인 경
		}
		if(day == 30 && month == 2) truthValue = false; //2월인데 day가 30일인 경
		if(day == 29 && month == 2){ //2월 29일의 경
			if(year % 4 != 0) truthValue = false; //윤년이 아니면 false
			else if(year % 100 == 0){
				if(year % 400 == 0)
					truthValue = true; //100의 배수이지만 400의 배수이기도 하면 다시 윤년이라서 truthValue = true, 
									   //이 때 truthValue는 이미 true이지만 명시적으로 한번 더 써 줌
				else
					truthValue = false; //4의 배수이지만 100의 배수이기도 하면 평년이라서 truthValue = false
			}
		}
		
		return truthValue;
	}
}
