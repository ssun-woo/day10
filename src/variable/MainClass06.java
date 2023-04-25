package variable;

class TestClass06{
	private int num = 100;
	// 은닉화 시켜서 외부에서 접근이 안되게 만듦
	
	public void test() {
		num = 1111;
	}
	
	public void test2() {
		System.out.println(num);
	}
	
	public static final String KOREA = "대한민국";
	// final >> 해당하는 변수에 값이 지정되면 변수에 대한 값을 변경할 수 없다
	
	public static final String PATH = "C드라이브 특정위치";
	
	
}


public class MainClass06 {
	
	static int num = 100;
	
	public static void main(String[] args) {
		
		TestClass06 t = new TestClass06();
		
		t.test();
		t.test2();
		// num 값은 private로 선언됐기 때문에 
		// 같은 class 내부에서 접근해서 사용해야 한다
		
		System.out.println(num);
		System.out.println(TestClass06.PATH);
		// 한번 지정하면 어디서든 변함없이 사용할 수 있음
		
		// TestClass06.PATH = "aaa";
		
	}
	
	
	
	
	
}
