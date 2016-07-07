package assignment160707;

public class GameLevel1 extends GameLevel {

	private static GameLevel1 gl1 = new GameLevel1();
	
	private GameLevel1(){}
	
	public static GameLevel1 getGameLevel1(){
		if(gl1 == null)
			gl1 = new GameLevel1();
		
		return gl1;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level1 simple attack : 메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level1 turn attack : 못하지롱");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level1 flying attack : 이것도 못하지롱");
	}

}
