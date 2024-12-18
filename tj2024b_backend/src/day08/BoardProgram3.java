package day08;
/*
실습3 : 게시판 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체, 배열
	- 제목 , 내용 , 작성자 를 입력받아서 저장/출력 구현
	- 게시물 클래스 설계 하기.
	- 게시물 최대 100개 저장 하기 , 게시물1개당 객체 1개 필요 , 객체1개당 3개의 멤버변수를 갖는다.
*/

import java.util.Scanner;
// (1) main 함수를 갖는 실행 클래스로 사용
public class BoardProgram3 {
	public static void main(String[] args) {
	
		// [5] 클래스 정의하기, 게시물 타입 만들기
		// + 동일한 클래스의 서로 다른 객체를 저장하기 위한 배열 선언하기
		// int[] arr1 = new int[100]; 
		// 초기화를 하지 않고 int(정수) 타입의 서로 다른 정수값 100개 저장 가능한 배열 선언, 정수 0이 100개 생성
		Board[] boardArray = new Board[100];
		// 초기화를 하지 않고 Board(게시물) 타입의 서로 다른 객체값 100개 저장 가능한 배열 선언, null이 100개 생성
		
		while(true) { // [1] 반복문
			
			System.out.println("1.등록 2.출력 : "); // [2] 출력함수
			Scanner scan = new Scanner(System.in); // [3] 입력객체
			int choose = scan.nextInt(); // [3] 입력함수
			if(choose == 1) { // [4] 조건문
				System.out.println(">> 등록 선택했습니다.");
				// [6] 키보드로 3개의 정보 입력받기
				System.out.println("> 제목: "); String title = scan.next();
				System.out.println("> 내용: "); String content = scan.next();
				System.out.println("> 작성자: "); String writer = scan.next();
				// [7] 입력받은 3개의 정보를 하나의 객체로 만들기
				Board board = new Board();
				board.title = title; // - 객체내 멤버변수 접근하여 멤버변수값 수정
				board.content = content; // 변수명.멤버변수명
				board.writer = writer; // .접근연산자
				// [8] 객체를 배열에 저장, 빈 공간을 찾아서 빈공간에 젖아하기
					// * 배열내 빈공간 찾기(여러개[배열]중에서 원하는 값 찾기, 비교, == 같다)
				// 8-3 : for문 실행한 결과를 저장하는 변수
				boolean saveState = false;
				for(int index = 0; index <=boardArray.length - 1; index++) {
					// 8-1 : index는 0부터 마지막 인덱스까지 1씩 증가하면서 반복처리
					if(boardArray[index]==null) {
						// 8-2 : 배열내 index번째 요소가 null이면, 게시물이 없으면
						boardArray[index] = board; // 해당 인덱스에 새로 만든 (게시물)객체 대입
						saveState = true; // - 저장 여부 상태 변경
						break; // - 가장 가까운 반복문 종료
					}
				}
				if(saveState == true) {System.out.println(">등록 성공 했습니다.");}
				else {System.out.println(">등록 실패 했습니다.");}
			}
				else if (choose == 2) {
				System.out.println(">> 출력 선택했습니다.");
				
				// [10] 배열내 모든 요소(게시물 객체)를 출력하기, 빈 공간이 아니면(!=null)
				for(int index = 0; index<=boardArray.length-1; index++) {
					if(boardArray[index] != null) {
						Board board = boardArray[index];
						System.out.printf("순번 : %d, 제목 : %s, 내용 : %s, 작성자 : %s \n", index, board.title, board.content, board.writer);
					}
				}
			}
			
		}
		
		
	}
}