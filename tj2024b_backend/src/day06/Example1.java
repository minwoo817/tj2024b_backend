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
		// [5] 각 사용자에게 입력받은 값들을 저장할 변수 선언
		String num1 = null; int people1 = 0;
		String num2 = null; int people2 = 0;
		String num3 = null; int people3 = 0;
		while (true) { // [1] while 반복문 
			System.out.println("====대기번호 발행====");
			System.out.println("1.등록 2. 출력"); // [2] 출력함수, print()
			Scanner scan = new Scanner(System.in); 
			int menu = scan.nextInt(); // [3] 입력함수, Scanner 객체 필요, nextInt()함수 이용하여 정수 타입을 입력받아 정수 타입 변수에 저장했다.
			// [4] 조건문, if(흐름조건), 입력받은 값(메뉴선택)에 따른 흐름제어(1이면, 2이면)
			if(menu == 1) { System.out.println(">>>>대기명단 등록>>>>");
				// [5] 각 사용자에게 필요한 데이터 입력받기
				System.out.println("전화번호 : ");
				String phonenum = scan.next();
				System.out.println("인원수 : ");
				int peoplenum = scan.nextInt();
				// [6] 만약에 비어있는 명단이 있으면 각 입력받은 데이터를 비어있는 곳에 대입하기 , 비어있다. 문자열이면 null, 숫자이면 0 판단, 임의판단
				if(num1 == null) {num1 = phonenum; people1 = peoplenum;}
				else if(num2 == null) {num2 = phonenum; people2 = peoplenum;}
				else if(num3 == null) {num3 = phonenum; people3 = peoplenum;}
				else {System.out.println("등록실패");}
			}
			else if(menu == 2) { System.out.println(">>>>대기명단 출력>>>>");
			// [7] 만약에 비어있지 않으면(면단이 있으면) 각각 변수값 출력하기
				if(num1 != null) {System.out.println("전화번호 : "+num1+"인원수 : "+people1); }
				if(num2 != null) {System.out.println("전화번호 : "+num2+"인원수 : "+people2); }
				if(num3 != null) {System.out.println("전화번호 : "+num3+"인원수 : "+people3); }
			}
			
		}
		
		
	}
}
