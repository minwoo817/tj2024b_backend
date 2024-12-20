package day10;

import java.util.Scanner;

/*
주제 : 회원 서비스 구현하기
	- 문법 : 변수, 입출력함수, 연산자, 제어문(조건문/반복문), 클래스(멤버변수/메소드/생성자)/객체, 배열
	- 회원은 최대 100명까지 저장할 수 있다.
	- 회원정보는 아이디, 비밀번호, 닉네임을 갖습니다.
		+ 모든 멤버변수는 private 키워드 적용한다
		+ 회원가입과 로그인시 사용되는 회원정보객체는 생성자를 활용한다.
		+ 멤버변수는 private 이므로 외부 클래스에서 호출시 getter/setter 함수를 활용한다.
	- 회원 클래스를 정의하고 회원객체 활용하여 구현한다.
	- 회원강비 함수와 로그인 함수 구현
	- 프로그램 초기 메뉴 : 1. 회원가입 2. 로그인 :
		1 선택시 : 아이디, 비밀번호, 닉네임 3개의 각 정보를 입력받아 저장하기
		2 선택시 : 아이디, 비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.
	
	// 순서
	// 1. 구현하고자하는 초기 화면 구성
	// 2. (객체) 클래스설계, 메모리 설계
	// 3. 메소드 구성

*/
public class Example4 {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Member[] members = new Member[100];
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose == 1) {
				ms.join(scan, members);
			}
			else if(choose == 2) {
				ms.login(scan, members);
			}
		}
		
	}
}
