package variable;

import java.util.Scanner;

public class TestClass08 {

	/*
	 * 입력, 연산 출력 기능을 만들기
	 * 입력 : 이름, 국, 영, 수 
	 * 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급을 구하는 기능
	 * 출력 : 이름, 국, 영, 수, 합, 평균, 등급 
	 * 등급 : 평균이 90이상 A, 80이상 B, 나머지 C
	 */

	private String name, grade;
	private int kor, eng, math, sum;
	private double avg;
	Scanner scan = new Scanner(System.in);

	public void myInput() {

		System.out.print("이름을 입력하세요 : ");
		name = scan.next();
		System.out.print("국어 점수를 입력하세요 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = scan.nextInt();
	}

	public void sumScore() {
		sum = kor + eng + math;
	}

	public void avgScore() {
		avg = (kor + eng + math) / 3.0;
	}

	public void getGrade() {

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else {
			grade = "C";
		}
	}
	
	
	public void print() {
		myInput();
		sumScore();
		avgScore();
		getGrade();
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("등급 : " + grade);
	}

}
























