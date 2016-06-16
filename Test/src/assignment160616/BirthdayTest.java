package assignment160616;

public class BirthdayTest {
	
	public static void main(String[] args){
		
		Birthday bDay1 = new Birthday(16, 6, 2015); //정상적인 날짜
		Birthday bDay2 = new Birthday(32, 1, 2000); //day가 잘못된 날짜
		Birthday bDay3 = new Birthday(6, 13, 2013); //month가 잘못된 날짜
		Birthday bDay4 = new Birthday(31, 6, 2008); //31일이 없는 달데 31일인 날짜
		Birthday bDay5 = new Birthday(30, 2, 1994); //2월인데 30일인 날짜
		Birthday bDay6 = new Birthday(29, 2, 1992); //윤년이고 2월 29일인 날짜. 유효.
		Birthday bDay7 = new Birthday(29, 2, 1800); //4의 배수지만 100의 배수라서 평년인 날짜.
		Birthday bDay8 = new Birthday(29, 2, 2000); //100의 배수지만 400의 배수라서 윤년인 날짜.
		Birthday bDay9 = new Birthday(29, 2, 2001); //윤년이 아닌데 2월 29일인 날짜.
		
		//isValid 함수가 올바르게 구현되었다면 bDay1, bDay6, bDay8은 true가 리턴되어야 하고
		//나머지 날짜에 대해서는 false가 리턴되어야 한다.
		System.out.print("bDay1 : ");
		System.out.println(bDay1.isValid());
		System.out.print("bDay2 : ");
		System.out.println(bDay2.isValid());
		System.out.print("bDay3 : ");
		System.out.println(bDay3.isValid());
		System.out.print("bDay4 : ");
		System.out.println(bDay4.isValid());
		System.out.print("bDay5 : ");
		System.out.println(bDay5.isValid());
		System.out.print("bDay6 : ");
		System.out.println(bDay6.isValid());
		System.out.print("bDay7 : ");
		System.out.println(bDay7.isValid());
		System.out.print("bDay8 : ");
		System.out.println(bDay8.isValid());
		System.out.print("bDay9 : ");
		System.out.println(bDay9.isValid());
		
	}
}
