package util.strategy;

import util.Position;

public interface ExploreStrategy {
	
	public void explore(Position startPos, Position exitPos); //시작점과 끝점이 주어지면 Maze 클래스에서 정의한 미로를 탐색하는 메서드.
	public Position getNextPos(Position curPos); //다음번에 이동할 점을 구하는 메서드.
}
