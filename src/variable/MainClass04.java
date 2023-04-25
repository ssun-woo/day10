package variable;

class TestClass04 {
	
	// int num = 1000; // 인스턴스 변수
	static int num = 1000; // 클래스 변수
	int abc;
	
	public void test1() {
		test2();
		abc = 100;
	}
	
	public void test2() {
		
	}
}



public class MainClass04 {
	
	int num = 222;
	
	public static void main(String[] args) {
		
		TestClass04.num = 4444;
		// 인스턴스 변수는 이렇게 사용불가능
		// 인스턴스 변수는 사용하려면 반드시 객체를 생성해야함
		// 하지만 클래스변수(static)을 사용하면 언제든지 생성 가능
		
		System.out.println(TestClass04.num);
		
		// test();
		// num = 100;
		
		// main클래스 안에서는 이렇게 사용 불가능
		// main클래스는 static으로 만들어짐 
		// 하지만 다른 메소드나 변수들은 static이 아니기 때문에 사용불가능
	}
	
	public void test() {
		System.out.println("test");
	}
	
}
