package assignment160707;

public class GameLevel3 extends GameLevel {

	private static GameLevel3 gl3 = new GameLevel3();
	
	private GameLevel3(){}
	
	public static GameLevel3 getGameLevel3(){
		if(gl3 == null)
			gl3 = new GameLevel3();
		
		return gl3;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level3 simple attack : 메롱~ 메롱~ 메롱");
	}

	@Override
	public void turnAttack() {
		System.out.println("level3 turn attack : 뒤돌려차기 앞돌려차기");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level3 flying attack : 날라차기 휙~~~");
	}

}
