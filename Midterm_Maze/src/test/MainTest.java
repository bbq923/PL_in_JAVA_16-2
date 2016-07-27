package test;

import java.io.IOException;

import maze.Maze;
import util.FileUpload;
import util.Position;
import util.strategy.ExploreStrategy;

public class MainTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Position startPos = new Position(1, 1);
		Position exitPos = new Position(8, 8);
		
		FileUpload fu = new FileUpload();
		ExploreStrategy strategy = fu.getStrategy();
		
		strategy.explore(startPos, exitPos);
		Maze.drawMaze();
	}

}
