package variable;

class TestClass02{
	
	int test = 1111;
	public int test01() {
		int num = 100;
		System.out.println("test01 : " + num);
		System.out.println("test01 : " + test);
		return num;
	}
	
	public void test02(int num) {
		System.out.println("test02 : " + num);
		System.out.println("test02 : " + test);
	}
	
	// class 내부에서도 마찬가지다
}


public class MainClass02 {
	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02();
		
		int num = t.test01();
		
		t.test02(num);
	}
}
