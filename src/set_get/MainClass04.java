package set_get;

class TestClass04 { // 캡슐화

	// 은닉확
	private String name, addr;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class MainClass04 {
	public static void main(String[] args) {

		TestClass04 t = new TestClass04();

		System.out.println(t.getAddr());
		System.out.println(t.getAge());
		System.out.println(t.getName());

	}
}

































