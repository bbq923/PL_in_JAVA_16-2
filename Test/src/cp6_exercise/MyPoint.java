/*
 *  자바의 정석 6장 연습문제 6번, 7번
 */

package cp6_exercise;

public class MyPoint {
	int x;
	int y;
	
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1){
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}
}
