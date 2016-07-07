package assignment160707;

public abstract class GameLevel {
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	// template method. 본 게임의 시나리오.  
	public void play(){
		simpleAttack();
		turnAttack();
		flyingAttack();
	}
}
