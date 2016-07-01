package cp6_exercise;

public class TestMain {

	public static void main(String[] args) {
		
		// 연습문제 2번 테스트 코드
		StudaCard card1 = new StudaCard(3, false);
		StudaCard card2 = new StudaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		// 연습문제 4번 테스트 코드 
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		
		// 연습문제 5번 테스트 코드 
		Student s2 = new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s2.info());
		
		// 연습문제 6번, 7번 테스트 코드
		MyPoint p = new MyPoint(1, 1);
		
		// MyPoint와 (2,2)의 거리를 구한다. 
		System.out.println(p.getDistance(2, 2));
		
		// 연습문제 20번 테스트 코드
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = Exercise6_20.shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
		// 연습문제 21번 테스트 코드 
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		// 연습문제 22번 테스트 코드 
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + Exercise6_22.isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + Exercise6_22.isNumber(str));
		
		// 연습문제 23번 테스트 코드 
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + Exercise6_23.max(data));
		System.out.println("최대값:" + Exercise6_23.max(null));
		System.out.println("최대값:" + Exercise6_23.max(new int[]{}));
		
		// 연습문제 24번 테스트 코드 
		int value = 5;
		System.out.println(value + "의 절대값:" + Exercise6_24.abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + Exercise6_24.abs(value));

	}

}
