package set_get;

/*
 this
  - 클래스 자기 자신의 주소를 저장하고 있는 변수
  - 메소드의 0번째 매개변수로 자동으로 만들어져있다
 */


class TestClass01{
	int num = 100;
	public void test() {
		int age;
		System.out.println("this : " + this);
		this.num = 200;
		num = 2222;
	}
	
	public void test2() {
		
		int num = 12345;
		System.out.println(num);
		// 일반적으로 변수는 더 가까운 값을 인지한다
		
		System.out.println(this.num);
		// this를 사용하면 밖에 보이는 즉, 외부에 노출된 값이 보인다
	}
	
}

public class MainClass01 {
	
	public static void main(String[] args) {
		
		TestClass01 t = new TestClass01();
		
		System.out.println(t);
		// 't'는 해당하는 객체가 갖고 있는 정보(주소)
		// 그 주소를 참조하면 객체가 보임
		
		t.test();
		// t.을 사용하면 외부적으로 보이는 것들만 보임(test안에 age는 안보임)
		// 출력해보면 위의 주소와 일치함 
		
		t.test2();
		
		
		
	}
}
