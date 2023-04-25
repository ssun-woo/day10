package set_get;

import java.util.Scanner;

public class LoginClass2 {
	private String id, pwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void Main() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.로그인");
			System.out.println("2.회원 가입");
			System.out.println("3.종료");
			System.out.print(">>>>>");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				login();
				break;
			case 2:
				member();
				break;
			case 3:
				exid();

			}

		}
	}

	// 회원가입
	public void member() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id2 = sc.next();
		setId(id2);
		System.out.println("비밀번호 입력 : ");
		String pwd2 = sc.next();
		setPwd(pwd2);
		System.out.println("회원가입이 완료 되었습니다.");
	}

	// 로그인
	public void login() {

		System.out.println(getId() + getPwd());
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id2 = sc.next();

		System.out.println("비밀번호 입력 : ");
		String pwd2 = sc.next();

		if (id2.equals(getId()) && pwd2.equals(getPwd())) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 다릅니다");
		}
	}

	// 나가
	public void exid() {
		System.out.println("프로그램 종료");
		System.exit(1);
	}

}