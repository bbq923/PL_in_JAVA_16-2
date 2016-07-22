package assignment160714;

import java.util.ArrayList;

public class DisplayTable {
	//DisplayTable도 여러번 new될 필요가 없으므로 singleton pattern으로 구현하자.
	private static DisplayTable dTable = new DisplayTable();
	
	private DisplayTable(){}
	
	public static DisplayTable getInstance(){
		if(dTable == null)
			return new DisplayTable();
		else
			return dTable;
	}
	
	public void drawTable(ArrayList<Student> studentList){
		System.out.println("============================================================");
		System.out.println("  이름  |  학번   |  학과  |  수학  |  영어  | 수학원점수 | 영어원점수 |");
		for(Student s : studentList){
			System.out.print(" " + s.name + "  |");
			System.out.print(" " + s.studentCode + "|");
			if(s.majorCode == 101)
				System.out.print("  수학  |");
			else 
				System.out.print("  영어  |");
			System.out.print("   " + s.getScore().get(0).getCredit() + "   |");
			System.out.print("   " + s.getScore().get(1).getCredit() + "   |");
			System.out.print("   " + s.getMathScore() + "    |");
			System.out.print("   " + s.getEnglishScore() + "     |");
			System.out.println("");
		}
		System.out.println("============================================================");
	}
}
