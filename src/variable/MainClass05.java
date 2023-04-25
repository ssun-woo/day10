package variable;

class TestClass05{
	
	static int num;
	static {
		num = 1000;
		// static 변수는 보통 이런식으로 초기화 시킴
	}
	
	public void test() {
		System.out.println("num : " + num);
	}
	
	// int n1 = 100;
	static int n1 = 100;
	public static void test2() {
		System.out.println("n1 : " + n1 );
	}
	
	
	// static 변수 선언 후 일반 메소드안에서 사용 >> 가능
	// 일반 변수 선언 후 static 메소드안에서 사용 >> 불가능

	// static이 붙은건 항상 가장 먼저 생성되기 때문에 
	// 메소드를 만들고 변수를 만들면 사용이 불가능함
	// 사용하기 위해선 변수도 static으로 선언하면 사용 가능
	
	// 같은 이유로 main이 있는 class에선 메소드를 생성해서 사용하지 않는다
}




public class MainClass05 {

	public static void main(String[] args) {
		
	}
}
