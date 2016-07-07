package assignment160707;

public class Board {

	public static void main(String[] args) {

		Player p1 = new Player();
		
		System.out.println("========level1 start===========");
		p1.attack();
		System.out.println("========level1 end  ===========");
		System.out.println("");
		
		p1.upgradeLevel(2);
		System.out.println("========level2 start===========");
		p1.attack();
		System.out.println("========level2 end  ===========");
		System.out.println("");
		
		p1.upgradeLevel(3);
		System.out.println("========level3 start===========");
		p1.attack();
		System.out.println("========level3 end  ===========");
		System.out.println("");
	}

}
