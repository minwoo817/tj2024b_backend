package day10;

import java.util.Scanner;

public class BoardService {
	// 클래스 멤버
	// 1. 멤버변수
	// 2. 생성자
	// 3. 메소드/멤버함수
		// 1. 등록함수 boardAdd, 실행조건 : 주메뉴에서 1 입력시, 매개변수 : 입력객체/게시물목록[], 반환값: 없음
	void boardAdd(Scanner scan, Board[] boards){
		System.out.println("제목 : "); String title = scan.next();
		System.out.println("내용 : "); String content = scan.next();
		System.out.println("작성자 : "); String writer = scan.next();
		// **************** 생성자를 이용한 객체 생성 *************** //
		Board board = new Board(title, content, writer);
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
		// 2. 출력함수 boardPrint, 실행조건 : 주메뉴에서 2 입력시, 매개변수 : 게시물목록[], 반환값: 없음
	void boardPrint(Board[] boards){
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] != null) {
				System.out.printf("제목 : %s, 내용 : %s, 작성자 : %s\n", boards[i].title, boards[i].content, boards[i].writer);
			}
		}
	}
	
}
