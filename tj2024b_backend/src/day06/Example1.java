package day06;

import java.util.Scanner;

/*
자바 과제3: 대기번호 발행 프로그램
	- 전화번호, 인원수를 입력받아 저장/출력 구현
	- 문법 : 변수, 연산자, 제어문(조건문/반복문) 
	- 총 대기명단 3개까지 가능. 대기명단 1개당 전화번호, 인원수 저장소(변수) 2개 필요. ,대기명단 3 --> 변수 6개 필요.
*/
public class Example1 {

	public static void main(String[] args) {
		String num1 = null; String people1 = null;
		String num2 = null; String people2 = null;
		String num3 = null; String people3 = null;
		while (true) {
			System.out.println("====대기번호 발행====");
			System.out.println("1.등록 2. 출력");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.println("전화번호 : ");
				String phonenum = scan.next();
				System.out.println("인원수 : ");
				String peoplenum = scan.next();
				if(num1 == null) {num1 = phonenum; people1 = peoplenum;}
				else if(num2 == null) {num2 = phonenum; people2 = peoplenum;}
				else if(num3 == null) {num3 = phonenum; people3 = peoplenum;}
				else {System.out.println("등록실패");}
			}
			else if(menu == 2) {
				if(num1 != null) {System.out.println("전화번호 : "+num1+"인원수 : "+people1); }
				if(num2 != null) {System.out.println("전화번호 : "+num2+"인원수 : "+people2); }
				if(num3 != null) {System.out.println("전화번호 : "+num3+"인원수 : "+people3); }
			}
			
		}
		
		
	}
}
