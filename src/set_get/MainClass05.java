package set_get;
/*
	로그인 프로그램 만들기
		LoginClass
	 	private id, pwd, 
	 	각 setter, getter 생성 및 연산하는 기능
	MainClass
		보여지는 기능 만들기
	 	1. 로그인
	 	2. 회원가입
	 	3. 종료
*/

import java.util.HashMap;
import java.util.Scanner;

class LoginClass {
	private String id, pwd;
	private HashMap<String, String> map = new HashMap<>();

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

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

	public String inputId() {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		id = scan.next();
		return id;
	}

	public String inputPwd() {
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호 입력 : ");
		pwd = scan.next();
		return pwd;
	}

	public boolean newIdCheck(String id) {
		if (map.containsKey(id)) {
			System.out.println("이미 사용중인 아이디 입니다");
			return false;
		} else {
			System.out.println("사용 가능한 아이디 입니다");
			return true;
		}
	}

	public boolean logIdCheck(String id) {
		if (!map.containsKey(id)) {
			System.out.println("존재하지 않는 아이디 입니다");
			return false;
		} else {
			return true;
		}
	}

	public boolean logPwdCheck(String id, String pwd) {
		if (!map.get(id).equals(pwd)) {
			return false;
		} else {
			return true;
		}
	}
}

public class MainClass05 {

	public static void main(String[] args) {

		LoginClass log = new LoginClass();
		Scanner scan = new Scanner(System.in);
		String id = null, pwd = null;
		HashMap<String, String> map = log.getMap();

		while (true) {
			System.out.println("===============");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			System.out.println("===============");
			System.out.print(">>> ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-----");
				System.out.println("로그인");
				System.out.println("-----");

				id = log.inputId();

				if (log.logIdCheck(id)) {
					pwd = log.inputPwd();
					if (log.logPwdCheck(id, pwd)) {
						System.out.println(id + "님 환영합니다");
					} else {
						System.out.println("비밀번호가 일치하지 않습니다");
					}
				}
//				if(!map.containsKey(id)) {
//					System.out.println("존재하지 않는 회원입니다");
//				}else {
//					System.out.print("비밀번호 입력 : ");
//					pwd = scan.next();
//					
//					if(!map.get(id).equals(pwd)) {
//						System.out.println("비밀번호가 일치하지 않습니다");
//					}else {
//						System.out.println(id + "님 환영합니다");
//					}
//				}
				break;
			case 2:
				System.out.println("------");
				System.out.println("회원가입");
				System.out.println("------");

				System.out.println(map.keySet());
				System.out.println(map.values());
				id = log.inputId();

				if (log.newIdCheck(id)) {
					pwd = log.inputPwd();
					log.setId(id);
					log.setPwd(pwd);
					log.setMap(map);
				}
				break;

			case 3:
				System.out.println("---");
				System.out.println("종료");
				System.out.println("---");
				System.exit(1);
			default:
				System.out.println("------------");
				System.out.println("잘못된 입력입니다");
				System.out.println("------------");
				break;

			}
		}

	}
}
