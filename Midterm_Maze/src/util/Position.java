package util;

public class Position {
	private int nextCheckPoint = 0; //뭣에 쓰는 변수인지는 ExploreStrategy를 구현하는 각각의 클래스에서 설명
	private int xPosition;
	private int yPosition;
	
	public Position(int xPosition, int yPosition){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	public Position(){
		// 기본 생성자
	}
	
	public int getXPosition(){
		return xPosition;
	}
	
	public void setXPosition(int xPosition){
		this.xPosition = xPosition;
	}
	
	public int getYPosition(){
		return yPosition;
	}
	
	public void setYPosition(int yPosition){
		this.yPosition = yPosition;
	}
	
	public int getNextCheckPoint(){
		return nextCheckPoint;
	}
	
	public void increaseNextCheckPoint(){
		nextCheckPoint++;
	}
}

