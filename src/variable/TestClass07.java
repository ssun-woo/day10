package variable;

import java.util.Scanner;

public class TestClass07 {
	Scanner scan = new Scanner(System.in);
	private int age;
	private String name;
	
	public void display() { // 메소는 보편적으로 public으로 사용한다
		
//		System.out.print("이름 입력 : ");
//		name = scan.next();
//		
//		System.out.print("나이 입력 : ");
//		age = scan.nextInt();
//		
//		age = age -1;
//		
//		System.out.println("이름 : " + name);
//		System.out.println("만나이 : " + age);
		
		/*
		 입력, 출력, 나이 만으로 연산하는 각각의 기능을 만드세요
		 변수는 인스턴스 변수로 변경하여 사용하세요 
		 */
	}
	
	
	public void input() {
		System.out.print("이름 입력 : ");
		name = scan.next();
		
		System.out.print("나이 입력 : ");
		age = scan.nextInt();
	}
	
	public void mAge() {
		age = age -1;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("만나이 : " + age);
	}
	
	
	
	
}























