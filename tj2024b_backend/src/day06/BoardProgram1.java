package day06;
import java.util.Scanner;

/*
  실습 1: 게시판 프로그램
  	- 제목, 내용, 작성자를 입력받아 저장/출력/삭제/수정 구현
  	- 문법 : 변수, 연산자, 제어문(조건문/반복문) 
  	- 게시물 3개 저장하기. 게시물 1개당 제목/내용/작성자 저장소(변수) 3개 필요. ,게시물 3 --> 변수 9개 필요.
*/

public class BoardProgram1 {

	public static void main(String[] args) {
		// [6-1] 변수 선언, 타입[boolean byte short int long float double], 참조타입[String, Scanner 등등]
		String 제목1 = null; String 내용1 = null; String 작성자1 = null; // null이란? 참조값이 없다는 뜻. 문자열이 없다는 뜻
		String 제목2 = null; String 내용2 = null; String 작성자2 = null;
		String 제목3 = null; String 내용3 = null; String 작성자3 = null;
		
		while (true) { // [1] 반복문 // 무한루프 
			// [2] 출력함수, syso 자동완성
			System.out.println("====게시판 프로그램====");
			System.out.println("1.등록 2.출력 3.수정 4.삭제: ");
			// [3] 입력함수	
				// - 입력객체 : Scanner 변수명 = new Scanner(System.in); 
			Scanner scan = new Scanner(System.in);
				// - 입력객체 이용한 입력함수 : 변수명.nextXXX();
			int 선택메뉴 = scan.nextInt(); // - 우리가 정의한 메뉴번호 선택받기
			
			// [4] 연산자, == 같다
			// [5] 조건문, if(조건문){ }
			if(선택메뉴 == 1) { System.out.println(">> 1. 등록 선택했습니다.");
				System.out.println("> 제목 : "); String title = scan.next();
				System.out.println("> 내용 : "); String content = scan.next();
				System.out.println("> 작성자 : "); String writer = scan.next();
				// [7-1] 변수값에 따른 데이터검사 후 대입 // 첫번째 게시물이 비어있으면 // [6-2] 변수값 수정
				if(제목1 == null) {제목1 = title; 내용1 = content; 작성자1 = writer; } // - while 밖에 변수에 저장 
				else if(제목2 == null) {제목2 = title; 내용2 = content; 작성자2 = writer; }
				else if(제목3 == null) {제목3 = title; 내용3 = content; 작성자3 = writer; }
				else { System.out.println("등록실패");}
				
			}
			else if(선택메뉴 == 2) { System.out.println(">> 2. 출력 선택했습니다.");
			// [7-2] 변수값에 따른 데이터 검사 후 출력 // [6-3] 변수값 호출 // +연결연산자 : "문자열"+변수명
			if(제목1 != null) {System.out.println("> 제목 : "+ 제목1+"> 내용 : " + 내용1+"> 작성자 : " + 작성자1); }
			if(제목2 != null) {System.out.println("> 제목 : "+ 제목2+"> 내용 : " + 내용2+"> 작성자 : " + 작성자2); }
			if(제목3 != null) {System.out.println("> 제목 : "+ 제목3+"> 내용 : " + 내용3+"> 작성자 : " + 작성자3); }
			
			// 오류가 발생하는 이유 : 변수의 초기값(초음에 변수 만들때 값을 넣는 행위-초기화) 없다. // - 지역변수가 초기값이 없으면 호출이 불가능하다.// 
			}
			else if(선택메뉴 == 3) { System.out.println(">> 3. 수정 선택했습니다.");}
			else if(선택메뉴 == 4) { System.out.println(">> 4. 삭제 선택했습니다.");}
		}

	}

}
