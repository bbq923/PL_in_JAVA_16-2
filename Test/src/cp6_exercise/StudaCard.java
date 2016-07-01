/*
 *  자바의 정석 6장 연습문제 1번 
 */

package cp6_exercise;

public class StudaCard {
	int num;
	boolean isKwang;
	
	public StudaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	
	public StudaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info(){
		return num + ( isKwang? "K" : "");
	}
}
