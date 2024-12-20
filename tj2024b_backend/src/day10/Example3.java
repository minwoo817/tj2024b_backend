package day10;

public class Example3 {
	public static void main(String[] args) {
		
		// [1] Dto 객체 생성하기
		BoardDto board = new BoardDto();
			// - title 멤버변수는 private 이므로 오류 발생
		// board.title = "안녕";
		board.setTitle("안녕");
		
			// - title 멤버변수는 private 이므로 오류 발생
		// System.out.println(board.title);
		System.out.println(board.getTitle());
		
			// toString 함수를 재정의하지 않았다면 주소값 출력
			// toString 함수를 재정의했다면 toString 함수의 리턴값 출력
		System.out.println(board);
		
	}
}
