package util.userstack;

import java.util.ArrayList;
import util.Position;

public class Stack {
	public ArrayList<Position> stack = new ArrayList<Position>();
	public int curPos = -1;
	
	public int top(){
		return curPos;
	}
	
	public Position pop(){
		curPos--;
		return stack.get(curPos + 1);
	}
	
	public void push(Position p){
		stack.add(curPos + 1, p);
		curPos++;
	}
	
	public Position peek(){
		return stack.get(curPos);
	}
}
