package set_get;

class TestClass02{
	private int age;
	
	public void setAge(int age) {
		this.age = age - 1;
	}
	
	public void printAge() {
		System.out.println(age);
	}
}

public class MainClass02 {

	public static void main(String[] args) {
		
		
		TestClass02 t = new TestClass02();
		t.setAge(20);
		t.printAge();
		// 일반적으로 실행하면 값이 0이 나옴
		// 변수는 일반적으로 가까운걸 이용하기 때문에 setAge의 age는 ()안에 값을 사용
		// printAge는 밖에있는 private int age를 사용
		// 자기 자신을 바꾸기 위해선 this 사용
		// this.age = age - 1;
		
		// 변수 이름을 바꾸면 this를 사용할 필요 X
		// age = a - 1 ;
		
		
		
		
		
	}
}
