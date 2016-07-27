package maze;

public class Maze {
	//for loop 를 돌릴 때 out of bound 에러를 피하기 위해 가장자리를 벽으로 둘러쌌다. 1은 지나갈 수 없는 곳. 0은 통로.
	public static int[][] maze = {
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
			{1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
			{1, 1, 1, 0, 0, 0, 1, 0, 1, 1},
			{1, 1, 1, 0, 1, 1, 1, 0, 1, 1},
			{1, 1, 0, 0, 1, 0, 0, 0, 0, 1},
			{1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
			{1, 1, 0, 1, 1, 0, 0, 0, 0, 1},
			{1, 0, 1, 1, 0, 1, 1, 1, 0, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};
	
	public static void drawMaze(){
		for(int i = 1; i < maze.length - 1; i++){
			for( int j = 1; j < maze.length - 1; j++){
				if(maze[i][j] == 0)
					System.out.print("[ ]"); // 통로
				if(maze[i][j] == 1)
					System.out.print("[w]"); // 벽
				if(maze[i][j] == 2)
					System.out.print("[p]"); // 지나간 곳
			}
			System.out.println(); 
		}
	}
}
