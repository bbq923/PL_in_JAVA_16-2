/*
 *  자바의 정석 6장 연습문제 8번
 */

package cp6_exercise;

public class PlayingCard {
	int kind; //멤버 변수, 그 중 인스턴스 변수 
	int num; //멤버 변수, 그 중 인스턴스 변수 
	
	static int width; //멤버 변수, 그 중 클래스 변수 
	static int height; //멤버 변수, 그 중 클래스 변수 
	
	PlayingCard(int k, int n){
		kind = k; //로컬 변수(지역 변수) 
		num = n; //로컬 변수(지역 변수) 
	}
	
	public static void main(String args[]){
		PlayingCard card = new PlayingCard(1, 1); //로컬 변수(지역 변수) 
	}
}
