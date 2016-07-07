package assignment160707;

public class Player {
	GameLevel curGameLevel = GameLevel1.getGameLevel1(); // default GameLevel은 GameLevel1
	
	// upgrade하고자 하는 level을 인자로 받아 curGameLevel을 변경시켜주는 메서드. 이때 쓰는 if문은 사용해도 되나? 
	public void upgradeLevel(int level){
		if(level == 1)
			curGameLevel = GameLevel1.getGameLevel1();
		else if(level == 2)
			curGameLevel = GameLevel2.getGameLevel2();
		else if(level == 3)
			curGameLevel = GameLevel3.getGameLevel3();
	}
	
	public GameLevel getGameLevel(){
		if(curGameLevel == null)
			curGameLevel = GameLevel1.getGameLevel1();
		
		return curGameLevel;
	}
	
	public void attack(){
		curGameLevel.play();
	}
}
