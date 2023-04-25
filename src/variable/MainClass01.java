package variable;

/*
 클래스 변수(Class variable)
  - 클래스가 메모리에 올라가는 순간 생성된다
  - 클래스 이름으로 접근 가능하다
  - 프로그램이 실행되면 static로 만들어진 모든 것들이 생성된다
    즉, 메모리에 공간을 차지하게 되며, 사라지는 시점은
    프로그램이 종료될 때 공간이 사라진다

 객체생성 변수(instance variable)
  - 객체가 생성되어야만 사용 가능한 변수
  - 객체로 접근하여 사용한다
  - new 연산을 통해 객체를 생성할 때 변수 또는 메소드가 생성되며,
    해당 변수 또는 메소드가 사라지는 시점은 객체가 사라질 때 같이 사라진다
    객체가 사라진다는 것은 특정 지역이 종료될 때를 말한다
 	(main에서 객체를 만들었으면 main이 끝날때 같이 사라짐)
 	
 지역 변수(local variable)
  - 특정 지역에서만 사용 가능한 변수
  - 범위지정은 중괄호다
  - 메소드의 호출이 일어나면 변수가 메모리에 올라가고, 메소드가 종료되면
    자동으로 변수 또한 사라진다
   
   지역변수 < 인스턴스 변수 < 클래스 변수
 */

public class MainClass01 {
	int num;

	public static void main(String[] args) {

		int num = 100;
		if (true) {
			num = 200;
			int abc;
		}

		if (true) {
			// abc = 2000;
		}
		System.out.println(num);
		// System.out.println(abc);
		// 작은 범위(if문 안)에서 만들어진 변수는 큰 범위(main)에서 사용할 수 없음
		// 다른 if 문에서도 마찬가지로 사용할 수 없다
	}
}