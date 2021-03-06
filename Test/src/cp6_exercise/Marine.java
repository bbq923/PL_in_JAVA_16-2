/*
 *  자바의 정석 6장 연습문제 9번, 10번 
 *  
 *  weapon, armor 변수에 static을 붙였다. 공격력과 방어력은 모든 Marine 인스턴스에 대해서 동일하게 적용되어야 하기 때문... 이라는데 
 *  사실 스타크래프트를 하지 않은 사람이라면 Marine 인스턴스들의 공격력이나 방어력이 모두 같을 이유는 없다고 느낄지도 모른다.
 *  weaponUp(), armorUp() 메서드는 static변수에 대한 작업을 하는 메서드 이므로 마찬가지로 static하게 선언했다. 
 */

package cp6_exercise;

public class Marine {
	int x = 0, y = 0; //Marine의 위치좌표 (x, y)
	int hp = 60; //현재 체력 
	static int weapon = 6; //공격력 
	static int armor = 0; //방어력 
	
	static void weaponUp(){
		weapon++;
	}
	
	static void armorUp(){
		armor++;
	}
	
	void move(int x, int y){
		this.x = x; //this.x는 인스턴스 변수, x는 지역변수 
		this.y = y; //this.y는 인스턴스 변수, y는 지역변수 
	}
}

/*
 * 연습문제 10번 
 * 
 * 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오) 
 * 
 * a. 모든 생성자의 이름은 클래스의 이름과 동일해야 한다.
 * b. 생성자는 객체를 생성하기 위한 것이다.
 * c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
 * d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다. 
 * e. 생성자는 오버로딩 할 수 없다. 
 * 
 * 정답: b , e
 * 
 * 그런데 사실 b는 객체를 생성할 때 사용되긴 하므로 아주 틀린 말은 아닌 듯하다. 교재는 b가 new에 대한 설명이라는 의도로 작성한 것 같지만. 
 *
 */

/*
 * 연습문제 11번 
 * 
 * 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오) 
 * 
 * a. 객체 자신을 가리키는 참조변수이다.
 * b. 클래스 내에서라면 어디서든 사용할 수 있다.
 * c. 지역변수와 인스턴스변수를 구별할 때 사용한다. 
 * d. 클래스 메서드 내에서는 사용할 수 없다. 
 * 
 * 정답: b
 * 
 * 인스턴스 메서드에서만 사용 가능하다. 
 */

/*
 * 연습문제 12번 
 * 
 * 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오) 
 * 
 * a. 메서드의 이름이 같아야 한다.
 * b. 매개변수의 개수나 타입이 달라야 한다.
 * c. 리턴 타입이 달라야 한다.
 * d. 매개변수의 이름이 달라야 한다. 
 * 
 * 정답: c, d 
 * 
 * 리턴 타입과 매개변수 이름은 오버로딩에 영향을 주지 않는다. 
 */

/*
 * 연습문제 13번 
 * 
 * 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
 * 
 * long add(int a, int b) { return a+b; }
 * 
 * a. long add(int x, int y) { return x+y; }
 * b. long add(long a, long b) { return a+b; }
 * c. int add(byte a, byte b) { return a+b; }
 * d. int add(long, int b) { return (int)(a+b);
 * 
 * 정답: b, c, d 
 */

/*
 * 연습문제 14번 
 * 
 * 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오) 
 * 
 * a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
 * b. 지역변수는 반드시 초기화해야 한다.
 * c. 초기화 블럭보다 생성자가 먼저 수행된다. 
 * d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
 * e. 클래스변수보다 인스턴스변수가 먼저 초기화된다. 
 * 
 * 정답: c, e
 * 
 * 초기화 블럭이 생성자보다 먼저 수행된다.
 * 클래스변수가 인스턴스변수보다 먼저 초기화된다. 
 */

/*
 * 연습문제 15번 
 * 
 * 다음 중 인스턴스변수의 초기화 순서가 올바른 것은? 
 * 
 * a. 기본값-명시적초기화-초기화블럭-생성자
 * b. 기본값-명시적초기화-생성자-초기화블럭 
 * c. 기본값-초기화블럭-명시적초기화-생성자 
 * d. 기본값-초기화블럭-생성자-명시적초기화 
 * 
 * 정답: a 
 * 
 * 클래스변수의 초기화시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다.
 * 인스턴스변수의 초기화시점 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다. 
 * 
 * 클래스변수의 초기화순서 : 기본값 -> 명시적초기화 -> 클래스 초기화 블럭 
 * 인스턴스변수의 초기화순서 : 기본값 -> 명시적초기화 -> 인스턴스 초기화 블럭 -> 생성자
 */

/*
 * 연습문제 16번 
 * 
 * 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 * 
 * a. 자동 초기화되므로 별도의 초기화가 필요없다.
 * b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다. 
 * c. 메서드의 매개변수로 선언된 변수도 지역변수이다. 
 * d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다. 
 * e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. 
 * 
 * 정답: a, e
 * 
 * 지역변수는 자동 초기화 되지 않기 때문에 사용하기 전에 반드시 적절한 값으로 초기화를 해주어야 한다. 지역 변수는 자신이 선언된 블럭이나 메서드가 
 * 종료되면 소멸되므로 메모리 부담이 적다. 힙(heap)영역에는 인스턴스(인스턴스변수)가 생성되는 영역이며, 지역변수는 호출스택(call stack)에 생성된다.
 */

/*
 * 연습문제 17번 
 * 
 * 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
 * 
 * | println |
 * |---------|
 * | method1 |
 * |---------|
 * | method2 |
 * |---------|
 * |  main   |
 * |---------|
 * 
 * a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
 * b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다. 
 * c. method2메서드를 호출한 것은 main메서드이다. 
 * d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
 * e. main-method2-method1-println의 순서로 호출되었다.
 * f. 현재 실행중인 메서드는 println 뿐이다. 
 * 
 * 정답: b
 * 
 * 호출스택의 제일 위에 있는 메서드가 현재 수행중인 메서드이며, 호출스택 안의 나머지 메서드들은 대기상태이다. 
 */

/*
 * 연습문제 18번 
 * 
 * 다음의 코드를 컴파일 하면 컴파일 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오. 
 * 
 * class MemberCall {
 * 		int iv = 10;
 * 		static int cv = 20;
 * 
 * 		int iv2 = cv;
 * 		static int cv2 = iv; // 라인 A - 컴파일 에러 
 * 
 * 		static void staticMethod1(){
 * 			System.out.println(cv);
 * 			System.out.println(iv); // 라인 B - 컴파일 에러 
 * 		}
 * 
 * 		void instanceMethod1(){
 * 			System.out.println(cv);
 * 			System.out.println(iv); // 라인 C 
 * 		}
 * 
 * 		static void staticMethod2(){
 * 			staticMethod1();
 * 			instanceMethod1(); // 라인 D - 컴파일 에러 
 * 		}
 * 
 * 		void instanceMethod2(){
 * 			staticMethod1(); // 라인 E 
 * 			instanceMethod1();
 * 		}
 * 
 * 		정답: 라인 A, 라인 B, 라인 D 
 * 		이유: 라인 A - static변수의 초기화에 인스턴스변수를 사용할 수 없다. 꼭 사용해야한다면, 객체를 생성해야한다. 
 * 			 라인 B - static메서드에서는 인스턴스변수를 사용할 수 없다. 
 * 			 라인 D - static메서드에서는 인스턴스메서드를 사용할 수 없다. 
 */

/*
 * 연습문제 19번 
 * 
 * 다음 코드의 실행 결과를 예측하여 적으시오. 
 * 
 * class Exercise6_19
 * {
 * 		public static void change(String str) {
 * 			str += "456";
 * 		}
 * 
 * 		public static void main(String[] args)
 * 		{
 * 			String str = "ABC123";
 * 			System.out.println(str);
 * 			change(str);
 * 			System.out.println("After change:"+str);
 * 		}
 * }
 * 
 * 실행결과:
 * 
 * ABC123
 * After change:ABC123
 * 
 * 해설: change 메서드 내에서 바꿔준 str변수는 어디까지나 지역 변수이고, 바깥으로 빠져나오면서 다시 main의 "ABC123"이라고 정의되어 있는
 * 		str변수를 가리키게 된다. 
 */

