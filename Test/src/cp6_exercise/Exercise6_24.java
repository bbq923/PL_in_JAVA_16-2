/*
 *  자바의 정석 6장 연습문제 24번 
 *  
 *  다음과 같이 정의된 메서드를 작성하고 테스트하시오. 
 *  
 *  메서드명 : abs
 *  기   능 : 주어진 값의 절대값을 반환한다. 
 *  반환타입 : int
 *  매개변수 : int value 
 */

package cp6_exercise;

public class Exercise6_24 {
	public static int abs(int value){
		return value >= 0 ? value : -value; // 깔끔하게 삼항연산자 사용. 
	}
}
