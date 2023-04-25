package variable;

class TestClass03{
	int num;	// 인스턴스 변수 >> 객체를 만든 순간 변수가 사라진다
				// 여러 메소드에서 만들때 사용한다
	public void test01() {
		num = 1000;
		int abc; 	// 지역변수 
					// 메소드 하나에서만 사용할 때 선언해서 사용
					// for문안에 int i = 0 처럼 특별한 의미가 있는것이 아닌 것은 지역변수로 사용
		System.out.println("test01 : " + num);
	}
	public void test02() {
		System.out.println("test02 : " + num);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		
		TestClass03 t = new TestClass03();
		t.test01();
		t.test02();
		
		System.out.println("static : " + TestClass04.num);
		// MainClass04에서 static으로 만든 변수 사용 가능
	}
}
