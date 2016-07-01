/*
 *  자바의 정석 6장 연습문제 20번 
 *  
 *  다음과 같이 정의된 메서드를 작성하고 테스트하시오. 
 *  [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
 *  
 *  메서드명 : shuffle
 *  기   능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 처리한 배열을 반환한다.
 *  반환타입 : int[]
 *  매개변수 : int[] arr - 정수값이 담긴 배열 
 */

package cp6_exercise;

public class Exercise6_20 {
	public static int[] shuffle(int[] arr){
		if(arr == null || arr.length == 0)
			return arr; //방어코드. 비어있는 배열 처리
		
		for(int x = 0; x < arr.length ; x++){
			int i = (int)(Math.random() * arr.length);
			int j = (int)(Math.random() * arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		return arr;
	}
}
