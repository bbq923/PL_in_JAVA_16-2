package assignment160707;

public class GameLevel2 extends GameLevel {

	private static GameLevel2 gl2 = new GameLevel2();
	
	private GameLevel2(){}
	
	public static GameLevel2 getGameLevel2(){
		if(gl2 == null)
			gl2 = new GameLevel2();
		
		return gl2;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level2 simple attack : 메롱~ 메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level2 turn attack : 돌려차기 쓍~~~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level2 flying attack : 이건 못하지롱");
	}

}
