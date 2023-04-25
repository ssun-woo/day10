package set_get;

class TestClass03 {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
		// 해당하는 변수의 값을 받아 설정한다
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class MainClass03 {

	public static void main(String[] args) {

		TestClass03 t = new TestClass03();
		t.setName("홍길동");
		System.out.println(t.getName());

		t.setAge(20);
		System.out.println(t.getAge());

	}
}
