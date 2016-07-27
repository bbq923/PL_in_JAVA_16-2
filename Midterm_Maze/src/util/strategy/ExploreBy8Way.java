package util.strategy;

import maze.Maze;
import util.Position;
import util.userstack.Stack;

public class ExploreBy8Way implements ExploreStrategy {

	private Stack stack = new Stack();
	public int[][] maze = Maze.maze;
	public int totalMove = 0; // 탈출할 때까지 총 몇 번을 움직였는가?
	
	@Override
	public Position getNextPos(Position curPos) {
		Position nextPos = new Position();
		
		if(curPos.getNextCheckPoint() == 0){
			nextPos.setXPosition(curPos.getXPosition());
			nextPos.setYPosition(curPos.getYPosition() + 1);
			curPos.increaseNextCheckPoint();
		} else if(curPos.getNextCheckPoint() == 1){
			nextPos.setXPosition(curPos.getXPosition() + 1);
			nextPos.setYPosition(curPos.getYPosition() + 1);
			curPos.increaseNextCheckPoint();
		} else if(curPos.getNextCheckPoint() == 2){
			nextPos.setXPosition(curPos.getXPosition() + 1);
			nextPos.setYPosition(curPos.getYPosition());
			curPos.increaseNextCheckPoint();
		} else if(curPos.getNextCheckPoint() == 3){
			nextPos.setXPosition(curPos.getXPosition() + 1);
			nextPos.setYPosition(curPos.getYPosition() - 1);
			curPos.increaseNextCheckPoint();
		} else if(curPos.getNextCheckPoint() == 4){
			nextPos.setXPosition(curPos.getXPosition());
			nextPos.setYPosition(curPos.getYPosition() - 1);
			curPos.increaseNextCheckPoint();
		} else if(curPos.getNextCheckPoint() == 5){
			nextPos.setXPosition(curPos.getXPosition() - 1);
			nextPos.setYPosition(curPos.getYPosition() - 1);
			curPos.increaseNextCheckPoint();
		} else if(curPos.getNextCheckPoint() == 6){
			nextPos.setXPosition(curPos.getXPosition() - 1);
			nextPos.setYPosition(curPos.getYPosition());
			curPos.increaseNextCheckPoint();
		} 
		
		return nextPos;
	}

	@Override
	public void explore(Position startPos, Position exitPos) {
		Position curPos = startPos;
		
		while(curPos.getXPosition() != exitPos.getXPosition() || curPos.getYPosition() != exitPos.getYPosition()){
			System.out.println(curPos.getXPosition() + "," + curPos.getYPosition());
			if(curPos.getNextCheckPoint() == 7){
				curPos = stack.pop();
			} else {
				maze[curPos.getXPosition()][curPos.getYPosition()] = 2; // 이미 한 번 탐색하면서 지나간 곳임을 표시.
				Position nextPos = getNextPos(curPos);
				if(maze[nextPos.getXPosition()][nextPos.getYPosition()] == 1)
					continue; // 벽을 만나면 다음 루프로...
				else if(maze[nextPos.getXPosition()][nextPos.getYPosition()] == 2)
					continue;
				else { // curPos에 해당하는 maze의 값이 0 즉 미답지일때.
					stack.push(curPos);
					curPos = nextPos;
					totalMove++;
				}
			}
		}
		
		maze[exitPos.getXPosition()][exitPos.getYPosition()] = 2; // 사족이긴 한데 찍다보니 출구에는 p가 안찍혀서...
		System.out.println("미로 탈출! 총 " + totalMove + "번 움직였습니다.");
	}
}
